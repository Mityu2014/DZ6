package ISP;
/**
 * Класс описывающий создание куба
 */

public class Cube implements iShapeCube {
    private int edge;

    /**
     * Конструктор класса с параметрами
     * @param edge длина стороны куба
     */
    public Cube(int edge) {
        this.edge = edge;
    }

    /**
     * Метод расчета площади всех сторон
     * @return площадь всех сторон
     */
    @Override
    public double area() {
        return 6 * edge * edge;
    }

    /**
     * Метод расчета объема
     * @return объем куба
     */
    @Override
    public double volume() {
        return edge * edge * edge;
    }
}
