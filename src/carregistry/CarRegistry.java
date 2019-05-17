package carregistry;

public class CarRegistry {
    

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(CarRegistry.class.getName());
    public static void main(String[] args) {
        LoadLoginForm();
        
    }
    
    public static void LoadLoginForm(){
        LoginFrame loginf = new LoginFrame();
        loginf.setVisible(true);
        logger.info("Sikeres indítási művelet.");
    }
    
    public void LoadRegistryForm(){
        CarRegistryFrame crf = new CarRegistryFrame();
        crf.setVisible(true);
        logger.info("Sikeres bejelentkezés.");
    }
    
    public void LoginAttempt(){
        
        logger.info("Bejelntkezési kisérlet indítása.");
    }
    
}
