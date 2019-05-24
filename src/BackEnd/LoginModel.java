package BackEnd;

import BackEnd.Strategy.BelepesKivalaszto;
import BackEnd.Strategy.AdminLogin;
import BackEnd.Strategy.UserLogin;
import Frontend.LoginView;

public class LoginModel {
    
    private LoginView lview;
    
    private String AdminName = "admin";
    private final String AdminPassword = "pass";
    private String UserName = "user";
    private final String UserPassword = "1234";
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(LoginModel.class.getName());
    
    
    public LoginModel(LoginView view){
        this.lview = view;
    }
    
    public void CheckTypeOfLogin(){
        logger.info("Bejelentkezési kisérlet indítása.");
        switch(lview.GetName()){
            case "admin":
                if(lview.GetPass().equals(this.AdminPassword)){
                BelepesKivalaszto loginType = new BelepesKivalaszto();
                loginType.BelepesValaszt(new AdminLogin());
                loginType.Login();
                }
                else{
                    LoginError(); 
                }
                break;
            case "user":
                if(lview.GetPass().equals(this.UserPassword)){
                BelepesKivalaszto loginType = new BelepesKivalaszto();
                loginType.BelepesValaszt(new UserLogin());
                loginType.Login();
                }
                else{
                    LoginError(); 
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



