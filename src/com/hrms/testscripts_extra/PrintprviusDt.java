package com.hrms.testscripts_extra;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import bsh.ParseException;

public class PrintprviusDt {
	
	public static String previousDateString (String dateString)throws ParseException{
		DateFormat dateformate = new SimpleDateFormat("yyyyMMdd");
		Date myDate = dateFormat.parse(dateString);
	}
}





	
	