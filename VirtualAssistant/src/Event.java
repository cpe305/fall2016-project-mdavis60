import java.util.Calendar;
import java.util.Date;

public class Event extends Activity {

	/**
	 * The default Constructor for Event.
	 */
	public Event() {
		super("New Event", "Enter description", new DateTime(new Date()), new DateTime(new Date()));
	}

	

	public String toString() {
		String out = "";
		return out;
	}
}
