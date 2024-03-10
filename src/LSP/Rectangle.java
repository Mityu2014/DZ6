package LSP;

/**
 * Класс описывающий создание прямоугольника
 */
public class Rectangle {
    private int width; //ширина
    private int height; // высота

    /**
     * коннструктор класс с параметрами
     * @param width ширина
     * @param height высота
     */
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    /**
     * Метод расчета площади
     * @return площадь
     */
    public int area() {
        return this.width * this.height;
    }
}
