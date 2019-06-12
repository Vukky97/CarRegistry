package TestGUI.LoginTest;

import BackEnd.LoginModel;
import Frontend.LoginView;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import static java.awt.event.KeyEvent.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

public class LoginTestAdmin {
    private Robot GetRobot() throws AWTException{
        Robot robi = new Robot();
        return robi;
        
    }
    
    /**
     * Test that an Admin can login with burned in variables.
     * Check that application really started, created and textfields working.
     * @throws java.awt.AWTException
     */
    @Test
    public void testAdminLogin() throws AWTException {
        System.out.println("Testing AdminLogin with Robot");
        LoginView loginView = new LoginView();
        LoginModel loginModel = new LoginModel(loginView);
        
        assertNotNull(loginView);
        // Name Label position approx: at 125 80 px
        loginView.setVisible(true);
        Robot robi = GetRobot();
        robi.mouseMove(125, 80);
        robi.mousePress(InputEvent.BUTTON1_MASK);
        try{Thread.sleep(100);}catch(InterruptedException e){}
        robi.mouseRelease(InputEvent.BUTTON1_MASK);
        robi.keyPress(VK_A);
        robi.keyRelease(VK_A);
        robi.keyPress(VK_D);
        robi.keyRelease(VK_D);
        robi.keyPress(VK_M);
        robi.keyRelease(VK_M);
        robi.keyPress(VK_I);
        robi.keyRelease(VK_I);
        robi.keyPress(VK_N);
        robi.keyRelease(VK_N);
        try{Thread.sleep(100);}catch(InterruptedException e){}
        
        String actualInput = loginView.GetName();
        String exceptedInput = loginModel.GetAdminName();
        assertEquals(exceptedInput,actualInput);
        
    }
    
    
}
