import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int numero;

        int maior = 0;

        int cont = 0;

        int soma = 0;

        do{
            System.out.print("Digite um numero: ");
            numero = input.nextInt();
            cont++;
            soma = soma + numero;
            if (numero > maior){
                maior = numero;
            }
        }while (cont < 5);

        System.out.println("O maior numero digitado foi: " + maior);
        System.out.println("A media dos seus numeros é de " + soma/cont);
    }
}
