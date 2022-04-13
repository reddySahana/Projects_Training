package com.ecommerce.tests;
  

public class User 
{
    // Main CLass
    public void User()
    {
        // Declaring the username and password
        String user_name = "Alexa";
        String password = "12345";
          
        // Checking the validity of the input
        if(user_name.equals("Alexa") && password.equals("12345"))
        {
            // Printing Output
            System.out.println("Authentication Successful");
        }
        else
        {
            // Printing Output
            System.out.println("User name/ Password not matching");
        }
    }
}