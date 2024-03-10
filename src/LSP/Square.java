package LSP;

/**
 * Класс описываю создание квадрата (наследник класса создания прямоугольника)
 */
public class Square extends Rectangle {
    /**
     * Конструктор класса с параметрами
     * @param width ширина фигуры (она же и высота)
     */
    public Square(int width) {
        super(width,width);
    }

}
