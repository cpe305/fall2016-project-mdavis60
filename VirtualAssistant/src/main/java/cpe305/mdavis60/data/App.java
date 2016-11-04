package cpe305.mdavis60.data;

public class App {
  public static void main(String[] args) {
    DateTime testDateTime = new DateTime(3, 11, 2016, 0, 56);
    Event e1 = new Event();
    Event e2 = new Event("CPE 305", "Personal Software Development", new DateTime(4, 11, 2016, 10,
        10), new DateTime(4, 11, 2016, 12, 00));
    System.out.println(testDateTime.toString());
    System.out.println(e1.toString());
    System.out.println(e2.toString());
  }
}
