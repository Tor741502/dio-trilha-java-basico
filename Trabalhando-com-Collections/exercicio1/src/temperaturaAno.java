import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class temperaturaAno {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Double> temps = new ArrayList<>();

        System.out.println("Digite a temperatura média dos 6 primeiros meses do ano: ");

        for (int cont = 1; cont <= 6; cont++){
            System.out.println("Digite o " + cont + " valor: ");
            double temperatura = input.nextDouble();
            temps.add(temperatura);
        }

        double soma = 0;
        for (double temp : temps) {
            soma = soma + temp;
        }

        double media = soma/temps.size();
        System.out.println(media);

        for (double temp : temps) {
            if(temp > media){
                System.out.println(temp);
            }
        }

        String[] meses = {"janeiro", "fevereiro", "março", "abril", "maio", "junho"};

        System.out.println("Temperaturas acima da média e seus meses correspondentes: ");
        for (int numb = 0; numb < temps.size(); numb++){
            if (temps.get(numb) > media){
                System.out.println(temps.get(numb) + " " + meses[numb]);
            }
        }
    }

}
