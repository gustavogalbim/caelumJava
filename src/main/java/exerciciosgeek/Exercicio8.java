package exerciciosgeek;

public class Exercicio8 {
    // Tipos de dado em Java - Tipos numericos

    public static void main(String[] args) {
        // tipos primitivos
        int num1 = 4;       // Inteiro
        short num2 = 4;     // Inteiro (curto/menor/baixo)
        byte num3 = 4;

        // tipos não primitivos
        Integer num4 = 98;
        Short num5 = 7;
        Byte num6 = 9;

        // Tipos primários são tipos comuns basicos da linguagem Java
        // Tipos não primários são classes que representam esses tipos primários.
        // Para cada um dos tipos primários, eu tenho uma classe Java para representa-los
        System.out.println("Tipos primitivos: ");
        System.out.println("int -> Num1 = " +num1);
        System.out.println("short -> Num2 = " +num2);
        System.out.println("byte -> Num3 = " +num3);
        System.out.println("\n");

        System.out.println("Tipos não primitivos: ");
        System.out.println("Integer -> Num4 = " +num4);
        System.out.println("Short -> Num5 = " +num5);
        System.out.println("Byte -> Num5 = " +num6);
        System.out.println("\n");

        // Tamanho em bytes alocados para os tipos
        System.out.println("Tamanho em bytes alocados para os tipos de dado Java");
        System.out.println("int/Integer: " + Integer.SIZE);
        System.out.println("short/Short: " + Short.SIZE);
        System.out.println("byte/Byte: " + Byte.SIZE);
        System.out.println("\n");

        System.out.println("Tamanho minimo e maximo para os tipos de dado em Java");
        System.out.println("Valor MIN - int/Integer: " + Integer.MIN_VALUE);
        System.out.println("Valor MAX - int/Integer: " + Integer.MAX_VALUE);
        System.out.println("Valor MIN - short/Short: " + Short.MIN_VALUE);
        System.out.println("Valor MAX - short/Short: " + Short.MAX_VALUE);
        System.out.println("Valor MIN - byte/Byte: " + Byte.MIN_VALUE);
        System.out.println("Valor MAX - byte/Byte: " + Byte.MAX_VALUE);
    }
}
