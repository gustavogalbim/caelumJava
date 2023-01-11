package geekudemy.exerciciosgeek;

public class Exercicio3 {
    // Exemplo de switch

    public static void main(String[] args) {

        int numero = 9;

        switch (numero) {
            case 1:
                System.out.println("o numero é 1");
                break;
            case 3:
                System.out.println("o numero é 3");
                break;
            case 5:
                System.out.println("o numero é 5");
                break;
            default:
                System.out.println("o numero é: " +numero);
                break;
        }

    }
}
