package cpe305.mdavis60.data;

import java.util.Date;

public class Event extends Activity {

  /**
   * The default Constructor for Event.
   */
  public Event() {
    super("New Event", "Enter description...", new DateTime(), new DateTime());
  }

  public Event(String eventName, String description, DateTime start, DateTime end) {
    super(eventName, description, start, end);
  }

  public String toString() {
    return "Event " + super.toString();

  }
}
