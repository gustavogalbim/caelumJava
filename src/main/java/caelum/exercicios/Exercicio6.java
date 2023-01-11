package caelum.exercicios;

public class Exercicio6 {

    private static final int[] cpfDigitWeight = {11, 10, 9, 8, 7, 6, 5, 4, 3, 2};
    private static final int[] cnpjDigitWeight = {6, 5, 4, 3, 2, 9, 8, 7, 6, 5, 4, 3, 2};

    private static int calculateDigit(String str, int[] digitWeight) {
        int sum = 0;
        for (int i = str.length() -1, digit; i >= 0; i--) {
            digit = Integer.parseInt(str.substring(i, i + 1));
            sum += digit * digitWeight [digitWeight.length- str.length() + i];
        }
        sum = 11 - sum % 11;
        return sum > 9 ? 0 : sum;
    }

    public static boolean isValidCPF(String cpf) {
        if ((cpf==null) || (cpf.length()!=11)) return false;

        Integer firstDigit = calculateDigit(cpf.substring(0,9), cpfDigitWeight);
        Integer secondDigit = calculateDigit(cpf.substring(0,9) + firstDigit, cpfDigitWeight);
        return cpf.equals(cpf.substring(0,9) + firstDigit + secondDigit);
    }

    public static boolean isValidCNPJ(String cnpj) {
        if ((cnpj==null)||(cnpj.length()!=14)) return false;

        Integer firstDigit = calculateDigit(cnpj.substring(0, 12), cnpjDigitWeight);
        Integer secondDigit = calculateDigit(cnpj.substring(0, 12) + firstDigit, cnpjDigitWeight);
        return cnpj.equals(cnpj.substring(0, 12) + firstDigit + secondDigit);
    }

    public static void main(String[] args) {


        System.out.printf("CPF Valido:%s \n", Exercicio6.isValidCPF("75260076010"));

        System.out.printf("CNPJ Valido:%s \n", Exercicio6.isValidCNPJ("37164662000107"));
    }

}
