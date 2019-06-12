package TestGUI;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import static java.awt.event.KeyEvent.*;
import org.junit.Test;
import static org.junit.Assert.*;
import BackEnd.LoginModel;
import Frontend.LoginView;
import org.junit.After;

public class LoginTestUser {
    public LoginTestUser(){
        
    }
    
    /*
    Initializing a Robot to test our swing app.
    Returns a robot to the caller (each test method),
    its elgant, prevent code duplication.
    */
    private Robot GetRobot() throws AWTException{
        Robot robi = new Robot();
        return robi;
        
    }
    
     /**
     * Test of GetName method, of class LoginView.
     * Check that application really started, created and textfields working.
     * @throws java.awt.AWTException
     */
    @Test
    public void testUserGetName() throws AWTException {
        System.out.println("Testing User GetName with Robot");
        LoginView instance = new LoginView();
        
        assertNotNull(instance);
        // Name Label position approx: at 125 80 px
        instance.setVisible(true);
        Robot robi = GetRobot();
        robi.mouseMove(265, 135);
        robi.mousePress(InputEvent.BUTTON1_MASK);
        try{Thread.sleep(100);}catch(InterruptedException e){}
        robi.mouseRelease(InputEvent.BUTTON1_MASK);
        robi.keyPress(VK_U);
        robi.keyRelease(VK_U);
        robi.keyPress(VK_S);
        robi.keyRelease(VK_S);
        robi.keyPress(VK_E);
        robi.keyRelease(VK_E);
        robi.keyPress(VK_R);
        robi.keyRelease(VK_R);
        try{Thread.sleep(100);}catch(InterruptedException e){}
        
        String actualInput = instance.GetName();
        String exceptedInput = "user";
        assertEquals(exceptedInput,actualInput);
       
        
    }
    
    //@After
    /**
     * testing the password field with robot,if you move the textfields
     * then update the robi.mousemove too!
     * @throws AWTException 
     */
    @Test
    public void testGetPassword() throws AWTException {
        try{Thread.sleep(500);}catch(InterruptedException e){}
        System.out.println("Testing User GetPassword with Robot");
        LoginView loginView = new LoginView();
        LoginModel loginModel = new LoginModel(loginView);
        
        assertNotNull(loginView);
        loginView.setVisible(true);
        Robot robi = GetRobot();
        robi.mouseMove(265, 175);
        robi.mousePress(InputEvent.BUTTON1_MASK);
        try{Thread.sleep(100);}catch(InterruptedException e){}
        robi.mouseRelease(InputEvent.BUTTON1_MASK);
        robi.keyPress(VK_1);
        robi.keyRelease(VK_1);
        robi.keyPress(VK_2);
        robi.keyRelease(VK_2);
        robi.keyPress(VK_3);
        robi.keyRelease(VK_3);
        robi.keyPress(VK_4);
        robi.keyRelease(VK_4);
        try{Thread.sleep(500);}catch(InterruptedException e){}
        
        String actualInput = loginView.GetPass();
        String exceptedInput = loginModel.GetUserPass();
        assertEquals(exceptedInput,actualInput);
        
    }

//    /**
//     * Test of GetPass method, of class LoginView.
//     */
//    @Test
//    public void testGetPass() throws AWTException {
//        GetRobot();
//        System.out.println("GetPass");
//        LoginView instance = new LoginView();
//        String expResult = "";
//        String result = instance.GetPass();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

//    /**
//     * Test of SetErrorLabel method, of class LoginView.
//     */
//    @Test
//    public void testSetErrorLabel() {
//        System.out.println("SetErrorLabel");
//        String ErrorMsg = "";
//        LoginView instance = new LoginView();
//        instance.SetErrorLabel(ErrorMsg);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of CleanInputFields method, of class LoginView.
//     */
//    @Test
//    public void testCleanInputFields() {
//        System.out.println("CleanInputFields");
//        LoginView instance = new LoginView();
//        instance.CleanInputFields();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}

