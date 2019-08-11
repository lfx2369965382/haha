package lfx.news.util;

import java.util.regex.Pattern;


public class stringTUtil {
	
	public static boolean hasNum(String url){
		
		boolean flag = url.matches("\\d+");
		
		return flag;
		
	}
	
	public static boolean hasNull(String url){
		
		if(url!=null&&!url.equals("")&&!url.equals(" ")){
			return true;
		}else{
			return false;
		}
		
	}
	
	public static int hasStrng(String url,String reg){
		
		String url1 = url.substring(url.lastIndexOf("-")+1);
		
		String str = Pattern.compile(reg).matcher(url1).replaceAll("");
		
		int parseInt = Integer.parseInt(str);
		
		return parseInt;
		
	}
	
	
	
	public static void main(String[] args) {
		
		System.out.println(stringTUtil.hasStrng("awfwxwfcwe-25526.com", "[^0-9]"));
		
	}
}
