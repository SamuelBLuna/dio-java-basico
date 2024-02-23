package uml.poo.utilidades;

import uml.poo.interfaces.AparelhoTelefonico;
import uml.poo.interfaces.ReprodutorMusical;
import uml.poo.interfaces.NavegadorInternet;

public class MultiFuncoes implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet {
    public void ligar() {
        System.out.println("Ligando");
    }
    public void atender() {
        System.out.println("Atendendo telefone");
    }
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }
    public void tocar() {
        System.out.println("Tocando Musica");
    }
    public void pausar() {
        System.out.println("Pausando musica");
    }
    public void selecionarMusica() {
        System.out.println("Musica selecionada: Liging on a Pleyar");
    }
    public void exibirPagina() {
        System.out.println("Exibindo a pagina");
    }
    public void adcionarNovaAba() {
        System.out.println("Nova aba adicionada");
    }
    public void atualizarPagina() {
        System.out.println("Pagina atualizada");
    }
}
