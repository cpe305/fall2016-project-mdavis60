package cpe305.mdavis60.data;

import java.util.ArrayList;

public class DateTime {
  private int date;
  private int month;
  private int year;
  private int hour24;
  private int minutes;
  private static ArrayList<String> months;
  private static ArrayList<String> days;

  public DateTime() {
    this.date = 1;
    this.month = 1;
    this.year = 2016;
    this.hour24 = 0;
    this.minutes = 0;
  }

  public DateTime(int date, int month, int year, int hour24, int minutes) {
    this.date = date;
    this.month = month;
    this.year = year;
    this.hour24 = hour24;
    this.minutes = minutes;
    months = new ArrayList<String>();
    days = new ArrayList<String>();
    initializeMonthsAndDays();
  }

  private void initializeMonthsAndDays() {
    months.add("January");
    months.add("February");
    months.add("March");
    months.add("April");
    months.add("May");
    months.add("June");
    months.add("July");
    months.add("August");
    months.add("September");
    months.add("Ocober");
    months.add("November");
    months.add("December");
    days.add("Sunday");
    days.add("Monday");
    days.add("Tuesday");
    days.add("Wednesday");
    days.add("Thursday");
    days.add("Friday");
    days.add("Saturday");
  }

  public String getShortDate() {
    return "" + month + "\\" + date + "\\" + year;
  }

  public String getLongDate() {
    return getDayOfWeek() + ", " + getMonthString(month) + " " + date + ", " + year;
  }

  private String getMonthString(int month) {
    assert (month > 0 && month < 13);
    return months.get(month - 1);
  }

  public void setTheDate(int date, int month, int year) {
    this.date = date;
    this.month = month;
    this.year = year;
  }

  public void setTime(int hour24, int minutes) {
    this.hour24 = hour24;
    this.minutes = minutes;
  }

  public String getTime24() {
    return String.format("%d:%02d %s", hour24, minutes);
  }

  public String getTime12() {
    boolean pm = hour24 >= 12;
    if (pm)
      return String.format("%d:%02d %s", hour24 - 12 == 0 ? 12 : hour24 - 11, minutes, "PM");
    else
      return String.format("%d:%02d %s", hour24 == 0 ? 12 : hour24, minutes, "AM");
  }

  public String getMonth() {
    return getMonthString(month);
  }

  public String getDayOfWeek() {
    int day = DateTimeCreator.getDayOfWeek(date, month, year);
    return getDayOfWeekString(day - 1);
  }

  private String getDayOfWeekString(int day) {
    return days.get(day);
  }

  public void setYear(int year) {
    this.year = year;
  }

  public String getYear() {
    return "" + year;
  }

  public String toString() {
    return getLongDate() + ", " + getTime12();
  }
  
  public boolean equals(DateTime other)
  {
    return toString().equals(other.toString());
  }
}
