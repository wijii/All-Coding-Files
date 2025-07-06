package javacoding;

import java.util.Scanner;

public class Oop {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter your subject code: ");
        String name = s.nextLine();
        System.out.print("Enter your grade: ");
        double grade = s.nextDouble();
        System.out.print("Enter your number of units: ");
        int units = s.nextInt();
        double result = grade/units;

        Student student = new Student(name, grade, units, result);
        student.display();
        student.gwa();
        
    }
}
