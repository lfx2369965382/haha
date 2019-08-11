package lfx.news.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class dateUtil {

	
	public static Date hasDate(String date,String time){
		
		SimpleDateFormat sdf = new SimpleDateFormat(time);
		
		try {
			Date parse = sdf.parse(date);
			
			return parse;
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
}
