package br.ibm.com.test.json;

import java.io.IOException;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import ibm.com.dokia.dao.model.UserW3idToken;

public class JsonTest {
	
	@Test
	public void testObject() {
		//GET /auth payload=
		String str = "{\"sub\":\"thiagoc@br.ibm.com\",\"at_hash\":\"QN-6pvMTHwMnoaB4ItjmdA\",\"realmName\":\"W3IDRealm\",\"iss\":\"https://w3id.sso.ibm.com/isam\",\"aud\":\"OWY3ZTYxNGQtNWE1Ny00\",\"exp\":1510605372,\"iat\":1510598172,\"nbf\":1510598052,\"emailAddress\":\"thiagoc@br.ibm.com\",\"lastName\":\"Thiago\",\"blueGroups\":[\"IBMLinuxUsers\",\"All-Others-NonLenovo\",\"BSO-IN_AMS_IGS_INDIA\",\"KView%20Authors-BCS-WW\",\"ECM_KView_Guests\",\"CIO-TechLeadershipCouncil\",\"ITSAS%20General%20Access%201\",\"user%20-%20perf\",\"com.ibm.tap.bravo.user.division\",\"com.ibm.tap.bravo.user\",\"com.ibm.tap.am.bravo\",\"BSORCH_STG_DEV\",\"w3km-QualityManagers-users-dynamic\",\"BICOC_PROD_CIRATS_USERS\",\"EOD_CC_Cognos_Group\",\"EOD_BICC_DEV_COGNOS_GRP\",\"ECM_Cognos_Users\",\"BI_PG_BACC_PROD\",\"EOD_BICC_DEV_CS_GRP_V10\",\"EOD_BICC_TST_CS_GRP_V10\",\"NUTHIS\",\"voiceriteclient5\",\"VoiceRiteClientAll\",\"Singapore_Group\",\"RCMS\",\"DSTCloudUser\",\"MTS%20Gateway\",\"SUT_Users\",\"QMKE%20Community\",\"TSRM%20COGNOS\",\"All_IBM_Account_RTC_JazzUsers\",\"All_IBM_Account_RQM_JazzUsers\",\"IBMLinuxWindowsVMUsers\",\"GBS_BR_Users\",\"IBMLinuxRationalUsers\",\"LMCMTSBR\",\"Non-Rational\",\"Radical-Wiki-Capilano-users\",\"Radical-Wiki-cdi-users\",\"Radical-Wiki-Common-users\",\"Radical-Wiki-SDP-users\",\"Radical-Wiki-Capilano-users-dynamic\",\"mac\",\"Rational%20Strategy%20%26%20Roadmap%20Readers\",\"dstliquid_jazzusers\",\"LMCAndroidBR\",\"ibm_softphone\",\"BT%20IT%20Games%20Event%20II\",\"FOA%20Lounge\",\"All_IBM_Account_RRC_JazzUsers\",\"RCMS_TEST\",\"stg1\",\"HW%20Alerts%20DivDept\",\"OneISC%20Viewer%201\",\"CIO%20Run%20-%20GTS%20Brazil\",\"GeoLocationAdmin\",\"ActiveTEMMobileUsers\",\"ITM_TEMS\",\"Maximo_TSS\",\"LIS%20Regular%20Not%20US%20CA%20JP%20CN%20IN\",\"legalibm\",\"MSGv4\",\"com.ibm.v8.all.a-h\",\"AO_CRA\",\"vpmembers\",\"CONTROLE_PROJETOS\",\"CONTROLE_PROJETOS_UPDATE\",\"HRMS_employees_lpd_LA\",\"SAS_Initial_Deploy\",\"imcmacvpn\",\"LATechnical\",\"C4_CRASHPLAN_A\",\"C4_CRASHPLAN_MASTER\",\"ww-github\",\"ww-murally\",\"SC_PROXY_08_GROUP\",\"W3_SSO_AHE_Adopters\",\"futureIBMsupport\",\"WIN_VM_MAC_MASTER\",\"MS_WIN8_MAC\",\"VM_FUSION_PRO8_MAC\",\"BTIT%20Team\",\"SHPS_ADMIN_DEV\",\"w3id-oidc-adopters-techcontacts\",\"w3id-saml-adopters-techcontacts\",\"SHPS_DEV\",\"TSS%20Jedis\",\"ww-slack-cio-la\",\"ww-slack-all\",\"ww-slack-ciola\",\"Brazil_test_group\",\"OneSearchBeta\",\"w3id-saml-adopters-techcontacts-dev\",\"blueid-adopters-techcontacts-preprod\",\"blueid-adopters-techcontacts-preprod-dev\",\"Latin_America_group\",\"non-dstICD2\",\"GTS%20Services%20II\",\"DUO%202FA%20Priv%20Users\"],\"clientIP\":\"172.17.254.10\",\"authMethod\":\"ext-auth-interface\",\"userAgent\":\"Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.89 Safari/537.36\",\"cn\":\"THIAGO%20DE%20MENEZES%20NOGUEIRA%20COSTA\",\"dn\":\"uid=089541631,c=br,ou=bluepages,o=ibm.com\",\"uid\":\"089541631\",\"firstName\":\"THIAGO\"}";
		str = "{\"sub\":\"lois@br.ibm.com\",\"at_hash\":\"XUc6gP157NDVOTBaHq-BoA\",\"realmName\":\"W3IDRealm\",\"iss\":\"https://w3id-test.sso.ibm.com/isam\",\"aud\":\"MDY3MGVlZDUtZDViOS00\",\"exp\":1510609814,\"iat\":1510602614,\"nbf\":1510602494,\"emailAddress\":\"lois@br.ibm.com\",\"lastName\":\"Rodrigues\",\"blueGroups\":\"Edge%20Portal%20Access%20Tab\",\"clientIP\":\"172.17.254.20\",\"authMethod\":\"ext-auth-interface\",\"userAgent\":\"Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:56.0) Gecko/20100101 Firefox/56.0\",\"cn\":\"Luiz%20Gustavo%20Rodrigues%20Gonzalez\",\"dn\":\"uid=081568631,c=br,ou=bluepages,o=ibm.com\",\"uid\":\"081568631\",\"firstName\":\"Luiz\"}";
		System.out.println("str= "+str);
		
		ObjectMapper mapper = new ObjectMapper();
		
		UserW3idToken us = null;
		try {
			us = mapper.readValue(str, UserW3idToken.class);
			System.out.println("us.uid="+us.getUid());
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		org.junit.Assert.assertNotNull(us);
		
	}

}
