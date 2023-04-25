import java.util.Scanner;

public class calc{
    public static void soma(double numb1, double numb2){
        System.out.println("digite dois valores  para somar:) ");
        Scanner input = new Scanner(System.in);
        numb1 = input.nextDouble();
        numb2 = input.nextDouble();
        double result = numb1 + numb2;
        System.out.println(result);
    }

    public static void sub(double numb1, double numb2){
        System.out.println("Digite dois valores para subtrair:) ");
        Scanner input = new Scanner(System.in);
        numb1 = input.nextDouble();
        numb2 = input.nextDouble();
        double result = numb1 - numb2;
        System.out.println(result);
    }

    public static void div(double numb1, double numb2){
        System.out.println("Digite dois valores para dividir:) ");
        Scanner input = new Scanner(System.in);
        numb1 = input.nextDouble();
        numb2 = input.nextDouble();
        double result = numb1 / numb2;
        System.out.println(result);
    }

    public static void mult(double numb1, double numb2){
        System.out.println("Digite dois valores para multiplicar:) ");
        Scanner input = new Scanner(System.in);
        numb1 = input.nextDouble();
        numb2 = input.nextDouble();
        double result = numb1 * numb2;
        System.out.println(result);
    }




}
