package cpe305.mdavis60.controller;

import java.io.File;
import java.util.Calendar;

import cpe305.mdavis60.data.Activity;
import cpe305.mdavis60.data.DateTimeCreator;
import cpe305.mdavis60.data.Event;

public class EventFactory {

  /**
   * 
   * @param name
   *          the name of the event.
   * @param date
   *          the date of the event.
   * @param directory
   *          the directory where the event is stored.
   * @return returns an event if it is found, null otherwise.
   */
  public Event getEvent(String name, Calendar date, File[] directory) {
    Event theEvent = null;
    File subDir, eventFile;

    while (theEvent == null) {
      // Finds year folder
      subDir = findFile(Integer.toString(date.YEAR), directory);
      if (subDir == null) {
        return theEvent;
      }

      // Finds month folder
      subDir = findFile(Integer.toString(date.MONTH), subDir.listFiles());
      if (subDir == null) {
        return theEvent;
      }

      // Finds week folder
      subDir = findFile(Integer.toString(date.WEEK_OF_MONTH), subDir.listFiles());
      if (subDir == null) {
        return theEvent;
      }

      eventFile = findFile(name, subDir.listFiles());
      // Retrieve event from file?
    }

    return theEvent;
  }

  private File findFile(String dirName, File[] directory) {
    for (File sub : directory) {
      if (dirName == sub.getName()) {
        return sub;
      }
    }
    System.out.println("Directory not found");
    return null;
  }

  /**
   * @param anEvent
   *          the event to store in the File System.
   * @param directory
   *          the root of the File System.
   */
  public void storeEvent(Activity anActivity, File[] directory) {
    File subDir;

    // Finds year folder, else create folder
    subDir = findFile(anActivity.getStartTime().getYear(), directory);
    if (subDir == null) {
      subDir = new File(anActivity.getStartTime().getYear());
      if (!subDir.mkdir()) {
        System.out.print("Failed to make directory");
        System.exit(0);
      }
    }

    // Finds month folder, else create folder
    subDir = findFile(anActivity.getStartTime().getMonth(), directory);
    if (subDir == null) {
      subDir = new File(anActivity.getStartTime().getMonth());
      if (!subDir.mkdir()) {
        System.out.print("Failed to make directory");
        System.exit(0);
      }
    }

    // Finds week folder, else create folder
    subDir = findFile(anActivity.getStartTime().getDayOfWeek(), directory);
    if (subDir == null) {
      subDir = new File(anActivity.getStartTime().getDayOfWeek());
      if (!subDir.mkdir()) {
        System.out.print("Failed to make directory");
        System.exit(0);
      }
    }

    // Store event in folder (No Progress)

  }

}
