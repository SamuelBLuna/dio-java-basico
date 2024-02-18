package candidatura;

import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
	public static void main(String[] args) {
		String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};
		for (String cadidato : candidatos) {
			entrandoEmContato(cadidato);
		}
	}	
	
	static void entrandoEmContato(String candidato) {
		int tentativasRealizadas = 1;
		boolean continuaTentando = true;
		boolean atendeu = false;
		
		do {
			
			atendeu = atender();
			continuaTentando = !atendeu;
			
			if (continuaTentando) {
				tentativasRealizadas++;				
			}
			else {
				System.out.println("CONTATO REALIZADO COM SUCESSO!" );
			}
		} while (continuaTentando && tentativasRealizadas<3);
		if (atendeu) {
			System.out.println("CONSEGUIMOS CONTATO COM "+ candidato + " NA " + tentativasRealizadas + "° TENTATIVA REALIZADA");
		}
		else {
			System.out.println("NÃO COMSEGUIMOS CONTATO COM " + candidato + " NUMERO MAXIMO DE TENTATIZAS "+ tentativasRealizadas +" REALIZADAS");
		}
	}
	
	//método auxiliar
	static boolean atender() {
		return new Random().nextInt(3)==1;	
	}
	
	static void imprimirSelecionados() {
		String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};
		System.out.println("Imprimindo lista de candidatos informando o indice do elemento");
		for(int indice = 0; indice < candidatos.length; indice++) {
			System.out.println("O candidato de n° " + (indice + 1) + " é o " + candidatos[indice]);
		}
		
		for (String candidato : candidatos) {
			System.out.println("O candidato selecionado foi " +candidato);
		}
		
		}
	
	static void selecaoCandidatos() {
		String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
		
		int candidatosselecionados = 0;
		int candidatoAtual = 0;
		double salarioBase = 2000.0;
		while(candidatosselecionados < 5 && candidatoAtual < candidatos.length) {
			String candidato = candidatos[candidatoAtual];
			Double salarioPretendo = valorPretendido();
			
			System.out.println("----  O candidato " + candidato + " Solicitou este valor de salário " + salarioPretendo);
			
			if (salarioBase >= salarioPretendo) {
				System.out.println("++++   O candidato " + candidato + " foi selecionado para a vaga");
				candidatosselecionados++;
			}
			candidatoAtual++;
		}
	}
	
	static double valorPretendido() {
	     return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}
	
	static void analisarCandidato(double salarioPretendido) {
		double salarioBase = 2000.00;
		if (salarioBase > salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO");
		}
		else if (salarioBase == salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
		}
		else {
			System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
		}
	}

}
