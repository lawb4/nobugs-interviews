package meet2.oop.task1_4;

/*Создайте класс Manager, который наследуется от Employee:
Дополнительное поле bonus (премия).
Переопределите метод printInfo() так, чтобы он выводил и бонус.*/
public class Manager extends Employee {
    private int bonus;

    public Manager(String name, int salary, int bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    @Override
    public void printInfo() {
        System.out.printf("%s: зарплата %d, бонус %d\n", super.name, super.salary, this.bonus);
    }
}
