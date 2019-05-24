package BackEnd;

import BackEnd.BelepesiStrategia;


public class BelepesKivalaszto {
    
    private BelepesiStrategia bs;
    public void BelepesValaszt(BelepesiStrategia BS){
        this.bs=BS;
    }
    public void Login(){
        this.bs.Login();
    }
    
    
}
