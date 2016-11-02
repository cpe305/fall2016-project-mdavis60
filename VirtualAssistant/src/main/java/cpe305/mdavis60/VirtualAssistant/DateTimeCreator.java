package cpe305.mdavis60.VirtualAssistant;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DateTimeCreator {
	private static Calendar theCalendar;

	public DateTimeCreator() {
		theCalendar = Calendar.getInstance();
	}

	public DateTime createNewDateTime(int day, int month, int year, int hour,
			int minutes) {
		theCalendar.set(year, month, day, hour, minutes);
		return new DateTime(theCalendar.getTime());
	}
	

	static public String getDateString(Date aDate) {
		setCalendar(aDate);

		return getDayOfWeek(aDate) + " " + getMonth(aDate) + " " + getDay(aDate) + ", "
				+ getYear(aDate);
	}
	
	public static String getTime(Date aDate)
	{
		setCalendar(aDate);
		return theCalendar.get(Calendar.HOUR_OF_DAY) + ":" + theCalendar.get(Calendar.MINUTE);
	}

	public static String getDayOfWeek(Date aDate) {
		setCalendar(aDate);
		return theCalendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG,
				Locale.US);
	}

	public static String getMonth(Date aDate) {
		setCalendar(aDate);
		return theCalendar.getDisplayName(Calendar.MONTH, Calendar.LONG,
				Locale.US);
	}

	private static String getDay(Date aDate) {
		setCalendar(aDate);
		return theCalendar.getDisplayName(Calendar.DATE, Calendar.LONG,
				Locale.US);
	}

	public static String getYear(Date aDate) {
		setCalendar(aDate);
		return theCalendar.getDisplayName(Calendar.YEAR, Calendar.LONG,
				Locale.US);
	}

	private static void setCalendar(Date aDate) {
		theCalendar.setTime(aDate);
	}
}
