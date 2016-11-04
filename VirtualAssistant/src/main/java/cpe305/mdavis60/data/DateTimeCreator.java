package cpe305.mdavis60.data;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DateTimeCreator {
  private static Calendar theCalendar;

  public DateTimeCreator() {
    theCalendar = Calendar.getInstance();
  }

  public static int getDayOfWeek(int date, int month, int year) {
    if (theCalendar == null) {
      theCalendar = Calendar.getInstance();
    }
    theCalendar.set(year, month - 1, date);
    return theCalendar.get(Calendar.DAY_OF_WEEK);
  }
}
