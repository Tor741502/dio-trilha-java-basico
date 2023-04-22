public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("Tv ligada ? " + smartTv.lidada);
        System.out.println("Volume atual: " + smartTv.volume);
        System.out.println("Canal atual: " + smartTv.canal);


        smartTv.ligar();
        System.out.println("novo status -> Tv ligada? " + smartTv.lidada);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println(smartTv.volume);

        smartTv.subirCanal();
        smartTv.subirCanal();
        smartTv.baixarCanal();

        System.out.println(smartTv.canal);

        smartTv.mudarCanal(15);

        System.out.println(smartTv.canal);

        smartTv.desligar();

        System.out.println(smartTv.lidada);


    }
}
