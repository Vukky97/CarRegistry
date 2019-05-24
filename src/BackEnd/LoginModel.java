package BackEnd;

import Frontend.LoginView;
import Frontend.CarRegistryFrame;
import Frontend.CRUserFrame;
import BackEnd.AdminLogin;
import BackEnd.UserLogin;


public class LoginModel {
    
    private LoginView lview;
    
    private String AdminName = "admin";
    private String AdminPassword = "pass";
    private String UserName = "user";
    private String UserPassword = "1234";
    private int numberOfTry = 0;
    private int maxNumberOfTry = 5;
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(LoginModel.class.getName());
    
    
    public LoginModel(LoginView view){
        this.lview = view;
    }
    
    public void CheckTypeOfLogin(){
        numberOfTry++;
        logger.info("Bejelentkezési kisérlet indítása.");
        switch(lview.GetName()){
            case "admin":
                if(lview.GetPass().equals(this.AdminPassword)){
                BelepesKivalaszto loginType = new BelepesKivalaszto();
                loginType.BelepesValaszt(new AdminLogin());
                loginType.Login();
            }
                break;
            case "user":
                if(lview.GetPass().equals(this.UserPassword)){
                BelepesKivalaszto loginType = new BelepesKivalaszto();
                loginType.BelepesValaszt(new UserLogin());
                loginType.Login();
            }
                
                break;
            default:
                LoginError();
            
            
        }
    }
    
    private void LoginError(){
        String StringMsg = "Invalid Login Attempt! Please Try Agin!";
        logger.info("Sikerelen bejelentkezés, próbálja meg újra!");
        lview.SetErrorLabel(StringMsg);
    }
    
    
}



