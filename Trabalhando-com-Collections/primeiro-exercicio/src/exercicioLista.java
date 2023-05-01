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

        System.out.println("adicione o valor 8 na 4 posição da lista");
        System.out.println("digite o valor q vc deseja incerir: ");
        double valor = input.nextDouble();
        System.out.println("Digite a posição q vc  deseja inserir: ");
        int posicao2 = input.nextInt();
        sla = posicao2 - 1;
        notas.add(sla, valor);
        System.out.println(notas);

        System.out.println("Digite o valor q deseja substiruir: ");
        double valorSub = input.nextDouble();

        sla = notas.indexOf(valorSub);

        if(sla != -1){
            System.out.println("Digite o novo valor: ");
            valorSub = input.nextDouble();
            notas.set(sla, valorSub);
        }else {
            System.out.println("O valor n se encotra na lista");
        }

        System.out.println(notas);

        System.out.println("Verifique se o numero 5 esta na lista");
        System.out.println("Qual numero vc deseja verificar: ");
        valorSub = input.nextDouble();

        if(notas.contains(valorSub)){
            System.out.println("Esse valor consta na lista");
        }else {
            System.out.println("Esse valor n esta na lista");
        }

        System.out.println("Exiba todas as notas na ordem em q foram adicionados");
        for (Double nota : notas) {
            System.out.println(nota);
            
        }

    }
}
