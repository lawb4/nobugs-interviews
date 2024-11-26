package meet3.hw;

import meet3.hw.task4.Person;
import meet3.hw.task5.Student;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Task 4 Person ===");
        Person person1 = new Person("Jacob", 29);
        Person person2 = new Person("Jacob", 29);

        System.out.println(person1.equals(person2));

        System.out.println("\n=== Task 5 Student ===");
        Student student1 = new Student("Anna", "101", 3.8);
        Student student2 = student1.clone();

        student2.setName("Jacob");

        // Verify that the original object is unaffected
        System.out.println("This is Anna: " + student1); //  Student{id='101', name='Anna', gpa=3.8}
        System.out.println("This is Jacob: " + student2);   // Student{id='101', name='Mike', gpa=3.8}
    }
}