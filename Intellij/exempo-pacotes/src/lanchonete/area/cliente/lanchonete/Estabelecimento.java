package lanchonete.area.cliente.lanchonete;

import lanchonete.area.cliente.lanchonete.area.cliente.Cliente;
import lanchonete.area.cliente.lanchonete.atendimento.Atendente;
import lanchonete.area.cliente.lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
    public static void main(String[] args) {
        Cozinheiro cozinheiro = new Cozinheiro();

        //ações que estabelecimento precisa ter ciência
        cozinheiro.adicionarSucoNoBalcao();;
        cozinheiro.adicionarLancheNoBalcao();
        cozinheiro.adicionarComboNoBalcao();

        Atendente atendente = new Atendente();

        atendente.receberPagamento();
        atendente.servindoMesa();

        Cliente cliente = new Cliente();

        cliente.escolherLanche();
        cliente.fazerPedido();
        cliente.pagarConta();

    }
}