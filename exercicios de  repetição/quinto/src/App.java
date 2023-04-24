import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Tabuada: ");
        int tabul = input.nextInt();

        for(int cont = 0; cont <= 10; cont = cont + 1){
            System.out.println(tabul + " x " + cont + " = " + tabul*cont );
        }

        input.close();
    }
}
