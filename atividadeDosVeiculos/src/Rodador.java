import java.util.Scanner;

public class Rodador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a marca do carro: ");
        String marca = scanner.nextLine();

        System.out.print("Digite o modelo do carro: ");
        String modelo = scanner.nextLine();

        System.out.print("Digite a cor do carro: ");
        String cor = scanner.nextLine();

        System.out.print("Digite o ano do carro: ");
        int ano = scanner.nextInt();

        System.out.print("Digite o preço do carro: ");
        double preco = scanner.nextDouble();

        System.out.print("Digite o número de portas do carro: ");
        int numeroPortas = scanner.nextInt();

        System.out.print("O carro esta ligado? (true/false): ");
        boolean ligado = scanner.nextBoolean();

        Carro carro1 = new Carro(marca, modelo, cor, ano, preco, numeroPortas, ligado);

        carro1.setMarca(marca);
        carro1.setModelo(modelo);
        carro1.setCor(cor);
        carro1.setAno(ano);
        carro1.setPreço(preco);
        carro1.setNumeroPortas(numeroPortas);
        carro1.setLigado(ligado);

        System.out.println(carro1.getMarca());
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getAno());
        System.out.println(carro1.getPreço());
        System.out.println(carro1.getNumeroPortas());
        System.out.println(carro1.isLigado());



    }
}