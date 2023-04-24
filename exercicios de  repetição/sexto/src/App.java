import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int fat; 
        int mult = 1;
        System.out.println("Fatorial: ");
        fat = input.nextInt();

        for(int i = fat ;i >= 1 ; i-- ){
            mult = mult*i;
        }

        input.close();

        System.out.println(mult);
    }
}
