package BackEnd;

import BackEnd.LoginModel;
import Frontend.CRUserFrame;

public class UserLogin extends BelepesiStrategia {

    private LoginModel lm;
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(AdminLogin.class.getName());
    
    @Override
    public void Login() {
        CRUserFrame cruf = new CRUserFrame();
        cruf.setVisible(true);
        logger.info("Sikeres bejelentkezés.");
    }
    
}
