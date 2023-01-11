package geekudemy.exerciciosgeek;

public class Exercicio12 {
    // Matrizes
/*
As matrizes são Vetores/Arrays/Matrizes multi-dimenssionais

// Vetor (Quando temos uma vetor, temos uma linha de elemento
int numeros[3]
numeros[0] = 3;
numeros[1] = 2;
numeros[2] = 5;

// Matriz (Quando temos uma matriz, temos linhas e colunas
3 linhas / 3 colunas
int numeros[3][3]
numeros[0][0] = 1;
numeros[0][1] = 2;
numeros[0][2] = 5;

numeros[1][0] = 7;
numeros[1][1] = 4;
numeros[1][2] = 9;

numeros[2][0] = 3;
numeros[2][1] = 6;
numeros[2][2] = 32;

        // Declaração
        int numeros[][];

        // Declaração e definição de tamanho da matriz
        int numeros[][] = new int[3][3];

        // Declaração, definir o tamanho e inicializar
        int numeros [][] = {{1,2,3}, {4,5,6}, {7,8,9}};

        // Declaração somente com linhas
        int numeros[][] = new int[2][];
        numeros[0] = new int[5];
        numeros[1] = new int[3];
 */
    public static void main(String[] args) {

        int numeros[][] = new int[3][3];

        numeros[0][0] = 1;
        numeros[0][1] = 3;
        numeros[0][2] = 5;

        numeros[1][0] = 7;
        numeros[1][1] = 9;
        numeros[1][2] = 11;

        numeros[2][0] = 13;
        numeros[2][1] = 15;
        numeros[2][2] = 17;

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[1].length; j++) {
                System.out.println("numeros [" +i+ "][" +j+ "] = " +numeros[1][j]);
            }
        }

    }
}
