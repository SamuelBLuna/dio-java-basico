package poo.fundamentos;

public class Play {
    public static void main(String[] args) {

        /*Construtor construtor = new Construtor();

        System.out.println(construtor.getNome());
        System.out.println(construtor.getIdade());
        System.out.println(construtor.getSexo());
        System.out.println(construtor.getAltura());*/

        /*for (EstadoBrasileiro e : EstadoBrasileiro.values()) {
            System.out.println(e.getSigla() + " - " + e.getNome());
        }*/

        EstadoBrasileiro estado = EstadoBrasileiro.CEARA;
        System.out.println(estado.getNome());
        System.out.println(estado.getSigla());
        System.out.println(estado.getNomeMaiusculo());
        System.out.println(estado.getIbge());
    }
}
