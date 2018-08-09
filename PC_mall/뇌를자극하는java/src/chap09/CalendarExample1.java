package chap09;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarExample1 {

	public static void main(String[] args) {
	      
		GregorianCalendar calendar = new GregorianCalendar();
		
		int year = calendar.get(Calendar.YEAR); 
		int MONTH = calendar.get(Calendar.MONTH); 
		int date = calendar.get(Calendar.DATE); 
		int amPm = calendar.get(Calendar.AM_PM); 
		int HOUR = calendar.get(Calendar.HOUR); 
		int MINUTE = calendar.get(Calendar.MINUTE);
		int sec = calendar.get(Calendar.SECOND); 
		
	   String sAmPm = amPm == Calendar.AM ? "오전" : "오후";
	   System.out.printf("%d년 %d월 %d일 %s %d시 %d분 %d초",  year, MONTH, date, sAmPm, HOUR, MINUTE, sec);
		
		}

}
