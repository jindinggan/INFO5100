package assignment8;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Email {

    private int mailboxCapacity = 500;
    private int defaultPasswordLength = 10;
    private String companySuffix = "aeycompany.com";
    private String firstName;
    private String lastName;
    private static final String PASSWORD_SET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
    private String departmentName;
    private String password;
    private Scanner console;

    // Constructor to receive the first name and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("New Worker: " + firstName + " " + lastName + ". Department Codes: ");
        System.out.println("1 for Sales");
        System.out.println("2 for Development");
        System.out.println("3 for Accounting");
        System.out.println("0 for none");
        this.console = new Scanner(System.in);
        this.departmentName = setDepartment();
        this.password = randomPassword(defaultPasswordLength);
    }

    // Ask for the department
    private String setDepartment() {
        System.out.println("Enter department code: ");
        boolean validInput = true;
        do {
            try {
                int departmentCode = console.nextInt();
                if (departmentCode == 0) {
                    return "None";
                } else if (departmentCode == 1) {
                    return "Sales";
                } else if (departmentCode == 2) {
                    return "Development";
                } else if (departmentCode == 3) {
                    return "Accounting";
                } else {
                    validInput = false;
                    throw new InputMismatchException("Invalid input");
                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid input and try again");
                System.out.println("1 for Sales");
                System.out.println("2 for Development");
                System.out.println("3 for Accounting");
                System.out.println("0 for none");
            }
        } while (!validInput);
        return null;
    }

    // Generate a random password
    private String randomPassword(int length) {
        String random = "";
        Random ran = new Random();
        for (int i = 0; i < length; i++) {
            int randomNumber = ran.nextInt(PASSWORD_SET.length());
            random += PASSWORD_SET.charAt(randomNumber);
        }
        return random;
    }

    public String showInfo() {
        return "DISPLAY NAME: " + firstName + " " + lastName + "\n" +
                "DEPARTMENT: " + departmentName + "\n" +
                "COMPANY EMAIL: " + generateEmail() + "\n" +
                "PASSWORD: " + password + "\n" +
                "MAILBOX CAPACITY: " + mailboxCapacity + "mb";
    }

    private String generateEmail() {
        return firstName.toLowerCase() + "." + lastName.toLowerCase() +  "@" +
                departmentName.toLowerCase() + "." + companySuffix;
    }
}