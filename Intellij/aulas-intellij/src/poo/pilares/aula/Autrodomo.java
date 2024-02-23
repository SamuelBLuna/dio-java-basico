package poo.pilares.aula;

public class Autrodomo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setChassi("21583");
        jeep.ligar();
        System.out.println("------------------");
        Moto z400 = new Moto();
        z400.setChassi("467754");
        z400.ligar();
        System.out.println("------------------");
    }
}
