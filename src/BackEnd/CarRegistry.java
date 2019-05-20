package BackEnd;

import Frontend.LoginView;

public class CarRegistry {
    
    public static void main(String[] args) {
        LoginView loginView = new LoginView();
        LoginModel loginModel = new LoginModel(loginView);
        loginView.setVisible(true);
        
    }
}
