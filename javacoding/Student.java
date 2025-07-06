package javacoding;

public class Student {
    String name;
    double grade;
    int units;
    double result;
    

    Student(String name, double grade, int units, double result) {
        this.name = name;
        this.grade = grade;
        this.units = units;
        this.result = result;
    }
    void gwa() {
        result = grade / units;
        System.out.println("Your GWA is: " + result);
    }
    void display() {
        System.out.println("Your subject code is: " + name);
        System.out.println("Your grade is: " + grade);
        System.out.println("Your number of units is: " + units);
        
    }
}
