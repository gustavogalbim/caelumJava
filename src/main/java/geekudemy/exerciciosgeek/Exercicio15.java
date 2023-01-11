package geekudemy.exerciciosgeek;

import geekudemy.modelgeek.ClienteGeek;
import geekudemy.modelgeek.ContaGeek;

public class Exercicio15 {

    public static void main(String[] args) {

        ClienteGeek joao = new ClienteGeek("João", "Rua teste");
        ClienteGeek maria = new ClienteGeek("Maria", "Rua teste");

        ContaGeek contaJoao = new ContaGeek(1, 100, 200, joao);
        ContaGeek contaMaria = new ContaGeek(2, 300, 500, maria);

        System.out.println("Saldo do João: " +contaJoao.getSaldo());
        System.out.println("Saldo da Maria: " +contaMaria.getSaldo());

        contaJoao.sacar(3000);
        System.out.println("Efetuando saque...");
        System.out.println("Saldo do João: " +contaJoao.getSaldo());

    }

}
