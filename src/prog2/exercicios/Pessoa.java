package prog2.exercicios;

public class Pessoa {
    private String nome;
    private int idade;
    private double altura, peso;

    public Pessoa(String nome, int idade, double altura, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    public double calcularIMC() {
        return peso / (altura * altura);
    }

    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);
        System.out.println("IMC: " + calcularIMC());
    }

    public static void main(String[] args) {
        Pessoa p = new Pessoa("João", 25, 1.75, 68);
        p.mostrarDados();
    }
}
