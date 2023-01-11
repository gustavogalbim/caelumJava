package caelum.exercicios;

public class Exercicio24 {
    public static void main(String[] args) {

        double[] numbers = new double[] {5, 12, 14, 20};

        double sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }

        double media = sum / numbers.length;

        System.out.println("Soma: " +sum);
        System.out.println("Itens: " +numbers.length);
        System.out.println("Media: " +media);


    }
}
