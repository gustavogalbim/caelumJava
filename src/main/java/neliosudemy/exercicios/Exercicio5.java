package neliosudemy.exercicios;

import neliosudemy.model.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.println("Employee name: ");
        employee.name = scanner.nextLine();
        System.out.println("Gross salary: ");
        employee.grossSalary = scanner.nextDouble();
        System.out.println("Tax on salary: ");
        employee.tax = scanner.nextDouble();

        double netSalary = employee.netSalary();

        System.out.println("Employee: " +employee.name+ ", $" +netSalary);

        System.out.println("Which percentage to increase salary? ");
        Integer percentage = scanner.nextInt();

        employee.grossSalary = netSalary;
        employee.increaseSalary(percentage, employee.grossSalary);
        System.out.println("Updated data: " +employee.name+ ", $" + employee.grossSalary);


    }
}
