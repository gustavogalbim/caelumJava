package caelum.exercicios;

public class Exercicio5 {
    public static void main(String[] args) {

        for (long i = 0; i <= 10; i++){
            long num = i;
            for (long j = (num-1); j > 1; j--) {
                num *= j;
            }
            System.out.println("Fatorial de "+i+ " ="+num);
        }

    }
}
