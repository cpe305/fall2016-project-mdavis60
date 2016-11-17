package cpe305.mdavis60.VirtualAssistant;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

    public void testEventConstructor(){
      Event event = new Event();
      
      assertEquals(event.getActivityName(), "New Event");
      assertEquals(event.getDescription(), "Enter description...");
      assertEquals(event, "Event Name: New Event\n" + "Description: Enter description...\n" + "Start Time: "
          + event.getStartTime.toString() + "\n" + "EndTime: " + event.getStartTime.toString() + "\n";);
    }
    
    public void testEventConstructor(){
      Event event = new Event();
      
      assertEquals(event.getActivityName(), "New Event");
      assertEquals(event.getDescription(), "Enter description...");
      assertEquals(event, "Event Name: New Event\n" + "Description: Enter description...\n" + "Start Time: "
          + event.getStartTime.toString() + "\n" + "EndTime: " + event.getStartTime.toString() + "\n");
    }
    
    public void testEventAm(){
      DateTime start = new DateTime(1, 1, 2016, 0, 0);
      DateTime end = new DateTime(2, 1, 2016, 0, 0);
      Event event = new Event("12 AM", "Test 12 AM", start, end);
      
      assertEquals(event.getActivityName(), "12 AM");
      assertEquals(event.getDescription(), "Test 12 AM");
      assertEquals(event.getStartTime(), start);
      assertEquals(event.getEndTime(), end);
      assertEquals(event, "Event Name: 12 AM\n" + "Description: Test 12 AM\n" + "Start Time: "
          + start.toString() + "\n" + "EndTime: " + end.toString() + "\n");
    }
    
    public void testEventAm(){
      DateTime start = new DateTime(12, 7, 2016, 12, 0);
      DateTime end = new DateTime(2, 8, 2016, 12, 0);
      Event event = new Event("12 PM", "Test 12 PM", start, end);
      
      assertEquals(event.getActivityName(), "12 PM");
      assertEquals(event.getDescription(), "Test 12 PM");
      assertEquals(event.getStartTime(), start);
      assertEquals(event.getEndTime(), end);
      assertEquals(event, "Event Name: 12 PM\n" + "Description: Test 12 PM\n" + "Start Time: "
          + start.toString() + "\n" + "EndTime: " + end.toString() + "\n");
    }
    
    public void testEventAm(){
      DateTime start = new DateTime(31, 1, 2016, 23, 15);
      DateTime end = new DateTime(2, 2, 2016, 1, 12);
      Event event = new Event("Random Time Event", "Test Random Time", start, end);
      
      assertEquals(event.getActivityName(), "Random Time Event");
      assertEquals(event.getDescription(), "Test Random Time");
      assertEquals(event.getStartTime(), start);
      assertEquals(event.getEndTime(), end);
      assertEquals(event, "Event Name: Random Time Event\n" + "Description: Test Random Time\n" + "Start Time: "
          + start.toString() + "\n" + "EndTime: " + end.toString() + "\n");
    }
}
