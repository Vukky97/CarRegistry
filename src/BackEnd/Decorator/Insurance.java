package BackEnd.Decorator;


public class Insurance extends CarDecorator {
    
    private int InsuranceCost = 200000;
    
    @Override
    public int GetPrice(){
        return super.GetPrice() + InsuranceCost;
    }
    
    @Override 
    public String GetExtras(){
        return super.GetExtras() + " | Insurance";
    }
    
    
    public Insurance(Car car) {
        super(car);
    }
    
}
