package exercicios;

import java.text.Normalizer;
import java.util.regex.Pattern;

public class Exercicio22 {

    public static void main(String[] args) {

        String name = "João Sílva, ô û Ò Ó ã õ ú í é";
        String normalizer = Normalizer.normalize(name, Normalizer.Form.NFD);
        Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");

        System.out.println(pattern.matcher(normalizer).replaceAll(""));


    }

}
