package meet2.oop.task1_4;

/*Задача 1: Создание класса "Круг"
Создайте класс Circle, который будет описывать круг с помощью следующих свойств и методов:
Поле radius (радиус круга).
Конструктор, который принимает радиус круга.
Метод getArea(), возвращающий площадь круга (π * r^2).
Метод getCircumference(), возвращающий длину окружности (2 * π * r).
Пример использования:
Circle circle = new Circle(5);
System.out.println("Площадь: " + circle.getArea());
System.out.println("Длина окружности: " + circle.getCircumference());
*/
public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    public double getCircumference() {
        return 2 * Math.PI * this.radius;
    }
}
