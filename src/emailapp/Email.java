package emailapp;

import java.util.Scanner;

/** @author Stanislav Rakitov */
public class Email {
  private String firstName;
  private String lastName;
  private String password;
  private String department;
  private int mailboxCapacity;
  private String alternateEmail;

  // Constructor to receive the first name and the last name
  public Email(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.department = askDepartment();
  }

  // Ask for the department
  private String askDepartment() {
    System.out.println(
        "Department codes\n" +
                "1 for Sales\n" +
                "2 for Development\n" +
                "3 for Accounting\n" +
                "0 for none\n" +
                "Enter department code");
    Scanner in = new Scanner(System.in);
    int depChoice = in.nextInt();
    switch (depChoice){
      case 1:
        return "sales";
      case 2:
        return "dev";
      case 3:
        return "acct";
      default:
        return "";
    }
  }

  // TODO: 02.11.2021 Generate a random password

  // TODO: 02.11.2021 Set the mailbox capacity

  // TODO: 02.11.2021 Set the alternate email

  // TODO: 02.11.2021 Change the password

}
