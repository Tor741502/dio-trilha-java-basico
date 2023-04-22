public class SmartTv{
    boolean lidada = false;
    int volume = 25;
    int canal = 1;

    public void ligar(){
        lidada = true; 
    }

    public void desligar(){
        lidada = false;
    }

    public void aumentarVolume(){
        volume++;
    }

    public void diminuirVolume(){
        volume--;
    }

    public void subirCanal(){
        canal++;
    }

    public void baixarCanal(){
        canal--;
    }

    public void mudarCanal(int mudar){
        canal = mudar;
    }



}