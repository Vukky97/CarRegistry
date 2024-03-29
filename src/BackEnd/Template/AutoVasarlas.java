package BackEnd.Template;

public abstract class AutoVasarlas {
    
    /**
     * Template Method, Simple OrderList:
     * Check and Clean Methods are common, others are different.
     */
    public void VasarlasMenete(){
        // végrehajtási lista
        Check();
        Clean();
        ManageWarrantee();
        TransportToHouse();
        
    }
    // kotelzezo kozos lepesek
    private void Check(){
        System.out.println("Ellenorizzuk az autó meglétét és állapotát.");
    }
    private void Clean(){
        System.out.println("Letisztitjuk az eladásra kínált autót");
    }
    // kotelezo nem kozos lepesek
    protected abstract void ManageWarrantee();
    // opcionalis, hook metodus
    protected void TransportToHouse(){};
    
}
