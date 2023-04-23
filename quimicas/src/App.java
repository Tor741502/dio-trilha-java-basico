import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int aN, aM, n;
        
        System.out.println("Digite o número de prótons:");
        aN = scanner.nextInt();
        
        System.out.println("Digite o número de nêutrons:");
        n = scanner.nextInt();
        
        aM = aN + n;
        
        System.out.println("(Z) Número atômico: " + aN);
        System.out.println("(A) Número de massa: " + aM);

        scanner.close();
    }
    

}

