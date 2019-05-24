package BackEnd.Strategy;

import Frontend.CarRegistryFrame;

public class AdminLogin extends BelepesiStrategia {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(AdminLogin.class.getName());
    
    @Override
    public void Login() {
        CarRegistryFrame crf = new CarRegistryFrame();
        crf.setVisible(true);
        logger.info("Sikeres bejelentkezés Adminként.");
    }
    
}
