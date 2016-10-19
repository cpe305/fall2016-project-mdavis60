import java.util.Calendar;

public class Event 
{
	private Calendar eventDate;
	private String startTime, endTime;
	private String eventName, description;
	public Event()
	{
		eventName = "New Event";
		description = "";
		eventDate = Calendar.getInstance();
	}
	
	public Calendar getEventDate()
	{
		return eventDate;
	}
	public void setEventDate(Calendar date)
	{
		eventDate = date;
	}
	public void setEventTime(int hour, int minutes)
	{
		eventDate.set(Calendar.HOUR, hour);
		eventDate.set(Calendar.MINUTE, minutes);
	}
	public void setEventDate(int year, int month, int date)
	{
		eventDate.set(year, month, date);
	}
	public String getEventName()
	{
		return eventName;
	}
	public void setEventName(String newName)
	{
		eventName = newName;
	}
	public String getDescription()
	{
		return description;
	}
	public void setDescription(String newDescrip)
	{
		description = newDescrip;
	}
}
