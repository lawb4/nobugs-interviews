package meet2.oop.task1_4;

/*Создайте класс:
Employee (сотрудник) с полями:
name (имя),
salary (зарплата).
Конструктор для инициализации полей.
Метод printInfo(), выводящий информацию о сотруднике.*/
public class Employee {
    protected String name;
    protected int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public void printInfo() {
        System.out.printf("%s: зарплата %d\n", this.name, this.salary);
    }
}
