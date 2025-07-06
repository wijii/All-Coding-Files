package javacoding;

import java.util.Scanner;

public class Oop {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name,name1,name2;
        double grade, grade1, grade2;
        int units, units1, units2;
        double result, unit, gwa = 0;

        System.out.print("Enter your subject code: ");
        name = s.nextLine();
        System.out.print("Enter your grade: ");
        grade = s.nextDouble();
        System.out.print("Enter your number of units: ");
        units = s.nextInt();
        System.out.println();
        s.nextLine();
        

        System.out.print("Enter your subject code: ");
        name1 = s.nextLine();
        System.out.print("Enter your grade: ");
        grade1 = s.nextDouble();
        System.out.print("Enter your number of units: ");
        units1 = s.nextInt();
        System.out.println();
        s.nextLine();

        System.out.print("Enter your subject code: ");
        name2 = s.nextLine();
        System.out.print("Enter your grade: ");
        grade2 = s.nextDouble();
        System.out.print("Enter your number of units: ");
        units2 = s.nextInt();
        System.out.println();
        s.nextLine();

        Student student = new Student(name, grade, units);
        Student student1 = new Student(name1, grade1, units1);
        Student student2 = new Student(name2, grade2, units2);
        result = (grade * units) + (grade1 * units1) + (grade2 * units2);
        unit = units + units1 + units2;
        gwa = result / unit;
        
        student.ff();
        student.display(1);
        student1.display(2);
        student2.display(3);

        System.out.println("Your GWA is: " + gwa);
        
        
    }
}
