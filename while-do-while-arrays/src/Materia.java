public class Materia{
    public static void main(String[] args) throws Exception{
        App minhaEscrita = new App();

        minhaEscrita.escrever("O comando while e ultilizado para repetir um blocco de codigo, enquanto esse codigo for verdadeiro");

        minhaEscrita.escrever("um exemplo disso, seria, declarar ma variavel inteira igual a 1 e ultilizar um while para que enquanto essa variavel for menor igual a 7 o codigo ser executado");

        minhaEscrita.escrever("para que o codigo n se repita para sempre, é importante aumentar o valor dessa variavel. Segue o exemplo: ");

        int i = 1;

        while(i <= 7){
            System.out.println(i + " variavel i");
            i++;
        }

        minhaEscrita.escrever("Sobre o do while, ele faz a mesma coisa que o while, com a diferença que ele primeiro executa uma parte do codigo, para dps checar se ela e uma condicao verdadeira, e assim executar o resto");

        int i2 = 1;

        do{
            System.out.println(i2 + " variavel i2");
            i2++;
        }while(i2 <= 7);

        minhaEscrita.escrever("o for funciona quase igual com a diferença q antes de dizer oq o codigo faz, ele primeiro vai declarar o inicio, como quanto vale uma determinada variavel, depois vai analisar a condicao, como executar um codigo enquanto uma variavel for  menor que 7, e dps vai atualizar o codigo, mudando o valor de uma variavel");

        int i3 = 1;

        for(i3 = 1; i3 <= 7; i3++){
            System.out.println(i3 + " variavel i3");
        }

    }
}