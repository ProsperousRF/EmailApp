package emailapp;

import java.util.Scanner;

/** @author Stanislav Rakitov */
public class Email {
  private final String firstName;
  private final String lastName;
  private final String password;
  private final String department;
  private String email;
  private String companySuffix = "acme.com";
  private int mailboxCapacity;
  private String alternateEmail;
  private final int defaultPasswordLength = 8;

  // Constructor to receive the first name and the last name
  public Email(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.department = askDepartment();
    this.password = randomPassword(defaultPasswordLength);
    this.email = this.firstName.toLowerCase() + "."
            + this.lastName.toLowerCase() + "@" +
            this.department + "." + companySuffix;



    System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);
    System.out.println("Department: " + this.department);
    System.out.println("Your password is: " + this.password);
    System.out.println("Your email is: " + this.email);
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

  // Generate a random password
  private String randomPassword(int length) {
    String passwordSet = "ABCDEFGJKLMNPRSTUVWXYZ0123456789^$?!@#%&";
    char[] password = new char[length];
    for (int i = 0; i < length; i++) {
      int rand = (int) (Math.random() * passwordSet.length());
      password[i] = passwordSet.charAt(rand);
    }
    return new String(password);
  }

  // TODO: 02.11.2021 Set the mailbox capacity

  // TODO: 02.11.2021 Set the alternate email

  // TODO: 02.11.2021 Change the password

}
