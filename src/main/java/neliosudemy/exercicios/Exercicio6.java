package neliosudemy.exercicios;

import neliosudemy.model.Student;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();

        System.out.println("Name: ");
        student.name = scanner.nextLine();
        System.out.println("First quarter, note: ");
        student.firstQuarter = scanner.nextDouble();
        System.out.println("Second quarter, note: ");
        student.secondQuarter = scanner.nextDouble();
        System.out.println("Last quarter, note:");
        student.lastQuarter = scanner.nextDouble();

        double resultQuarter = student.finalGrade();
        System.out.println("FINAL GRADE = " + resultQuarter);

        if(resultQuarter > 60) {
            System.out.println("PASS");
        } else {
            System.out.println("FAILED");
            double missPoints = 60 - resultQuarter;
            System.out.println("MISSING " +missPoints+ " POINTS");
        }

    }
}
