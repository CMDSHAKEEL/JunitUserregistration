package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    /*
     ~ Test for The First_Name
     */
    @Test
    public void givenValid_FirstName_ShouldReturn_True(){
        UserRegistrationJUTest userRegistration = new UserRegistrationJUTest();
        boolean result = userRegistration.validFirstName("CMD");
        Assert.assertEquals(true, result);
    }
    @Test
    public void givenInValid_FirstName_ShouldReturn_False() {
        UserRegistrationJUTest userRegistration = new UserRegistrationJUTest();
        boolean result = userRegistration.validFirstName("CMD9");
        Assert.assertFalse(result);
    }
    @Test
    public void givenInValid_FirstName_ShouldReturn_False_Numeric_number(){
        UserRegistrationJUTest userRegistration = new UserRegistrationJUTest();
        boolean result = userRegistration.validFirstName("SHAKEEL");
        Assert.assertFalse(result);
    }
    /*
    ~ Test for The Last_Name
     */
    @Test
    public void givenValid_LastName_ShouldReturn_True(){
        UserRegistrationJUTest userRegistration = new UserRegistrationJUTest();
        boolean result = userRegistration.validLastName("SHAKEEL");
        Assert.assertTrue(result);
    }
    @Test
    public void givenValid_LastName_ShouldReturn_False(){
        UserRegistrationJUTest userRegistration = new UserRegistrationJUTest();
        boolean result = userRegistration.validLastName("SHAKEEL88");
        Assert.assertFalse(result);
    }
    @Test
    public void givenValid_LastName_ShouldReturn_False_Numeric_number(){
        UserRegistrationJUTest userRegistration = new UserRegistrationJUTest();
        boolean result = userRegistration.validLastName("SHAKEEL2");
        Assert.assertFalse(result);
    }
    /*
     ~ Test for The Email
     */
    @Test
    public void givenValid_Email_ShouldReturn_True(){
        UserRegistrationJUTest userRegistration = new UserRegistrationJUTest();
        boolean result = userRegistration.validEmail("cmdshakeel21@gmail.com");
        Assert.assertTrue(result);
    }
    @Test
    public void givenValid_Email_ShouldReturn_False(){
        UserRegistrationJUTest userRegistration = new UserRegistrationJUTest();
        boolean result = userRegistration.validEmail("cmd123@.com");
        Assert.assertFalse(result);
    }
    @Test
    public void givenValid_Email_ShouldReturn_False_Special_Character(){
        UserRegistrationJUTest userRegistration = new UserRegistrationJUTest();
        boolean result = userRegistration.validEmail("cmd$@.com");
        Assert.assertFalse(result);
    }
    /*
     ~ Test for The Mobile Number
     */
    @Test
    public void givenValid_Mobile_Number_ShouldReturn_True(){
        UserRegistrationJUTest userRegistration = new UserRegistrationJUTest();
        boolean result = userRegistration.validMobileNumber(" 9581477386");
        Assert.assertTrue(result);
    }
    @Test
    public void givenValid_Mobile_Number_ShouldReturn_False() {
        UserRegistrationJUTest userRegistration = new UserRegistrationJUTest();
        boolean result = userRegistration.validMobileNumber("91 9000089000");
        Assert.assertFalse(result);
    }
    /*
     ~ Test for The Password
     */
    @Test
    public void givenValid_Password_ShouldReturn_True(){
        UserRegistrationJUTest userRegistration = new UserRegistrationJUTest();
        boolean result = userRegistration.validPassword("Cmd@shakeel1");
        Assert.assertTrue(result);
    }
    @Test
    public void givenValid_Password_ShouldReturn_False(){
        UserRegistrationJUTest userRegistration = new UserRegistrationJUTest();
        boolean result = userRegistration.validPassword("Cmd$$786");
        Assert.assertFalse(result);
    }
    @Test
    public void givenValid_Password_ShouldReturn_False_Should_8_Character(){
        UserRegistrationJUTest userRegistration = new UserRegistrationJUTest();
        boolean result = userRegistration.validPassword("cmd@3");
        Assert.assertFalse(result);
    }
}