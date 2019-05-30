package BackEnd.Decorator;

import Frontend.CRUserFrame;

public class BasicCar extends Car{

    //CRUserFrame CRUserFrame = new CRUserFrame();
    private CRUserFrame CRUFrame ;
    
    public BasicCar(CRUserFrame CRUF){
        this.CRUFrame = CRUF;
    }
    
    @Override
    public int GetPrice() {
        return Integer.valueOf(CRUFrame.GetSelectedCarValue());
        //return Integer.valueOf(CRUserFrame.GetSelectedCarValue());
    }

    @Override
    public String GetExtras() {
        return "Összes tartozékával | ";
    }
    
}
