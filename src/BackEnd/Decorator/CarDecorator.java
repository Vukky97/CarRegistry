package BackEnd.Decorator;


public abstract class CarDecorator extends Car {

    private Car car;
    
    @Override
    public int GetPrice() {
        return car.GetPrice();
    }

    @Override
    public String GetExtras() {
        return car.GetExtras();
    }
    
    public CarDecorator(Car car){
        this.car = car;
    }
    
}
