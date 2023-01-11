package caelum.exercicios;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exercicio8 {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }

        BigDecimal average = new BigDecimal(Arrays.stream(array).sum());

        System.out.println("O maior numero inserido é: "+Collections.max(list));
        System.out.println("O menor numero inserido é: "+Collections.min(list));
        System.out.println("A media dos numeros é: "+ average.divide(new BigDecimal(10)));

    }
}
