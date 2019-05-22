package BackEnd;

import Frontend.LoginView;
import Frontend.CarRegistryFrame;


public class LoginModel {
    
    private LoginView lview;
    
    private String AdminName = "admin";
    private String AdminPassword = "pass";
    private String UserName = "user";
    private String UserPassword = "1234";
    private int numberOfTry = 0;
    private int maxNumberOfTry = 5;
    
    
    public LoginModel(LoginView view){
        this.lview = view;
    }
    
    //TODO: switch es meghivni megfelelo viselkeest v staregia
    public void CheckUserAcces(){
        LoginAttempt();
        if(lview.GetName().equals(this.AdminName)&& numberOfTry <= maxNumberOfTry){
            if(lview.GetPass().equals(this.AdminPassword)){
                LoadRegistryForm();
            }
            else{
                LoginError();
            }
        }
        else{
            LoginError();
        }
    }
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(LoginModel.class.getName());
    
    private void LoadRegistryForm(){
        CarRegistryFrame crf = new CarRegistryFrame();
        crf.setVisible(true);
        logger.info("Sikeres bejelentkezés.");
    }
    
    private void LoginError(){
        String StringMsg = "Invalid Login Attempt! Please Try Agin!";
        logger.info("Sikerelen bejelentkezés, próbálja meg újra!");
        lview.SetErrorLabel(StringMsg);
    }
    
    public void LoginAttempt(){
        numberOfTry++;
        logger.info("Bejelentkezési kisérlet indítása.");
    }
    
}
