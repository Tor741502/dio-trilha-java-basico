import java.util.*;


public class testeDeString {
    public static void main(String[] args) {
        Set<String> teste = new HashSet<>();
        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 3; i++){
            System.out.println("Digite oq gostaria de adicionar na lista: ");
            String coisas = input.nextLine();
            teste.add(coisas);
        }

        String menorPalavra = Collections.min(teste, Comparator.comparing(String::length));
        String maiorPalavra = Collections.max(teste, Comparator.comparing(String::length));

        System.out.println(teste);
        System.out.println(menorPalavra);
        System.out.println(maiorPalavra);
    }
}
