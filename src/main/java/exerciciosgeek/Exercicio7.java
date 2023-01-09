package exerciciosgeek;

import java.util.Arrays;

public class Exercicio7 {
    // Exemplo de for each

    public static void main(String[] args) {
        String nome = "gustavo";

        // Para cada um dos caracteres da String, imprima o caractere.
        for (char letra : nome.toCharArray()) {
            System.out.println(letra);
        }
    }
}
