package resolv.com.dokia.utils;

public class LogTratative {
	public static String replaceJson(String text) {
		text = text.replace(", {", ",{");
		text = text.replace(", ", "\" , ");
		text = text.replace("=", "=\"");
		text = text.replace("}", "\"}");
		return text;
	}
}
