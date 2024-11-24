package meet2.oop.task5;

/*Класс Circle, наследуется от Shape:
Поле: radius (радиус).
Реализует методы для расчёта площади и периметра.
*/
public class Circle1 extends Shape {
    private double radius;

    public Circle1(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }
}
