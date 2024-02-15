public class IfEElse {
    public static void main(String[] args) throws Exception {
        
        int nota = 3;
/*/
        if (nota >= 7) 
            System.out.println("Aprovado!");
        else if (nota >= 5)
            System.out.println("Provad de Recuperação");
        else 
        System.out.println("Reprovado!");
 */

        // String resultado = nota >= 7 ? "Aprovado!" : "Reprovado!";
        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 ? "Prova de recuperação" : "Reprovado";
        System.out.println(resultado);
    }
}
