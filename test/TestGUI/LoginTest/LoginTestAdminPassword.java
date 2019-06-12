package TestGUI.LoginTest;

import BackEnd.LoginModel;
import Frontend.LoginView;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import static java.awt.event.KeyEvent.VK_A;
import static java.awt.event.KeyEvent.VK_P;
import static java.awt.event.KeyEvent.VK_S;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;
import Automatize.Bot;
import java.awt.Component;
import sun.awt.resources.awt;
import Frontend.LoginView;

public class LoginTestAdminPassword {
    
    Bot bot = new Bot();
    LoginView loginView = new LoginView();
    private LoginView lv;
    
       
    @Test
    public void testGetPassword() throws AWTException {
        try{Thread.sleep(500);}catch(InterruptedException e){}
        System.out.println("Testing Admin password type in with Robot");
        LoginView loginView = new LoginView();
        LoginModel loginModel = new LoginModel(loginView);
        
        assertNotNull(loginView);
        loginView.setVisible(true);
        Robot robi = bot.GetRobot();
        robi.mouseMove(265, 173);
        //Component component = awt.getComponentByName(loginView lv, "TFPassword");
        //robi.mouseMove(loginView.getComponent(0).getX(),loginView.getComponent(2).getY());
        robi.mousePress(InputEvent.BUTTON1_MASK);
        try{Thread.sleep(100);}catch(InterruptedException e){}
        robi.mouseRelease(InputEvent.BUTTON1_MASK);
        robi.keyPress(VK_P);
        robi.keyRelease(VK_P);
        robi.keyPress(VK_A);
        robi.keyRelease(VK_A);
        robi.keyPress(VK_S);
        robi.keyRelease(VK_S);
        robi.keyPress(VK_S);
        robi.keyRelease(VK_S);
        try{Thread.sleep(500);}catch(InterruptedException e){}
        
        String actualInput = loginView.GetPass();
        String exceptedInput = loginModel.GetAdminPass();
        assertEquals(exceptedInput,actualInput);
        
    }
}
