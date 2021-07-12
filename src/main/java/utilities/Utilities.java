package utilities;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Utilities {
	public static String AddDayMonthYeartoCurrentDate (String format, String calendarType, int calendarNo )
		   {
		          Calendar c = Calendar.getInstance();
		          SimpleDateFormat sdf = new SimpleDateFormat(format);
			          if (calendarType.equalsIgnoreCase("dd"))
		          {c.add(Calendar.DAY_OF_YEAR, calendarNo);}
		          else if (calendarType.equalsIgnoreCase("ww"))
		          {c.add(Calendar.WEEK_OF_YEAR, calendarNo);}
		          else if (calendarType.equalsIgnoreCase("mm"))
		          {c.add(Calendar.MONTH, calendarNo);}
		          else if (calendarType.equalsIgnoreCase("yy"))
		          {c.add(Calendar.YEAR, calendarNo);}
		          else if (calendarType.equalsIgnoreCase("hh"))
		          {c.add(Calendar.HOUR, calendarNo);}
		          else if (calendarType.equalsIgnoreCase("mm"))
		          {c.add(Calendar.MINUTE, calendarNo);}
		
		          String MyDate = sdf.format(c.getTime());
		          System.out.println("selected  day is "+ MyDate);
		
		          return MyDate ;
		
		   }


}
