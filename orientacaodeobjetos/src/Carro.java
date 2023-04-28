public class Carro {
    String color;
    String model;
    int tankCapacity;

    Carro(){

    }

    Carro(String color, String model, int tankCapacity){
        this.color = color;
        this.model = model;
        this.tankCapacity = tankCapacity;
    }

    void setColor(String color){
        this.color = color;
    }

    String getColor(){
        return color;
    }

    void setModel(String model){
        this.model = model;
    }

    String getModel(){
        return model;
    }

    void setTankCapacity(int tankCapacity){
        this.tankCapacity = tankCapacity;
    }

    int getTankCapacity(){
        return tankCapacity;
    }

    double totValueTank(double fuelValue){
        return tankCapacity * fuelValue;
    }


}
