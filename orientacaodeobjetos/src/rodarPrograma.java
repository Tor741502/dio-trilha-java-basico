import java.util.Scanner;

public class rodarPrograma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Carro caro1 = new Carro();

        System.out.println("Digite a cor do carro: ");
        caro1.setColor(input.nextLine());
        System.out.println("Digite o modelo do carro: ");
        caro1.setModel(input.nextLine());
        System.out.println("Digite a capacidade do tanque: ");
        caro1.setTankCapacity(input.nextInt());

        System.out.println("A cor  do seu carro é " + caro1.getColor());
        System.out.println("O modelo do seu carro é " + caro1.getModel());
        System.out.println(" A capacidade do seu tanque é " + caro1.getTankCapacity());
        System.out.println("O valor total do taanque é " + caro1.totValueTank(6.46));

        Carro carro2 = new Carro("cinza", "mercedes", 66);

        System.out.println(carro2.getColor());
        System.out.println(carro2.getModel());
        System.out.println(carro2.getTankCapacity());
        System.out.println(carro2.totValueTank(6.46));
    }
}
