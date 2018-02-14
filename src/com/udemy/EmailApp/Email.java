package com.udemy.EmailApp;

import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailboxCapacity = 500;
    private String alternateEmail;
    private int defaultPasswordLength = 8;
    private String companySufix = "ivia.com";


    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        this.department = setDepartment();
        this.password = randomPassword(defaultPasswordLength);

        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySufix;
    }

    public String setDepartment() {
        System.out.println("DEPARTMENT CODES: \nEnter the department \n1 for Roads \n2 for Bridges \n3 for Managment \n0 for none");
        Scanner scanner = new Scanner(System.in);
        int departmentChoice = scanner.nextInt();
        String department = "";
        switch ( departmentChoice ){
            case 1:
                department = "roads";
                break;
            case 2:
                department = "bridges";
                break;
            case 3:
                department = "managment";
                break;
            case 0:
                department = "";
                break;
            default:
                department = "";
                break;
        }
        return department;
    }

    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUWXYZ0123456789";
        char [] password = new char [length];
        for (int i = 0; i < length; i++){
            int random = (int)(Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(random);
        }
        return new String (password);
    }

    public void setMailboxCapacity(int mailboxCapacity) {
        this.mailboxCapacity = mailboxCapacity;
    }

    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }

    public void changePassword (String password){
        this.password = password;
    }

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public String getPassword() {
        return password;
    }

    public String showInfo(){
        return "Display name: " + firstName + " " + lastName +
                "\nCompany Email: " + email +
                "\nMailbox capacity " + mailboxCapacity + "mb";

    }
}
