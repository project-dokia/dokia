# Errors
Falta certificado
{
error_description: "OpenID Connect client returned with status: SEND_401",
error: 401
}

# Retornos:
203 Non-Authoritative Information
This response code means returned meta-information set is not exact set as available from the origin server, but collected from a local or a third party copy. Except this condition, 200 OK response should be preferred instead of this response.

Error 403: AuthorizationFailed

[ERROR   ] CWWKS1744E: The current state [001509289726289qAfaplz00] of a response to the OpenID Connect client [MDY3MGVlZDUtZDViOS00] is not valid. The state value is either expired or has already been used.
{"error_description":"OpenID Connect client returned with status: SEND_401","error":401}

400 Bad Request
The server cannot or will not process the request due to an apparent client error (e.g., malformed request syntax, size too large, invalid request message framing, or deceptive request routing).[32]
401 Unauthorized (RFC 7235)
Similar to 403 Forbidden, but specifically for use when authentication is required and has failed or has not yet been provided. The response must include a WWW-Authenticate header field containing a challenge applicable to the requested resource. See Basic access authentication and Digest access authentication.[33] 401 semantically means "unauthenticated",[34] i.e. the user does not have the necessary credentials.
Note: Some sites issue HTTP 401 when an IP address is banned from the website (usually the website domain) and that specific address is refused permission to access a website.
402 Payment Required
Reserved for future use. The original intention was that this code might be used as part of some form of digital cash or micropayment scheme, as proposed for example by GNU Taler[35], but that has not yet happened, and this code is not usually used. Google Developers API uses this status if a particular developer has exceeded the daily limit on requests.[36] Stripe API uses this code for errors with processing credit cards.[37]
403 Forbidden
The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource, or may need an account of some sort.

400 Bad Request
This response means that server could not understand the request due to invalid syntax.
401 Unauthorized
Although the HTTP standard specifies "unauthorized", semantically this response means "unauthenticated". That is, the client must authenticate itself to get the requested response.
402 Payment Required
This response code is reserved for future use. Initial aim for creating this code was using it for digital payment systems however this is not used currently.
403 Forbidden
The client does not have access rights to the content, i.e. they are unauthorized, so server is rejecting to give proper response. Unlike 401, the client's identity is known to the server.
404 Not Found
The server can not find requested resource. In the browser, this means the URL is not recognized. In an API, this can also mean that the endpoint is valid but the resource itself does not exist. Servers may also send this response instead of 403 to hide the existence of a resource from an unauthorized client. This response code is probably the most famous one due to its frequent occurence on the web.


