
import java.util.ArrayList;
import java.util.Scanner;


public class Investigation {
    public static void main(String[] args) {
        ArrayList<String> questionario = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        questionario.add("Telefonou para a vitima? ");
        questionario.add("Esteve no local do crrime? ");
        questionario.add("Mora perto da vitima? ");
        questionario.add("Devia para a vitima? ");
        questionario.add("Ja trabalhou com a vitima? ");

        int positivas = 0;

        for (String perguntas : questionario) {
            System.out.println(perguntas);
            String response = input.nextLine();
            if (response.equalsIgnoreCase("sim")){
                positivas++;
            }
            
        }

        if (positivas == 2){
            System.out.println("Suspeito");
        } else if (positivas >= 3 && positivas <= 4) {
            System.out.println("Complice");
            
        } else if (positivas >= 5) {
            System.out.println("Assassino");
            
        }else {
            System.out.println("Inocente");
        }


    }
}
