package neliosudemy.exercicios;

public class Exercicio16 {

    public static void main(String[] args) {

        String[] vector = new String[] {"Maria", "Bob", "Alex"};

        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
        System.out.println("===============================");
        /*
        Tipo do meu objeto
        Objeto
        -> execução
         */
        for (String str : vector) {
            System.out.println(str);
        }

    }

}
