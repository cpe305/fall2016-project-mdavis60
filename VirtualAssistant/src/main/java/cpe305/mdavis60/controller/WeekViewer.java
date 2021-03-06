package cpe305.mdavis60.controller;

import java.util.ArrayList;

public class WeekViewer extends ScheduleViewer {
  ArrayList<ScheduleViewer> week;

  public WeekViewer() {
    week = new ArrayList<ScheduleViewer>();
  }

  public void add(ScheduleViewer day) {
    if (!containsDay((DayViewer) day)) {
      week.add(day);
    }
  }

  public void remove(ScheduleViewer day) {
    week.remove(day);
  }

  public void printView() {
    for (ScheduleViewer day : week) {
      day.printView();
    }
  }

  public boolean containsDay(DayViewer day) {
    for (ScheduleViewer aDay : week) {
      if (((DayViewer) aDay).equals(day))
        return true;
    }
    return false;
  }
}
