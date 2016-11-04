package cpe305.mdavis60.controller;

import java.util.ArrayList;

public class WeekViewer extends ScheduleViewer {
  ArrayList<DayViewer> week;

  public WeekViewer() {
    week = new ArrayList<DayViewer>();
  }

  public void add(DayViewer day) {
    if (!containsDay(day)) {
      week.add(day);
    }
  }

  public void remove(DayViewer day) {
    week.remove(day);
  }

  public void printView() {
    for (DayViewer day : week) {
      day.printView();
    }
  }

  public boolean containsDay(DayViewer day) {
    for (DayViewer aDay : week) {
      if (aDay.equals(day))
        return true;
    }
    return false;
  }
}
