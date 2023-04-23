import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int numero;

        int maior = 0;

        int cont = 0;

        do{
            System.out.print("Digite um numero: ");
            numero = input.nextInt();
            cont++;
            if (numero > maior){
                maior = numero;
            }
        }while (cont < 5);

        System.out.println("O maior numero digitado foi: " + maior);
    }
}
