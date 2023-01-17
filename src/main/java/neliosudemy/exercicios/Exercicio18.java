package neliosudemy.exercicios;

import neliosudemy.model.Employees;

import java.util.*;
import java.util.stream.Collectors;

public class Exercicio18 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many employees will be registered? ");
        int number = scanner.nextInt();

        Employees[] employees = new Employees[number];
        List<Employees> list = new ArrayList<>();

        for(int i = 0; i < employees.length; i++) {
            scanner.nextLine();
            System.out.println("Employee #" +i);
            System.out.println("Id: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Name: ");
            String name = scanner.nextLine();
            System.out.println("Salary: ");
            double salary = scanner.nextDouble();

            employees[i] = new Employees(id, name, salary);
            list.add(employees[i]);
        }

        System.out.println("Enter the employee id that will have salary increase: ");
        int id = scanner.nextInt();

        Integer pos = position(list, id);
        if(pos == null) {
            System.out.println("This id does not exist! \n");
        } else {
            System.out.println("Enter the percentage");
            double percentageValue = scanner.nextDouble();

            List<Employees> result = list.stream().filter(x -> x.getId() == id).collect(Collectors.toList());

            for (Employees r: result) {
                double percent = percentageValue * r.getSalary() / 100;
                double resultSalary = percent + r.getSalary();
                r.setSalary(resultSalary);
            }
        }

        System.out.println("List of employees: ");
        for (Employees r : list) {
            System.out.println(r);
        }
    }

    public static Integer position (List<Employees> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }

}
