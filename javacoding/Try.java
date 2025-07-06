package javacoding;

import java.util.Scanner;

public class Try {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int choice;

        System.out.println("Enter Your Name ");
        String name = input.nextLine();
        System.out.println("\nEnter your age");
        int age = input.nextInt();

        System.out.println("Enter Your Name ");
        String name1 = input.nextLine();
        System.out.println("\nEnter your age");
        int age1 = input.nextInt();

        Student student = new Student(name, age);
        Student student2 = new Student(name1, age1);

        System.out.println("Which one you want to view? 1 or 2");
        choice = input.nextInt();
        if(choice == 1) {
            display(student);
        } else if(choice == 2) {
            display(student2);
        } else {
            System.out.println("invalid");
        }
        
    }
    public static void display(Student student) {
        student.display();
    }
    public static void display2(Student student2) {
        student2.display();
    }
}
