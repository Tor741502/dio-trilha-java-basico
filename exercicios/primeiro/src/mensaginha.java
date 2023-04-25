import java.util.Scanner;

public class mensaginha {


        public static void obterMensagem(int hora) {
            Scanner input = new Scanner(System.in);
            
            System.out.println("Digite a hora do dia em um numero redondo, inteiro e valido, para facilitar minha vida =) ");

            hora = input.nextInt();

            
            switch (hora) {
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                    mensagemBomDia();
                    break;
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                    mensagemBoaTarde();
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                    mensagemBoaNoite();
                    break;
                default:
                    System.out.println("Eu n acabei de falar para digitar um valor valido???? >=(" );
                    break;
            }
        }
    
        public static void mensagemBomDia() {
            System.out.println("Espero que vc tenha um bom dia/manhã =) ");
        }
    
        public static void mensagemBoaTarde() {
            System.out.println("Espero que vc tenha uma boa tarde! =) ");
        }
    
        public static void mensagemBoaNoite() {
            System.out.println("Bom dia!");
            System.out.println("Eu sei q está de noite, mas tipo... o dia é 24 hrs né? =) ");
        }
    
    }
