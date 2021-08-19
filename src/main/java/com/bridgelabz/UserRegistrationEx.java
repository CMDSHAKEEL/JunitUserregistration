package com.bridgelabz;

import java.util.regex.Pattern;

public class UserRegistrationEx {
    //Throws UserRegistrationException  of First Name

    public boolean validFirstName (String FirstName) throws UserRegistrationException {
        boolean result = Pattern.matches("^[A-z][a-z]{2,}$", FirstName);
        if (result)
            return true;
        else
            throw new UserRegistrationException("Invalid First Name");
    }
    //Throws UserRegistrationException of Last Name
    public boolean validLastName (String LastName) throws UserRegistrationException {
        boolean result = Pattern.matches("^[A-z][a-z]{2,}$", LastName);
        if (result)
            return true;
        else
            throw new UserRegistrationException("Invalid Last Name");
    }
    //Throws UserRegistrationException of Mobile Number
    public boolean validMobileNumber (String MobileNumber) throws UserRegistrationException {
        boolean result = Pattern.matches("^[0-9]{0,2}\\s{0,1}[0-9]{10}", MobileNumber);
        if (result)
            return true;
        else
            throw new UserRegistrationException("Invalid Mobile Number");
    }
    //Throws UserRegistrationException of Email
    public boolean validEmail (String Email) throws UserRegistrationException {
        boolean result = Pattern.matches("^[a-zA-Z]+([.][a-zA-Z]+)*@[a-zA-Z]+[.][a-zA-Z]{2,3}+([.][a-zA-Z]{2}+)*$", Email);
        if (result)
            return true;
        else
            throw new UserRegistrationException("Invalid Email");
    }
    //Throws UserRegistrationException of Password
    public boolean validPassword (String Password) throws UserRegistrationException {
        boolean result = Pattern.matches("^(?=.*[A-Z])(?=.*[a-z])(?=[^!@#$%^&+=]*[!@#$%^&+=][^!@#$%^&+=]*$)(?=.*[0-9]).{8,}$", Password);
        if (result)
            return true;
        else
            throw new UserRegistrationException("Invalid Password");
    }
}