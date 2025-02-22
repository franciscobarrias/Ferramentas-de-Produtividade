package prog2.exercicios;

public class Automovel {
    private String matricula;
    private String marca;
    private int cilindrada;
    private static int totalAutomoveis = 0;

    public Automovel(String matricula, String marca, int cilindrada) {
        this.matricula = matricula;
        this.marca = marca;
        this.cilindrada = cilindrada;
        totalAutomoveis++;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public int calcularDiferencaCilindrada(Automovel outro) {
        return Math.abs(this.cilindrada - outro.cilindrada);
    }

    public boolean isCilindradaMaior(Automovel outro) {
        return this.cilindrada > outro.cilindrada;
    }

    public static int getTotalAutomoveis() {
        return totalAutomoveis;
    }

    @Override
    public String toString() {
        return "O automóvel com matrícula " + matricula + " é um " + marca + " de " + cilindrada + " cc.";
    }
}


