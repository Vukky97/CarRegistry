package BackEnd;

import BackEnd.LoginModel;
import Frontend.CarRegistryFrame;

public class AdminLogin extends BelepesiStrategia {
    
    private LoginModel lm;
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(AdminLogin.class.getName());
    
    @Override
    public void Login() {
        //lm.LoginAttempt();
        
        CarRegistryFrame crf = new CarRegistryFrame();
        crf.setVisible(true);
        logger.info("Sikeres bejelentkezés.");
    }
    
}
