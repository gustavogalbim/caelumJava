package exerciciosgeek;

import java.util.Arrays;

public class Exercicio11 {
    // Vetores
    // Arrays uni-dimensionais

/*
int numeros[5];

vetor[indice];
numeros[0] = 1;
numeros[1] = 3;
numeros[2] = 5;
numeros[3] = 7;
numeros[4] = 9;

 */
    public static void main(String[] args) {
        // tipo do dado / nome do vetor / new pra criar um novo objeto / quantidade
        // declarando e especificando o tamanho do vetor
        int numeros[] = new int[10];

        // declarar e inicializando
        // como eu estou inicializando (já estou informando a quantidade do tamanho do vetor)
        int numbers[] = {1, 3, 5, 9};

        float valores[] = new float[5];
        char caracteres[] = new char[20];
        String nomes[] = new String[4];

        String frutas[] = {"Manga", "Uva", "Morango"};

        for (int i = 0; i < numeros.length; i++) {
            // numeros[0] = i + 3; ou seja, 3.
            numeros[i] = i +3;
            // numeros[9] = i + 3;
        }
        System.out.println(numeros[0]);
        System.out.println(numeros[9]);

    /*
        Os Vetores/Arrays possuem tamanho fixo e não podem ser aumentados/diminuidos
        -> IndexOfOutBoundsException
        Vetores/Arrays também possuem tipos de dados fixos.. e não aceitam tipos variados
    */


    }
}
