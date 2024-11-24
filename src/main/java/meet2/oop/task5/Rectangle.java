package meet2.oop.task5;

/*Класс Rectangle (прямоугольник), наследуется от Shape:
Поля: width (ширина), height (высота).
Реализует методы для расчёта площади и периметра.
*/
public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return this.width * this.height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (this.width + this.height);
    }
}
