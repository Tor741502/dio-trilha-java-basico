import java.text.DecimalFormat;
import java.util.Scanner;
public class idadePlaneta {
    // Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma:
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double idadeTerrestre = scanner.nextDouble();
            String planeta = scanner.next();
            DecimalFormat formato = new DecimalFormat("#.00");

            Double Marte = idadeTerrestre/1.88;
            Double Jupiter = idadeTerrestre/11.86;
            Double Venus = idadeTerrestre/0.62;

            if (planeta.equalsIgnoreCase("marte")){
                System.out.println(formato.format(Marte));
            } else if (planeta.equalsIgnoreCase("jupiter")) {
                System.out.println(formato.format(Jupiter));
            } else if (planeta.equalsIgnoreCase("venus")) {
                System.out.println(formato.format(Venus));
            }else {
                System.out.println("Valor invalido! Que paia.");
            }


            scanner.close();
        }
    }

