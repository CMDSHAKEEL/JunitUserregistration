package com.bridgelabz;

import java.util.regex.Pattern;

public class UserRegistrationJUTest {
    private static final String FIRST_NAME = "[A-Z][a-z]{2,}+$";
    private static final String LAST_NAME = "[A-Z][a-z]{2,}+$";
    private static final String EMAIL ="^[a-zA-Z]+([.][a-zA-Z]+)*@[a-zA-Z]+[.][a-zA-Z]{2,3}+([.][a-zA-Z]+)*$";
    private static final String MOBILE_NUMBER = "^[0-9]{0,2}\\s{0,1}[0-9]{10}";
    private static final String PASSWORD = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&-+=()]).{8,}$";

    public boolean validFirstName(String FirstName) {
        return Pattern.matches(FIRST_NAME,FirstName);
    }

    public boolean validLastName(String LastName) {
        return Pattern.matches(LAST_NAME, LastName);
    }

    public boolean validEmail(String Email) {
        return Pattern.matches(EMAIL, Email);
    }

    public boolean validMobileNumber(String MobileNumber) {
        return Pattern.matches(MOBILE_NUMBER, MobileNumber);
    }

    public boolean validPassword(String Password) {
        return Pattern.matches(PASSWORD, Password);
    }
}
