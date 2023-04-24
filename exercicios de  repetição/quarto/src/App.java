import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int qnumeros;
        int cont = 0;
        int pares = 0, inpares = 0;
        int numb;

        System.out.println("Digite uma quantidade de numeros: ");
        qnumeros = input.nextInt();

        do{
            System.out.print("Digite seus numeros? ");
            numb = input.nextInt();
            if(numb %  2 == 0){
                pares++;
            }else{
                inpares++;
            }
            cont++;
        }while(cont < qnumeros);

        System.out.println("Pares: " + pares);
        System.out.println("impares: " + inpares);
    }
}
