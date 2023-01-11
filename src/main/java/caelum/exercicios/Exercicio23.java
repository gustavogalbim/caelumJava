package caelum.exercicios;

import javax.swing.*;

public class Exercicio23 {

    public static void main(String[] args) {

    int quantidade = 3;
    int[] numeros = new int[quantidade];

    for(int i = 0; i < quantidade; i++){
        numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro"));
    }

    for(int i : numeros) {
        System.out.println("Numeros na ordem digitada: " + i);
    }

    }
}
