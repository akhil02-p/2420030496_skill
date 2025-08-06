package MYPROJECT;

import java.time.*;
import java.util.*;

public class ageexp {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter birth year: ");
        int year = sc.nextInt();
        System.out.print("Enter birth month: ");
        int month = sc.nextInt();
        System.out.print("Enter birth day: ");
        int day = sc.nextInt();
        Date birthDate = new Date(year - 1900, month - 1, day);
        LocalDate birthLocalDate = birthDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate currentDate = LocalDate.now();

        Period age = Period.between(birthLocalDate, currentDate);

        System.out.println("Birth Date: " + birthLocalDate);
        System.out.println("Current Date: " + currentDate);
        System.out.println("Age: " + age.getYears() + " years " +
                           age.getMonths() + " months " +
                           age.getDays() + " days");
    }
}
