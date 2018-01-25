# !/bin/sh

# this script take a config file as input to read the following parameters:
#   tenant=[prepiam.toronto.ca.ibm.com | idaas.iam.ibm.com]
#   client_id=clientxxx
#   client_secret=secretyyy
#   redirect_uri=https://localhost
#   username=userid@mail.com
#   password=passw0rd
#
# this script requires python, grep, cut, awk
# 
# author: Ming Lu <mlu@us.ibm.com>
# 
# Changelog:
# 0.1   03/14/2016 Initial Drop
# 0.2   04/26/2016 Added cURL command print out
# 0.3   04/27/2016 Added padding to the encoded ID token 
# 0.4   04/30/2016 Added error handling to print out response message

##################################
# Global Variables
##################################

# Default CURL command options
CURL_CMD="curl -k -H 'Accept: application/json' -H 'Cache-Control: no-cache'"
response_msg=''

##################################
# Functions
##################################

# Function usage
#
#  print out usage
function usage 
{
    echo "Usage: testapi.sh --config=<configuration_file>"
}

# Function timestamp
#
#  print out timestamp
function timestamp {
  printf "\nTimestamp: "
  date +"%T%n"
}

# Function rest_call
#
#  make REST API call
#
#  $1 response_msg
#  $2 method
#  $3 url
#  $4 content-type
#  $5 ba header
#  $6 payload
#  $7 cookies
#  $8 special write-out

function rest_call {

    optw=" -w \" statusCode:%{http_code} \""
    optc=""
    optd=""
    optb=""
    optt=""

    # do we need special wirte-out ?
    if [ ! -z "$8" ]; then 
        optw=" -w $8"
    fi

    if [ ! -z "$7" ]; then
        optc=" -b $7 -c $7 "
    fi

    if [ ! -z "$6" ]; then
        optd=" -d '$6'"
    fi

    if [ ! -z "$5" ]; then 
        optb=" --user $5 "
    fi

    if [ ! -z "$4" ]; then 
        optt=" -H 'Content-Type: $4'"
    fi

    cmdline="$CURL_CMD -sS -X $2 $optw $optc $optd $optb $optt $3"

    printf "\n*cURL command:\n------------------------------------\n"
    echo "$CURL_CMD -X $2 $optc $optd $optb $optt $3"

    start_time=$(date +%s)
    result="$(eval $cmdline)"
    end_time=$(date +%s)
    printf "\nexecution time: $(expr $end_time - $start_time) seconds"
    printf "\n--------------------------------\n"

   
    eval "$1='$result'"

}



# Function print_response
#
#  check response result
#  if error or in verbose mode
#  print out response message
#  
#  The argument will be in format of:
#  response_msg statusCode:xxx
#
function print_response {

# save the whole arguments

  msg="$@"

# get the last argument, which is statusCode:xxx
  for last; do true; done
  http_code=$last

# obtain the numerical value of the status code 
  statusCode=$(echo $http_code | awk -F: '{print $NF}')

  printf "\n expected HTTP Status Code is $1 "
  printf "\n actual   HTTP Status Code is $statusCode\n"

# compare expected and actual status code
# if not match, print out error message
# some API failure may not affect subsequent
# test, so leave it for caller to decide
# whether stop or not

  if [ "$statusCode" != "$1" ]; then
    printf "\nERROR: response message is \n"
    echo $msg|awk -FstatusCode '{print $1}' | awk '{$1=""; print $0}'
    return -1
  fi

# in verbose mode, print out response message

  if [ "$verbose" == "True" ]; then
    printf "\nverbose: response message is \n"
    echo $msg|awk -FstatusCode '{print $1}' | awk '{$1=""; print $0}'
    printf "\n"
  fi

  return 0
}



##############################
# Main
##############################

if [ $# == 0 ]; then
    usage
    exit 1
fi


while :;
do
    case $1 in
        -h|-\?|--help) 
            usage
            exit 1
            ;;
        --config=?*)
            config=${1#*=}
            # TODO: validate config file
            source $config
            ;;
        -v|--verbose)
            verbose=True
            ;;
        *)
            break
    esac
    shift
done


# check required parameters

printf "\n\n==== test starts ====\n\n"
timestamp

if [ -z $tenant ] || [ -z $client_id ] || [ -z $client_secret ] || [ -z $redirect_uri ] ||  [ -z $username ]  ||  [ -z $password  ]; then 
    printf "required parameter is missing from the $config\n"
    printf "you must specify: tenant, client_id, client_secret, redirect_uri, username and password \n"
    printf "for a full round of tests"
    exit 1
else 
    printf "\n=== load parameters ====\n"
    printf "tenant is $tenant\n"
    printf "client_id is $client_id\n"
    printf "redirect_uri is $redirect_uri\n"
    printf "username is $username\n"
    printf "=== load parameters done ====\n"
fi

rm -f cookies

# test direct login API

printf "\n ***************************** \n"
printf "\n * direct login API exercise * \n"
printf "\n ***************************** \n"

printf "\n ==> Request: Initialize login service \n"

rest_call response_msg "GET" "https://$tenant/idaas/mtfim/sps/apiauthsvc?PolicyId=urn:ibm:security:authentication:asf:basicldapuser" "application/json" "" "" cookies

print_response 200 $response_msg

# if we cannot login, bail out
if [ $? != 0 ]; then 
    exit -1 ; 
fi

state=$(echo "$response_msg" | awk -FstatusCode '{print $1}'|python -c 'import sys,json; print json.load(sys.stdin)["state"]')

printf "\n <=== Result: Login service id is : $state\n\n"
printf "\n ===> Request: Login \n"

rest_call response_msg "PUT" "https://$tenant/idaas/mtfim/sps/apiauthsvc?StateId=$state" "application/json" "" "{\"username\":\"$username\",\"password\":\"$password\"}" cookies 

print_response 204 $response_msg

if [ $? != 0 ]; then 
    printf "\n <=== Response: Login failed \n"
    exit -1 ; 
fi


# if success, test userinfo API
printf "\n <=== Response: Login success \n"

printf "\n ***************************** \n"
printf "\n * userinfo     API exercise * \n"
printf "\n ***************************** \n"

printf "\n ===> Request: Get user information \n"

rest_call response_msg "GET" "https://$tenant/v1/mgmt/idaas/user" "application/json" "" "" cookies

print_response 200 $response_msg

if [ $? != 0 ]; then 
    echo "cannot get user information"
    exit -1 ; 
fi

printf "\n <=== Response: user information is: \n\n"

echo $response_msg | grep emails| awk -FstatusCode '{print $1}' | python -m json.tool

# test /authorize endpoint

printf "\n ***************************** \n"
printf "\n * Authorization Code flow   * \n"
printf "\n ***************************** \n"

printf "\n ===> Request: request authorization code from /authorize endpoint \n"

rest_call response_msg "POST" "https://$tenant/idaas/oidc/endpoint/default/authorize" "application/x-www-form-urlencoded" "" "response_type=code&scope=openid&client_id=$client_id&redirect_uri=$redirect_uri" cookies "\" %{redirect_url} statusCode:%{http_code} \""

print_response 302 $response_msg

if [ $? != 0 ]; then 
    echo "cannot get authorization code"
    exit -1 ; 
fi

# need to remove the trailing statusCode 
code=$(echo $response_msg | awk -FstatusCode '{print $1}'| awk -F= '{print $3}'|cut -c1-30)

printf "\n <=== Response: \n"
printf "\n     authorize code is $code\n"


# test /token endpoint with authorization code grant type

printf "\n===> Request: request access token and ID token based on authorization code from /token endpoint: \n"

rest_call response_msg "POST" "https://$tenant/idaas/oidc/endpoint/default/token" "application/x-www-form-urlencoded" "$client_id:$client_secret" "grant_type=authorization_code&code=$code&redirect_uri=$redirect_uri"

print_response 200 $response_msg

if [ $? != 0 ]; then
    exit -1
fi

printf "\n<=== Response: token response\n"

tokens=$(echo $response_msg| awk -FstatusCode '{print $1}'| grep access_token)

printf "\nresponse payload is \n"
echo $tokens | python -c 'import json,sys; print json.dumps(json.load(sys.stdin), sort_keys=True, indent=4, separators=(",",":"))'

access_token=$(echo $tokens|python -c 'import json,sys; print json.load(sys.stdin)["access_token"]')
refresh_token=$(echo $tokens|python -c 'import json,sys; print json.load(sys.stdin)["refresh_token"]')
id_token=$(echo $tokens|python -c 'import json,sys; print json.load(sys.stdin)["id_token"]' | awk -F. '{print $2}')
printf "\n decoded ID token is: \n"
# add padding 
printf "$id_token===" | base64 -D | python -m json.tool
printf "\n access token is:  $access_token"
printf "\n refresh token is: $refresh_token"
printf "\n"


# test refresh_token 


printf "\n ***************************** \n"
printf "\n * Refresh token flow        * \n"
printf "\n ***************************** \n"

printf "\n===> Request: refresh token \n"

rest_call response_msg "POST" "https://$tenant/idaas/oidc/endpoint/default/token" "application/x-www-form-urlencoded" "$client_id:$client_secret" "grant_type=refresh_token&refresh_token=$refresh_token&scope=openid"

printf "\n<=== Response:\n"

print_response 200 $response_msg

if [ $? != 0 ]; then
    printf "Could not refresh token. \nIf you do not have 'refresh token' grant type assigned to your client, this is an expected result."
else
    tokens=$(echo $response_msg | awk -FstatusCode '{print $1}' | grep access_token)

    echo $tokens | python -m json.tool
fi

printf "\n"

# test /token endpoint with password grant type

printf "\n ***************************** \n"
printf "\n * Password grant type       * \n"
printf "\n ***************************** \n"

printf "\n===> Request: request token based on password grant type \n"

rest_call response_msg "POST" "https://$tenant/idaas/oidc/endpoint/default/token" "application/x-www-form-urlencoded" "$client_id:$client_secret" "grant_type=password&username=$username&password=$password&scope=openid" 

printf "\n<=== token response: \n" 

print_response 200 $response_msg

if [ $? != 0 ]; then
    printf "    Could not get a token from password grant type. \nIf your client does not have password grant type enabled, this is the expected result"
else
    tokens=$(echo $response_msg|awk -FstatusCode '{print $1}'| grep access_token)

    echo $tokens | python -m json.tool

    access_token=$(echo $tokens| python -c 'import sys,json; print json.load(sys.stdin)["access_token"]')

# test /introspect endpoint
    printf "\n===> Request: test /introspect endpoint with token from password grant type\n"

    rest_call response_msg "POST" "https://$tenant/idaas/oidc/endpoint/default/introspect" "application/x-www-form-urlencoded" "$client_id:$client_secret" "token=$access_token" 


    printf "\n<=== Response: introspect response\n"

    print_response 200 $response_msg
 
    if [ $? != 0 ]; then
        printf "\nfailed to introspect the token\n"
        exit -1
    fi

    printf "\nIntrospection result:\n"

    echo $response_msg | awk -FstatusCode '{print $1}' | python -m json.tool
fi


printf "\n ********************************* \n"
printf "\n * client credentials grant type * \n"
printf "\n ********************************* \n"

printf "\n===> Request: request token based on client credentials grant type \n"

rest_call response_msg "POST" "https://$tenant/idaas/oidc/endpoint/default/token" "application/x-www-form-urlencoded" "$client_id:$client_secret" "grant_type=client_credentials&scope=openid" 


print_response 200 $response_msg

if [ $? != 0 ]; then
    printf "\n<=== Response:\n"
    printf "\n    Could to obtain token from client_credential grant type. \nIf your client does not have client_credentials grant type enabled, this is the expected result.\n"
    exit -1
else 
 
    access_token=$(echo $response_msg| awk -FstatusCode '{print $1}' | python -c 'import sys,json; print json.load(sys.stdin)["access_token"]')

    printf "\n<=== Response: response access token is $access_token\n"

# test /introspect endpoint

    printf "\n===> Request: test introspect endpoint with token from client_credentials grant type\n"

    rest_call response_msg "POST" "https://$tenant/idaas/oidc/endpoint/default/introspect" "application/x-www-form-urlencoded" "$client_id:$client_secret" "token=$access_token" 

    printf "\n<=== Response: introspect response\n"

    print_response 200 $response_msg

    printf "\n<=== Response:\n"
    if [ $? != 0 ]; then 
        printf "\n    Introspection call failed.\n"
    else 
        printf "\nIntrospection result:\n"
        echo $response_msg | awk -FstatusCode '{print $1}' |python -m json.tool
    fi
fi


# clean up cookies
rm -f cookies

timestamp
printf "\n=== test completed ===\n"

