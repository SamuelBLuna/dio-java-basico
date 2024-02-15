import java.io.Console;

public class Lacos {
    public static void main(String[] args) { 


        //Contador
        /*for(int carneirinhos = 1; carneirinhos <= 20; carneirinhos++) {
            System.out.println(carneirinhos + "° Carneirinho");
        }*/

        String alunos[] = {"Ana", "Maria", "Marta"};
       /*for(int i = 0; i < alunos.length; i++) {
            System.out.println("O indice do aluno " + alunos[i] + " é " + i);
        }*/

        int indice = 0;
        for (String aluno : alunos) {
            if (indice % 2 == 0) {
                System.out.println("O indice do aluno " + aluno + " é " + indice);
            }
            indice++;
        }

    }
}
