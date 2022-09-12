package exercicios;

public class Exercicio1 {

    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();

        long janeiro = 15000;
        long fevereiro = 23000;
        long marco = 17000;

        long soma = janeiro+ fevereiro+ marco;

        builder.append("A despesa total do trimestre foi "+soma+".");
        builder.append("\n");
        builder.append("E a média mensal dos gastos foi de "+soma/3+".");
        System.out.println(builder);

    }

}
