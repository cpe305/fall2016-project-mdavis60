package cpe305.mdavis60.data;

import java.util.Scanner;

import cpe305.mdavis60.controller.ScheduleViewMaker;
import cpe305.mdavis60.controller.*;

public class App {
  static ScheduleViewer schedule;
  static DateTime thedate;
  static ScheduleViewer day1;
  static boolean isDone = false;

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    DateTime testDateTime = new DateTime(4, 11, 2016, 10, 30);
    Event e1 = new Event();
    Event e2 = new Event("CPE 305", "Personal Software Development", new DateTime(4, 11, 2016, 10,
        10), new DateTime(4, 11, 2016, 12, 00));
    Event e3 = new Event("Register for Class", "Go to PASS", testDateTime, testDateTime);

    schedule = ScheduleViewMaker.createScheduleView("week", in);
    day1 = ScheduleViewMaker.createScheduleView("day", in);
    thedate = ((DayViewer) day1).getDay();

    ((WeekViewer) schedule).add(day1);

    printHelp();
    while (!isDone) {
      getOption(in);
      System.out.println("");
    }
  }

  public static void getOption(Scanner in) {
    while (in.hasNext()) {
      String line = in.nextLine();
      if (line.equals("h")) {
        printHelp();
      } else if (line.equalsIgnoreCase("p")) {
        schedule.printView();
      } else if (line.equalsIgnoreCase("e")) {
        Event e = promptEvent(in);
        e.setStartTime(thedate);
        e.setEndTime(thedate);
        ((DayViewer) day1).addActivity(e);
      } else if (line.equalsIgnoreCase("d")) {
        promptDay(in);
      } else if (line.equals("q"))
        isDone = true;
    }
  }

  private static void printHelp() {
    System.out.println("e - add Event");
    System.out.println("p - print Schedule");
    System.out.println("d - add Day");
    System.out.println("h - helps");
    System.out.println("q - quit\n");
  }

  private static void promptDay(Scanner in) {
    ((WeekViewer) schedule).add(ScheduleViewMaker.createScheduleView("day", in));
    System.out.println("Day added");
  }

  private static Event promptEvent(Scanner in) {
    Event e = new Event();

    System.out.println("Enter activty name..");
    e.setActivityName(in.nextLine());

    System.out.println("Enter description...");
    e.setDescription(in.nextLine());
    
    System.out.println("Event added");

    return e;

  }
}
