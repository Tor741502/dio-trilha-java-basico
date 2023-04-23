import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int nota;


        System.out.println("Digite sua nota: ");
        nota = input.nextInt();

        while (nota > 10 || nota < 0){
            System.out.println("Você digitou um valor invalido, tente novamente: ");
             nota = input.nextInt();
        }

        System.out.println("fim");
    }
}
