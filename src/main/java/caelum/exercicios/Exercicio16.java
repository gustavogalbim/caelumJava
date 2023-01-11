package caelum.exercicios;

public class Exercicio16 {

    public static void main(String[] args) {

        int numero = 5;
        final String message = numero > 10 ? "Numero é maior que 10" : "Numero é menor que 10";

        int num = 10;
        final String msg = num == 10 ? "O numero é igual a 10" : "o numero não é 10";

        int number = 15;
        final String msgn = number > 10 ? "O numero é maior que 10" : "o numero não é maior que 10";

        System.out.println(message +"\n"+ msg + "\n" + msgn);

    }

}
