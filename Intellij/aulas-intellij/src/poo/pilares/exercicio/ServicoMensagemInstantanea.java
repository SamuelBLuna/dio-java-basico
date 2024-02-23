package poo.pilares.exercicio;

public abstract class ServicoMensagemInstantanea  {
    abstract void enviarMensagem();
	abstract void receberMensagem();
    
	private void validarConectadoInternet() {
		System.out.println("Validando se está conectado a internet");
	}
	private void salvarHistoricoMensagem() {
		System.out.println("Salvando o histórico da mensagem");
	}
}
