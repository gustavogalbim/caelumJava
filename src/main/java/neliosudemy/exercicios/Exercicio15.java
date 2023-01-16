package neliosudemy.exercicios;


import neliosudemy.model.CollegeStudent;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        CollegeStudent[] student = new CollegeStudent[10];

        System.out.println("How many rooms will be rented? ");
        int numberRooms = scanner.nextInt();

        if (numberRooms < student.length) {

            for (int i = 0; i < numberRooms; i++) {
                scanner.nextLine();

                System.out.println("Rent #" +i+ ":");

                System.out.println("Name: ");
                String name = scanner.nextLine();
                System.out.println("Email: ");
                String email = scanner.nextLine();
                System.out.println("Room: ");
                int room = scanner.nextInt();

                student[room] = new CollegeStudent(name, email);
            }

            System.out.println("Busy rooms: ");

            for (int i = 0; i < 10; i++) {
                if (student[i] != null) {
                    System.out.println(i + ": " + student[i]);
                }
            }

        } else {
            System.out.println("Number rooms must be between 10 rooms");
        }

    }
}
