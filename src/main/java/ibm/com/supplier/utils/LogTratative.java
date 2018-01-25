package ibm.com.supplier.utils;

public class LogTratative {
	
	public static String replaceLogs(String text) {
		text = text.replace(" , logs=\"[]\"","");
		text = text.replace(" , logs=\"[{}]\"","");
		return text;
	}
	
	public static String replaceJson(String text) {
		text = text.replace(", {", ",{");
		text = text.replace(", ", "\" , ");
		text = text.replace("=", "=\"");
		text = text.replace("}", "\"}");
		return text;
	}
	
	public static String removeLogs(String text) {
		int firstPos = 0;
		int lastPos = 0;
		String init = "logs=\"[{";
		String end = "]\"}]";
		String result;
	
		firstPos = text.indexOf(init) + init.length();
		lastPos = text.indexOf(end, firstPos);	
		
		if(firstPos > -1 && lastPos > -1) {
			result = text.substring(0,firstPos) + "" + text.substring(lastPos);
			result = result.replace(" , logs=\"[{]\"}]\"","");
			text = result;
		} else {
			end = "}]\"";
			
			firstPos = text.indexOf(init) + init.length();
			lastPos = text.indexOf(end, firstPos);	
			
			if(firstPos > -1 && lastPos > -1) {
				result = text.substring(0,firstPos) + "" + text.substring(lastPos);
				result = result.replace(" , logs=\"[{]\"}]\"","");
				text = result;
			} else {
				text = text.replace(" , logs=\"[]\"","");
			}
		}	
		return text;
	}
}
