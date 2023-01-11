package geekudemy.exerciciosgeek;

public class Exercicio2 {
// exemplo de operador ternário

    public static void main(String[] args) {
        int valor = 3;
        int numero;

/*        if(valor > 5) {
              numero = valor;
          } else {
              numero = 7;
          }
        System.out.println(numero);
*/

        numero = (valor < 5) ? valor : 7;
        System.out.println("Ternario: " +numero);
    }
}
