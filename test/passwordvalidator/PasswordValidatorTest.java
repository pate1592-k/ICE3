/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordvalidator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class PasswordValidatorTest 
{
    
    public PasswordValidatorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        PasswordValidator.main(args);
        fail("The test case is a prototype.");
    }

    @Test
    public void testCheckLengthGood() {
        System.out.println("checkLength Good test");
        String password = "khushali";
        boolean expResult = true;
        boolean result = PasswordValidator.checkLength(password);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testCheckLengthBad() {
        System.out.println("checkLength Bad test case");
        String password = "khushi";
        boolean expResult = false;
        boolean result = PasswordValidator.checkLength(password);
        assertEquals(expResult, result);
    }
    @Test
    public void testCheckLengthBoundary() {
        System.out.println("checkLength Boundary");
        String password = "";
        boolean expResult = false;
        boolean result = PasswordValidator.checkLength(password);
        assertEquals(expResult, result);
    }
}
