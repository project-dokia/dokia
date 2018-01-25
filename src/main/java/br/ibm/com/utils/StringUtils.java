package br.ibm.com.utils;

import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StringUtils {

	public static String fmt(String str, int i) {
		if(str==null) str = "";
		if(i<1) return "";
		while(str.length()<i)str+=" ";
		if(str.length()>i)str=str.substring(0,i);
		return str;
	}

	public static Object fmtNumberLeft(String str, int i) {
		if(str==null) str = "";
		if(i<1) return "";
		while(str.length()<i)str="0"+str;
		if(str.length()>i)str=str.substring(0,i);
		return str;
	}
	
	public static String geraStrings(String str,int qty){
		String r = "";
		for(int i=0;i<qty;i++){
			r+=str;
		}
		return r;
	}
	public static List<String> DelimitedStringToList(String s, String d) {
		List<String> l = new ArrayList<String>();
		String r = "";
		for(int i=0;i<s.length();i++){
			boolean ultimoCaracter = (i==(s.length()-1));
			String c = s.substring(i,i+1);
			if(!c.equals(d)&&!ultimoCaracter){
				r+=c;
			}else{
				if(ultimoCaracter&&!c.equals(d))r+=c;
				if(r.indexOf(d)>0)r=r.substring(0,r.indexOf(d)-1);//retira o separador d
				l.add(r);
				r="";
			}
		}
		return l;
	}

	public static String geraInsert(String tabela, String[] colunas){
		String ret = "";
		String sInicial = "INSERT INTO "+tabela+" (";
		String sInicial2 = "";
		String sMeio = ") VALUES (";
		String sMeio2 = "";
		String sFinal = ")";
		//for(int i=0;i<colunas.length;i++){
		for(int i=0;i<30;i++){
			String separador = ",";
			if(i==0)separador="";
			sInicial2+=separador+colunas[i];
			sMeio2+=separador+"?";
		}
		ret=""+sInicial+sInicial2+sMeio+sMeio2+sFinal;
		return ret;
	}
	public static String print(String str, int i){
		System.out.println("str ["+i+"]:"+str);
		return str;
	}
	public static String LeftPad (String stringToPad, String padder, int size)
	{
		StringBuffer strb;
		StringCharacterIterator sci;

		if (padder.length() == 0)
		{
			return stringToPad;
		}
		strb = new StringBuffer(size);
		sci  = new StringCharacterIterator(padder);
 
        while (strb.length() < (size - stringToPad.length()))
        {
			for (char ch = sci.first(); ch != CharacterIterator.DONE ; ch = sci.next())
			{
				if (strb.length() <  size - stringToPad.length())
				{
					strb.insert(  strb.length(),String.valueOf(ch));
				}
			}
		}
		return strb.append(stringToPad).toString();
	}
	public static String RightPad (String stringToPad, String padder, int size)
	{
		StringBuffer strb;
		StringCharacterIterator sci;
		if (padder.length() == 0)
		{
			return stringToPad;
		}
		strb = new StringBuffer(stringToPad);
		sci  = new StringCharacterIterator(padder);
 
        while (strb.length() < size)
        {
			for (char ch = sci.first(); ch != CharacterIterator.DONE ; ch = sci.next())
			{
				if (strb.length() < size)
				{
					strb.append(String.valueOf(ch));
				}
			}
		}
		return strb.toString();
	}
	public static String Right(String var, int length)
     {
         return var.length() > length ? var.substring(length) : var;
     }
    public static String Left(String var, int length)
    {
        return var.length() > length ? var.substring(0, length) : var;
    }
    public static boolean IsNullOrEmpty(String target)
    {
        return !HasText(target);
    }
    public static boolean HasText(String target)
    {
        if (target == null)
        {
            return false;
        }
        else
        {
            return HasLength(target.trim());
        }
    }
    public static boolean HasLength(String value)
    {
     return (value!= null && value.length()>0);
    }
    public static String CollectionToDelimitedString(java.util.List fonte, String delimitador)
    {
   	 if(fonte==null)
   	 {
   		 return "null";
   	 }
   	  java.lang.StringBuilder sb = new java.lang.StringBuilder(); 
   	  int c = 0;
   	  for(java.util.Iterator iter = fonte.iterator(); iter.hasNext();)
   	  {
   		 if(c++>0)
   		 {
   			 sb.append(delimitador);
   		 }
   		 Object obj = (Object)iter.next();
   		 sb.append(obj);
   	 }
   	return sb.toString();
    }
    public static String[] DelimitedStringToStringArray(String input, String delimiter)
    {
   	 if(StringUtils.IsNullOrEmpty(input))
   	 {
   		 return new String[0];
   	 }
   	 if(!HasLength(delimiter))
   	 {
   		 return new String[] {input};
   	 }
   	 return input.split(delimiter);
   	 
    }
    public static String RemoverAcentos(String conteudo)
    {
     String retorno = "";
     String acentos    = "áàãââÁÀÃÂéêÉÊíÍóõôÓÔÕúüÚÜçÇ'¦´ ";//espaco em branco charset 160
     String semAcentos = "aaaaaAAAAeeEEiIoooOOOuuUUcC    ";//espaco em branco ok charset 32
     String caracterAtual ="";
     for(int i=0; i<conteudo.length();i++)
     {
	     caracterAtual = String.valueOf(conteudo.charAt(i));
	     if(acentos.indexOf(caracterAtual)>0)
	     {
	    	 retorno += semAcentos.charAt(acentos.indexOf(caracterAtual));
	     }
	     else
	     {
	    	 retorno +=conteudo.charAt(i);
	     }
     }
     
     for (int i = 0;i < 32; i++)
			retorno = retorno.replace((char)i, (char)32);
		for (int k = 123; k < 256;k++)
			retorno = retorno.replace((char)k, (char)32);

     
     return retorno;
    }
    public static String RemoverAcentosVirgula(String conteudo)
    {
     String retorno = "";
     String acentos = "áàãââÁÀÃÂéêÉÊíÍóõôÓÔÕúüÚÜçÇº";
     String semAcentos = "aaaaaAAAAeeEEiIoooOOOuuUUcC ";
     String caracterAtual ="";
     for(int i=0; i<conteudo.length();i++)
     {
	     caracterAtual = String.valueOf(conteudo.charAt(i));
	     if(acentos.indexOf(caracterAtual)>0)
	     {
	    	 retorno += semAcentos.charAt(acentos.indexOf(caracterAtual));
	     }
	     else
	     {
	    	 retorno +=conteudo.charAt(i);
	     }
     }
     
     for (int i = 0;i < 32; i++)
			retorno = retorno.replace((char)i, (char)32);
		for (int k = 123; k < 256;k++)
			retorno = retorno.replace((char)k, (char)32);

     
     return retorno;
    }
    public static boolean buscaArrayString(String obj, String[] objetos){
    	for(int i=0;i<objetos.length;i++){
    		if(objetos[i].equals(obj))
    			return true;
    	}
    	return false;
    }
    public static String setTamanhoString(String str,int tamanho){
    	if(str!=null){
    		while(str.length()<tamanho){
    			str+=" ";
    		}
    	}
    	return str;
    }
    public static int toInteger(String str){
    	int ret = 0;
    	str = str.replaceAll("[^0-9]", "");;
    	if(!str.equals("")) ret = Integer.parseInt(str);
    	return ret;
    }
    
    public static boolean isOnlyNumero(String str){
    	if(str.length()==0)return false;
    	boolean ret = true;
    	String validos = "0123456789";
    	String caracterAtual ="";
    	for(int i=0;i<str.length();i++){
    		caracterAtual = String.valueOf(str.charAt(i));
    		if(validos.indexOf(caracterAtual)>=0){
    			// continua verificando
    		}else{
    			return false;
    		}
    	}
    	return ret;
    }
    public static String RemoverCaracteres(String conteudo, boolean zeroEsquerda){
    	if(conteudo==null) return "15";
    	String retorno = "";
    	String validos = "0123456789";
    	String caracterAtual ="";
    	//System.out.println("conteudo.length()"+conteudo.length());
    	for(int i=0;i<conteudo.length();i++){
    		caracterAtual = String.valueOf(conteudo.charAt(i));
    		//System.out.println("--validos.indexOf(caracterAtual)"+validos.indexOf(caracterAtual));
    		if(validos.indexOf(caracterAtual)>=0){
    			if(zeroEsquerda){
    				retorno+=caracterAtual;
    			}else if(retorno.length()==0&&caracterAtual.equals("0")){
    				//retorno +=conteudo.charAt(i);
    			}else{
    				retorno+=caracterAtual;
    			}
    		}else{
    			//retorno +=conteudo.charAt(i);
    		}
    	}
    	if(retorno.length()==0)retorno="15";
    	return retorno;
    }
    
    public static String retiraEspacosGeral(String str) {
		if(str==null)return "";
		if (str.length() == 0)
			return "";
		String r = "";
		for(int i=0;i<str.length();i++){
			String verif = str.substring(i,i+1);
			int hc = verif.hashCode();//Integer.getInteger(verif);
//			System.out.println("verif:"+verif+" hashCode:"+hc);
//			if(!verif.equals(" ")){
			if(hc!=32&&hc!=160){
				r+=verif;
			}else{
				
			}
		}
		return r;
	}
	public static List<String> listByString(String r, String sep){
    	List<String> l=new ArrayList<String>();
		String field = "";
		for(int i=0;i<r.length();i++){
    		String carac = r.substring(i, (i+1));
    		if(carac.equals(sep)){//"\t")){
    			l.add(field.trim());
    			field="";
    		}else{
    			field += carac;
    		}
    	}
		l.add(field.trim());
		return l;
    }

	public static void printList(List<?> list) {
		System.out.println("--- StringUtils printList ---");
		if(list==null){
			System.out.println("LISTA NULA!!!!");
		}else{
			for(int i=0;i<list.size();i++){
				System.out.println(list.get(i));
			}			
		}
		System.out.println("-----------------------------");
	}

	public static String sqlValue(String s) {
		if(s==null)return null;
		else{
			if(s.indexOf("'")>=0);
			return s.replaceAll("'", "''");
		}
	}
	public static String GenerateDb(String var, int max, String col, boolean upperCase){
		if(var==null) return null;
		if(upperCase) return GenerateDb(var, max, col).toUpperCase();
		else return GenerateDb(var, max, col);
	}
	public static String GenerateDb(String var, int max, String col){
	  	if(var==null) return null;
	   	if(var.length()<=0) return "";
	   	if(var.length()>max){
	   		System.out.println("ERRO max:"+max+", col:"+col+", var:"+var);
	   	}
	   	var = var.replaceAll("\'", "''");
	   	var = var.replaceAll("�", " ");
	   	return Left(var, max);
	}
	
//	public static String GenerateDbTIMESTAMP(Date dt) {
//		return DataHora.getStringByDate(dt, "yyyy-MM-dd HH:mm:ss.s");
//	}
	
	public static void printSql(String sql){
		String sep = StringUtils.geraStrings("-", sql.length());
		System.out.println(sep);
		System.out.println(sql);
		System.out.println(sep);
	}

	public static String GenerateDbListIn(List<String> list) {
		if(list==null)return null;
		else{
			String r="";
			for(int i=0;i<list.size();i++){
				r+="'"+list.get(i)+"',";
			}
			r = r.substring(0,r.length()-1);//tirando a virgula do final
			return r;
		}
	}
	
	public static String RemoverAcentosToUpperCase(String conteudo, int max) {
		if (conteudo == null)return "";
		conteudo=retiraEspacosDoFinal(conteudo);
		if(conteudo.length()>max)conteudo=conteudo.substring(0,max);
		else conteudo=RemoverAcentosToUpperCase(conteudo);
		return conteudo;
	}
	public static String RemoverAcentosToUpperCase(String conteudo) {
		if (conteudo == null)
			return "";
		conteudo = conteudo.toUpperCase();
		return RemoverAcentos(conteudo);
	}
	public static String retiraEspacosDoFinal(String str) {
		if(str==null)return "";
		if (str.length() == 0)
			return "";
		while (str.length() > 0) {
			String verif = str.substring(str.length() - 1);
			if (verif.equals(" "))
				str = str.substring(0, str.length() - 1);
			else
				break;
		}
		return str;
	}
	public static String retiraEspacosDoFinal(String str, int a){
    	if(str==null||str.length()==0)return "";
    	if(str.length()>a)str=Left(str, a);
    	while(str.length()>0){
    		String verif = str.substring(str.length()-1);
    		if(verif.equals(" ")) str=str.substring(0,str.length()-1);
    		else break;
    	}
    	return str;
    }
	public static String retiraEspacosInicio(String str) {
		if(str==null)return "";
		if (str.length() == 0)
			return "";
		String r = "";
		for(int i=0;i<str.length();i++){
			String verif = str.substring(i,i+1);
			if(verif.equals(" ")){
				//r+=verif;
			}else{
				r=str.substring(i);
				break;
			}
		}
		return r;
	}
	public static String[] splitByCaracter(String conteudo, String car) {
		String item = "";
		String caracterAtual = "";
		for (int i = 0; i < conteudo.length(); i++) {
			caracterAtual = String.valueOf(conteudo.charAt(i));
			if (car.equals(caracterAtual)) {
				item += ";";
			} else {
				item += conteudo.charAt(i);
			}
		}
		return item.split(";");
	}
	public static List<String> toListString(String str, int qty) {
		List<String> list = new ArrayList<String>();
		int a = 0;
		while (a < str.length()) {
			String temp = "";
			if (str.length() < a + qty) {
				temp = str.substring(a);
			} else {
				temp = str.substring(a, a + qty);
			}
			temp = retiraEspacosDoFinal(temp);
			// System.out.println("TEMP:"+temp+".");
			if (!temp.equals(""))
				list.add(temp.trim());
			a += qty;
		}
		return list;
	}
	public static String zeroEsquerda(String str,int qty){
		if(str==null)return str;
		str=retiraEspacosGeral(str);
		//System.out.println("DEBUG zeroEsquerda:"+str+",:"+str.length());
		while(str.length()<6){
			str="0"+str;
			//System.out.println("Debug STR:"+str);
		}
		return str;
	}
	
}