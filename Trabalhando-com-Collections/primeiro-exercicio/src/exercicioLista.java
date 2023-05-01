import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercicioLista {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Double> notas = new ArrayList<>();

        for (int n = 1; n <= 7; n++){
            System.out.println("Digite a " + n + " nota: ");
            double nota = input.nextDouble();
            notas.add(nota);
        }

        System.out.println(notas);

        System.out.println("Digite o valor q vc deseja achar a posicao: ");
        double posicao = input.nextDouble();
        int sla = notas.indexOf(posicao) + 1;

        if (sla > 0) {
            System.out.println("A posição do valor é: " + sla);
        } else {
            System.out.println("O valor não está na lista!");
        }




    }
}
