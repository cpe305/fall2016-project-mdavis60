import java.util.Calendar;

public class Event {
  private Calendar eventDate;
  private String startTime;
  private String endTime;
  private String eventName;
  private String description;

  /**
   * The default Constructor for Event.
   */
  public Event() {
    eventName = "New Event";
    description = "Enter description here...";
    eventDate = Calendar.getInstance();
  }

  public Calendar getEventDate() {
    return eventDate;
  }

  public void setEventDate(Calendar date) {
    eventDate = date;
  }

  public void setEventDate(int year, int month, int date) {
    eventDate.set(year, month, date);
  }

  public void setEventTime(int hour, int minutes) {
    eventDate.set(Calendar.HOUR, hour);
    eventDate.set(Calendar.MINUTE, minutes);
  }

  public String getEventName() {
    return eventName;
  }

  public void setEventName(String newName) {
    eventName = newName;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String newDescrip) {
    description = newDescrip;
  }

  /**
   * 
   * @return The day of the week as a String according to the current event.
   */
  public String getDayOfWeek() {
    switch (eventDate.get(Calendar.DAY_OF_WEEK)) {
      case 0:
        return "Sunday";
      case 1:
        return "Monday";
      case 2:
        return "Tuesday";
      case 3:
        return "Wednesday";
      case 4:
        return "Thursday";
      case 5:
        return "Friday";
      case 6:
        return "Saturday";
      default:
        return "error";
    }
  }
  
  /**
   * 
   * @return The month as a String according to the current event.
   */
  public String getMonth() {
    switch (eventDate.get(Calendar.MONTH)) {
      case 0:
        return "January";
      case 1:
        return "February";
      case 2:
        return "March";
      case 3:
        return "April";
      case 4:
        return "May";
      case 5:
        return "June";
      case 6:
        return "July";
      case 7:
        return "August";
      case 8:
        return "September";
      case 9:
        return "October";
      case 10:
        return "November";
      case 11:
        return "December";
      default:
        return "error";
    }
  }

  public String getDate() {
    return getDayOfWeek() + ", " + getMonth();
  }
  
  /**
   * 
   * @return The String version of Event.
   */
  public String toString() {
    String out = getEventName() + "\n";
    out += "\tDate: " + getEventDate().get(Calendar.DAY_OF_WEEK);

    return out;
  }
}
