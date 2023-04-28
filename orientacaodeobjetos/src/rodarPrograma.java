public class rodarPrograma {
    public static void main(String[] args) {
        Carro caro1 = new Carro();

        caro1.setColor("Azul");
        caro1.setModel("Um modelo de carro");
        caro1.setTankCapacity(59);

        System.out.println(caro1.getColor());
        System.out.println(caro1.getModel());
        System.out.println(caro1.getTankCapacity());
        System.out.println(caro1.totValueTank(6.39));

        Carro carro2 = new Carro("cinza", "mercedes", 66);

        System.out.println(carro2.getColor());
        System.out.println(carro2.getModel());
        System.out.println(carro2.getTankCapacity());
        System.out.println(carro2.totValueTank(6.46));
    }
}
