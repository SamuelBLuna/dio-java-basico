package poo.fundamentos;

public class Construtor {

    private String nome;
    private int idade;
    private char sexo;
    private double altura;

    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    private void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    private void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getAltura() {
        return altura;
    }

    private void setAltura(double altura) {
        this.altura = altura;
    }

    public Construtor() {}

   public Construtor(String nome, int idade, char sexo, double altura) {
        setNome(nome);
        setIdade(idade);
        setSexo(sexo);
        setAltura(altura);
    }
}
