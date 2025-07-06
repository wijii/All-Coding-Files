package javacoding;

public class Student {
    String name;
    double grade;
    int units;
    double result;
    

    Student(String name, double grade, int units) {
        this.name = name;
        this.grade = grade;
        this.units = units;
    }
    void ff() {
        System.out.println("\n--- Student Details ---");
    }
    void display(int subNumber) {
        System.out.println("Subject #" + subNumber + " code: " + name);
        System.out.println("Your grade is: " + grade);
        System.out.println("Your number of units is: " + units);
        System.out.println();
        
    }
}
