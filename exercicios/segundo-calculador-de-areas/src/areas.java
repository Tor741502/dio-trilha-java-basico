import java.util.Scanner;

public class areas {
    public static void area(double lado){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite valor de um lado do quadrado: ");
        lado = input.nextDouble();
        System.out.println("Area do quadrado =) " + lado * lado);

    }

    public static void area(double lado1, double lado2){
        Scanner input = new Scanner(System.in);

        System.out.println("Retangulo lados: ");

        lado1 = input.nextDouble();
        lado2 = input.nextDouble();
        System.out.println("Area do retângulo =) " + lado1 * lado2);
    }

    public static void area(double bsMaior, double bsMenor, double altura){
        Scanner input = new Scanner(System.in);

        System.out.println("Trapézio: ");
        
        System.out.println("Digite a base maior: ");
        bsMaior = input.nextDouble();

        System.out.println("Digite a base menor: ");
        bsMenor = input.nextDouble();

        System.out.println("Digite a altura: ");
        altura = input.nextDouble();

        System.out.println((bsMaior + bsMenor)*altura/2);
    }
}
