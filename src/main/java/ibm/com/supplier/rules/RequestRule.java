package ibm.com.supplier.rules;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class RequestRule {
	
	public static String geraIdRequest() {
		String data="";
		String DATE_FORMAT = "yyyyMMddHHmmssSSS";
	    SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
	    Calendar c1 = Calendar.getInstance(); // today
	    data+=sdf.format(c1.getTime());
		return data;
	}

}
