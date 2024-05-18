/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.unit_testing_three;

/**
 *
 * @author Novashnee
 */
public class Message {
    
    // Method displaying Greeting Message 
    public String greeting(){
        return "Hello"; 
    }
    
    // Method Checking if a number is valid
    public boolean validNumber(int x){
        if(x >= 4){
            return true;
        }
        else{
            return false;
        }
    }
    
    // Method Checking if the password meets complexity requirements
    public boolean checkPassword(String password){
        
        String requirements = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!])(?=\\S+$).{8,}$";
  
        return password.matches(requirements) && password.length() >= 8;  
    }
    
    // Method Checking if the username meets the requirements
    public boolean checkUsername(String username){
        return username.contains("_") && 
               username.length() >= 5;
    }
    
}
