import java.util.*;


public class setPrimeiro {
    public static void main(String[] args) {
        Set<Double> notas = new HashSet<>();
        Scanner input = new Scanner(System.in);

        System.out.println("Criei um código que le 7 valores e adiciona em um conjunto não ordenado");

        for (int i = 1; i <= 7; i++){
            System.out.println("Digite a nota " + i);
            double nota = input.nextDouble();
            notas.add(nota);
        }

        System.out.println("criei um modo para conferir se o valor q vc digitar esta nesse conjunto");
        System.out.println("Qual valor vc deseja conferir se sta no conjunto?");
        double valorEsta = input.nextDouble();

        if(notas.contains(valorEsta)){
            System.out.println("Esta no conjunto");
            System.out.println(notas);
        }else {
            System.out.println("Não esta no conjunto");
            System.out.println(notas);
        }

        System.out.println("agora é para imprimir o maior e menor valor");

        double maiorValor = Collections.max(notas);
        double menorValor = Collections.min(notas);

        System.out.println("Maior valor " + maiorValor + " e menor valor " + menorValor);

        System.out.println("o codigo agora vai calcular a soma e a media");

        double soma = 0;
        for (Double nota : notas) {
            soma = soma + nota;
        }
        double media = soma/notas.size();
        System.out.println(soma);
        System.out.println(media);

        System.out.println("agora, vc pode decidir a nota q sera removida do programa =)");
        System.out.println("Qual nota vc deseja remover?");
        double removerNota = input.nextDouble();

        if (notas.contains(removerNota)){
            notas.remove(removerNota);
            System.out.println("Nota removida");
            System.out.println(notas);
        }else {
            System.out.println("Essa nota n esta no programa e acho dificil remover o inexistente =)");
        }

        System.out.println("Agora vc pode excluir todos os valores abaixo do valor q decidir");
        System.out.println("Vc quer remover todos os numeros abaixo de: ");
        double excluitor = input.nextDouble();

        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            double next = iterator1.next();
            if(next < excluitor){
                iterator1.remove();
            }
        }

        System.out.println(notas);

        System.out.println("Agora a ideia é criar outro set com outro conjunto e imprimir as coisas em ordem");
        Set<Double> notas2 = new LinkedHashSet<>();

        for (int c = 1; c <= 5; c++){
            System.out.println("Digite a nota " + c + ": ");
            double nota1 = input.nextDouble();
            notas2.add(nota1);
        }

        System.out.println(notas2);

        System.out.println("Agora em ordem crescente");

        Set<Double> ordemCrescente = new TreeSet<>(notas2);
        System.out.println(ordemCrescente);


        System.out.println("Apague todo o conjunto");
        notas.clear();

        System.out.println("Confira se o conjunto está vazio: " + notas.isEmpty());
        System.out.println("Confira se o conjunto 2 está vazio: " + notas2.isEmpty());
        System.out.println("Confira se o conjunto 3 está vazio: " + ordemCrescente.isEmpty());

    }
}
