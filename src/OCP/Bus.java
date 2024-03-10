package OCP;
/**
 * Класс описывающий создание автобуса (наследник класса ТС)
 */
public class Bus extends Vehicle{
    /**
     * Конструктор класса с параметрами
     * @param maxSpeed максимальная скорость
     * @param type тип ТС
     */
    public Bus(int maxSpeed, String type) {
        super(maxSpeed, type);
    }
    /**
     * Метод расчета допустимой скорости
     * @return допустимая скорость
     */
    @Override
    public double calculateAllowedSpeed() {
        return super.getMaxSpeed() * 0.6;
    }
}