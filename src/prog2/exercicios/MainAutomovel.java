package prog2.exercicios;

public class MainAutomovel {
    public static void main(String[] args) {
        Automovel a1 = new Automovel("11-11-AA", "Toyota", 1400);
        System.out.println(a1);
        System.out.println("Matrícula: " + a1.getMatricula());
        System.out.println("Total de automóveis: " + Automovel.getTotalAutomoveis());

        Automovel a2 = new Automovel("22-22-BB", "Fiat", 1800);
        System.out.println(a2);
        System.out.println("Diferença de cilindrada: " + a1.calcularDiferencaCilindrada(a2));
        System.out.println("O automóvel com maior cilindrada é: " +
                (a1.isCilindradaMaior(a2) ? a1.getMatricula() : a2.getMatricula()));
        System.out.println("Cilindrada de a1 maior que 2000? " + (a1.getCilindrada() > 2000));
    }
}

