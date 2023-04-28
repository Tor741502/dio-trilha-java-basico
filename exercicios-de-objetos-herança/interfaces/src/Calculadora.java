public class Calculadora implements OperacaoMatemaquina {
    @Override
    public void soma(int a, int b){
        System.out.println(a + b);
    }

    @Override
    public void subtrair (int a, int b){
        System.out.println(a - b);
    }

    @Override
    public void multiplicar (double a, double b){
        System.out.println(a * b);
    }

    @Override
    public void dividir (double a, double b){
        System.out.println(a / b);
    }
}
