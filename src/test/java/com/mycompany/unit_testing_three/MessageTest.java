/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.unit_testing_three;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Novashnee
 */
public class MessageTest {
    
    public MessageTest() {
    }

    @Test
    public void testGreeting() {
        // Create an instance of the Message Class 
        Message m = new Message(); 
        
        // Declarations and Assignments 
        String expected = "Hello"; 
        String actual = m.greeting(); 
        
        // AssertEquals Method 
        assertEquals(expected,actual);
    }

    @Test
    public void testValidNumberPass() {
        // Create an instance of the Message Class 
        Message m = new Message(); 
        
        // Declaration and Assignments 
        boolean expected = true; 
        boolean actual = m.validNumber(6);
        
        // AssertTrue Method 
        assertTrue(actual);
    }

    @Test
    public void testValidNumberFail() {
        // Create an instance of the Message Class 
        Message m = new Message(); 
        
        // Declaration and Assignments 
        boolean expected = true; 
        boolean actual = m.validNumber(2);
        
        // AssertTrue Method 
        assertFalse(actual);
    }
   
    @Test
    public void testCheckPasswordPass() {
        // Create an instance of the Message Class 
        Message m = new Message(); 
        
        // Declaration and Asssignments 
        boolean expected = true; 
        boolean actual = m.checkPassword("Chesepeek123#");
        
        // AssertTrue Method 
        assertTrue(actual);
    }
    
        @Test
    public void testCheckPasswordFail() {
        // Create an instance of the Message Class 
        Message m = new Message(); 
        
        // Declaration and Asssignments 
        boolean expected = true; 
        boolean actual = m.checkPassword("Chesepe");
        
        // AssertTrue Method 
        assertFalse(actual);
    }

    @Test
    public void testCheckUsernamePass() {
        // Create an instance of the Message Class 
        Message m = new Message(); 
        
        // Declaration and Assignments 
        boolean expected = true; 
        boolean actual = m.checkUsername("Kylaa_");
        
        // AssertTrue Method 
        assertTrue(actual);
    }
    
    @Test
    public void testCheckUsernameFail() {
        // Create an instance of the Message Class 
        Message m = new Message(); 
        
        // Declaration and Assignments 
        boolean expected = true; 
        boolean actual = m.checkUsername("Kat");
        
        // AssertTrue Method 
        assertFalse(actual);
    }    
    
}
