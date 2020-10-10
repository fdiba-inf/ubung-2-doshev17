package exercise2;

import java.util.Scanner;

public class DayOfWeek {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    int a = input.nextInt();

    if (a == 1) {
      System.out.println("Day of week : Monday");
    }
    if (a == 2) {
      System.out.println("Day of week : Tuesday");
    }
    if (a == 3) {
      System.out.println("Day of week: Wednesday");
    }
    if (a == 4) {
      System.out.println("Day of week: Thursday");
    }
    if (a == 5) {
      System.out.println("Day of week: Friday");
    }
    if (a == 6) {
      System.out.println("Day of week: Saturday");
    }
    if (a == 7) {
      System.out.println("Day of week: Sunday");
    }
    else if ( a > 7) {
      System.out.println("Day of week: Invalid day");
    }
    else if ( a < 1) {
      System.out.println("Day of week: Invalid day");
    }
}
}