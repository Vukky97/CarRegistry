package BackEnd.Decorator;


public class Warrantee extends CarDecorator {
    
    private int WarranteeCost = 150000;
    @Override
    public int GetPrice(){
        return super.GetPrice() + WarranteeCost;
    }
    
    @Override
    public String GetExtras(){
        return super.GetExtras() + " Warrantee |";
    }
    
    
    public Warrantee(Car car) {
        super(car);
    }
    
}
