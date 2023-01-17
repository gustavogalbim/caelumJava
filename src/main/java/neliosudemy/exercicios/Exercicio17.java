package neliosudemy.exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Exercicio17 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add("Paulo");
        list.add("Pedro");
        list.add("Plinio");
        list.add(2, "Gustavo");

        System.out.println(list.size());
        list.remove(1);
        list.remove("Anna");

        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("=========================");

        // Removendo com predicado
        list.removeIf(x -> x.charAt(0) == 'M');
        System.out.println(list);

        System.out.println("=========================");

        System.out.println("Index of Gustavo: " + list.indexOf("Gustavo"));
        // Quando o index of não encontra o elemento ele retorna -1
        System.out.println("Index of Joao: " + list.indexOf("Joao"));
        System.out.println("=========================");

        // filtrando os nomes da lista para iniciados com a letra P
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'P').collect(Collectors.toList());

        System.out.println(result);
        for (String x : result ) {
            System.out.println(x);
        }
        System.out.println("=========================");
        String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
        System.out.println(name);

    }
}
