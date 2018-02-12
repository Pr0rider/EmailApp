package com.udemy.EmailApp;

import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity;
    private String alternateEmail;


    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        this.department = setDepartment();
    }

    public String setDepartment() {
        System.out.println("DEPARTMENT CODES: \nEnter the department \n1 for Roads \n2 for Bridges \n3 for Managment \n0 for none");
        Scanner scanner = new Scanner(System.in);
        int departmentChoice = scanner.nextInt();
        String department = "";
        switch ( departmentChoice ){
            case 1:
                department = "Roads";
                break;
            case 2:
                department = "Bridges";
                break;
            case 3:
                department = "Managment";
                break;
            case 0:
                department = "None";
                break;
            default:
                department = "None";
                break;
        }
        return department;
    }
}
