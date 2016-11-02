package cpe305.mdavis60.VirtualAssistant;

import java.util.Date;

public class DateTime {
	private Date theDate;

	public DateTime(Date theDay) {
		theDate = theDay;
	}

	public Date getTheDate() {
		return theDate;
	}

	public void setTheDate(Date newDate) {
		theDate = newDate;
	}

	public String printDateAndTime()
	{
		return DateTimeCreator.getDateString(theDate) + "\n" + DateTimeCreator.getTime(theDate);
	}
}
