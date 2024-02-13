package edu.samuel.primeirasemana;

import java.util.Date;

public class Operadores {

    public static void main(String[] args) {
        
        // Atribuição

        String nome = "Samuel";
        int idade = 22;
        double peso = 68.5;
        char sexo = 'M';
        boolean doadorOrgao = false;
        Date dataNascimentp = new Date();

        // Aritimeticos
        double soma = 10.5 + 15.7;
        int subtracao = 113 -25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int module = 18 % 3;
        // double resultado = (10 * 7) + (10 / 4);

        int numero = 5;
        // System.out.println(++ numero);

        // Ternario
        int a, b;
        a = 5;
        b = 6;

        String resultado = a < b ? "Verdadeiro" : "Falso";
        

        System.out.println(resultado);
    }


}
