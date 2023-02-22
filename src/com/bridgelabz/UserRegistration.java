package com.bridgelabz;

import java.util.Scanner;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    Scanner input = new Scanner(System.in);
    public void lambdaExpression(){
        System.out.println("Welcome to Lambda Expression Regex Pattern Programme");
        /**
         * Regular expression patterns
         */
        String firstNamePattern = "[A-Z]{1}+[a-z]{2,20}";
        String lastNamePattern = "[A-Z]{1}+[a-z]{2,20}";
        String emailPattern = "[a-z]{3,}[.]{1}[a-z]{0,}[@]{1}[a-z]{2,}[.]{1}[co]{2}[.]{1}[in]{0,2}";
        String mobileNumberPattern = "[0-9]{1,3}[\\s]{1}[7-9]{1}[0-9]{9}";
        String passwordWithSpecialCharPattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%&*]).{8,20}$";
        /**
         * Take user details from console
         */
        System.out.print("Enter first name : ");
        String firstName = input.next();
        System.out.print("Enter last name : ");
        String lastName = input.next();
        System.out.print("Enter email : ");
        String email = input.next();
        System.out.print("Enter password : ");
        String password = input.next();
        System.out.print("Enter mobile number : ");
        String mobileNumber = input.next();


        LambdaExpression validFirstName=x->x.matches(firstNamePattern);
        LambdaExpression validLastName = lastNameValid -> lastNameValid.matches(lastNamePattern);
        LambdaExpression valid_email = emailValid -> emailValid.matches(emailPattern);
        LambdaExpression validMobileNumber = mobileNumberValid -> mobileNumberValid.matches(mobileNumberPattern);
        LambdaExpression validPassword = passwordValid -> passwordValid.matches(passwordWithSpecialCharPattern);

        boolean checkFirstName =validFirstName.vallideDetails(firstName);
        boolean checkLastName = validLastName.vallideDetails(lastName);
        boolean check_email = valid_email.vallideDetails(email);
        boolean checkMobileNumber = validMobileNumber.vallideDetails(mobileNumber);
        boolean checkPassword = validPassword.vallideDetails(password);

        /**
         * Check the all user details
         */
        if (checkFirstName == true) {
            System.out.println(firstName + " is valid first name");
        } else {
            System.out.println(firstName + " is not valid first name");
        }
        if (checkLastName == true) {
            System.out.println(lastName + " is valid last name");
        } else {
            System.out.println(lastName + " is not valid last name");
        }
        if (check_email == true) {
            System.out.println(email + " is valid email");
        } else {
            System.out.println(email + " is not valid email");
        }
        if (checkMobileNumber == true) {
            System.out.println(mobileNumber + " is valid mobile number");
        } else {
            System.out.println(mobileNumber + " is not valid mobile number");
        }
        if (checkPassword == true) {
            System.out.println(password + " is valid password");
        } else {
            System.out.println(password + " is not valid password");
        }
    }

    public static void main(String[] args) {
        UserRegistration lambda = new UserRegistration();
        lambda.lambdaExpression();
    }
}
