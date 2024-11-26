package meet3.hw.task1;

/*Задача 1: Класс для представления прямоугольника
Описание:
Создайте класс Rectangle, который будет представлять прямоугольник.
Класс должен содержать:
Два поля: ширина (width) и высота (height).
Конструктор для инициализации ширины и высоты.
Методы:
calculateArea(): возвращает площадь прямоугольника.
calculatePerimeter(): возвращает периметр прямоугольника.*/
public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double calculateArea() {
        return this.width * this.height;
    }

    public double calculatePerimeter() {
        return 2 * (this.width + this.height);
    }
}
