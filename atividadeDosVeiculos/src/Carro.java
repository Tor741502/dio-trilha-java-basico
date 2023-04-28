public class Carro extends Veiculo{
    int numeroPortas;
    boolean ligado;

    Carro(String marca, String modelo, String cor, int ano, double preço, int numeroPortas, boolean ligado){
        super(marca, modelo, cor, ano, preço);
        this.numeroPortas = numeroPortas;
        this.ligado = ligado;
    }

    int getNumeroPortas(){
        return numeroPortas;
    }

    void setNumeroPortas(int numeroPortas){
        this.numeroPortas = numeroPortas;
    }

    boolean isLigado(){
        return ligado;
    }

    void setLigado(boolean ligado){
        this.ligado = ligado;
    }
}
