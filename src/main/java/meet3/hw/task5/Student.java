package meet3.hw.task5;

import java.util.Objects;

/*Задача 5: Класс Student
Создайте класс Student, который будет представлять студента.
Требования:
Поля:
Имя (name).
ID студента (id).
Средний балл (gpa).
Реализуйте:
Конструкторы:
По умолчанию (без параметров).
Конструктор для инициализации всех полей.
equals и hashCode: два студента считаются равными, если у них совпадают id.
toString: метод, возвращающий строку с информацией о студенте (например, "Student{id=101, name='Anna', gpa=3.8}").
clone: создайте глубокую копию объекта.*/
public class Student implements Cloneable {
    private String name;
    private String id;
    private double gpa;

    public Student() {
    }

    public Student(String name, String id, double gpa) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", gpa=" + gpa +
                '}';
    }

    @Override
    public Student clone() {
        return new Student(this.name, this.id, this.gpa);
    }
}
