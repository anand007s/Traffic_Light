package traffic;

import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    greet();
  }

  static void greet() {
    System.out.println("Welcome to the traffic management system!");
    userInput();
    menu();
    menuSelection();
  }

  static void menu() {
    System.out.print("Menu:\n" +
            "1. Add road\n" +
            "2. Delete road\n" +
            "3. Open system\n" +
            "0. Quit");
  }

  static void userInput() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Input the number of roads: > ");
    boolean flag = true;
    int numberOfRoadInt;
    while (flag) {
      String numberOfRoads = scanner.nextLine();
      try {
        numberOfRoadInt = Integer.valueOf(numberOfRoads);
      } catch (NumberFormatException e) {
        System.out.print("Error! Incorrect Input. Try again: > ");
        continue;
      }
      if (numberOfRoadInt < 1) {
        System.out.print("Error! Incorrect Input. Try again: > ");
      } else {
        flag = false;
      }
    }

    System.out.print("Input the interval: > ");
    int numberOfIntervalInt;
    while (!flag) {
      String numberOfInterval = scanner.next();
      try {
        numberOfIntervalInt = Integer.valueOf(numberOfInterval);
      } catch (NumberFormatException e) {
        System.out.print("Error! Incorrect Input. Try again: > ");
        continue;
      }
      if (numberOfIntervalInt < 1) {
        System.out.print("Error! Incorrect Input. Try again: > ");
      } else {
        flag = true;
      }
    }
  }

  static void menuSelection() {
    Scanner scanner = new Scanner(System.in);
    boolean flag = true;
    while(flag) {
      System.out.print("\n> ");
      String selectedMenu = scanner.nextLine();
      switch (selectedMenu) {
        case "1" :
          System.out.println("Road added");
          menu();
          break;
        case "2" :
          System.out.println("Road deleted");
          menu();
          break;
        case "3" :
          System.out.println("Open system");
          menu();
          break;
        case "0" :
          System.out.println("Bye!");
          flag = false;
          break;
        default:
          System.out.println("Incorrect option");
          menu();
      }
    }
  }

}
