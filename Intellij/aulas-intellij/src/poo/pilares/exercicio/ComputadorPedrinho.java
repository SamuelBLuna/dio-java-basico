package poo.pilares.exercicio;

public class ComputadorPedrinho {
    public static void main(String[] args) {
		//abrindo MSN Messenger
		MSNMessenger msn = new MSNMessenger();		
		msn.enviarMensagem();		
		msn.receberMensagem();

		FacebookMessenger fcb = new FacebookMessenger();		
		fcb.enviarMensagem();		
		fcb.receberMensagem();

		Telegram tlm = new Telegram();		
		tlm.enviarMensagem();		
		tlm.receberMensagem();
	}
}
