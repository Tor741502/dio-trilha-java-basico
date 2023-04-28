public class Veiculo {
    String marca;
    String modelo;
    String cor;
    int ano;
    double preço;


    Veiculo(String marca, String modelo, String cor, int ano, double preço){
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.preço = preço;
    }

    String getMarca(){
        return marca;
    }

    void setMarca(String marca){
        this.marca = marca;
    }

    String getModelo(){
        return modelo;
    }

    void setModelo(String modelo){
        this.modelo = modelo;
    }

    String getCor(){
        return cor;
    }

    void setCor(String cor){
        this.cor = cor;
    }

    int getAno(){
        return ano;
    }

    void setAno(int ano){
        this.ano = ano;
    }

    double getPreço(){
        return preço;
    }

    void setPreço(double preço){
        this.preço = preço;
    }

}
