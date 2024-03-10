package ISP;

/**
 * Класс описывающий создание окружности
 */
public class Circle implements iShapeCircle {
    private double radius;

    /**
     * Конструктор класс с параметрами
     * @param radius радиус окружности
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Метод расчета площади
     * @return площадь окружности
     */
    @Override
    public double area() {
        return 2 * 3.14 * radius;
    }
}
