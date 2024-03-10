package OCP;

/**
 * Абстрактный класс описывающий создание транспортного средства
 */
public abstract class Vehicle {
    int maxSpeed; //максимальная скорость
    String type; // тип ТС

    /**
     * Конструктор класса с параметрами
     * @param maxSpeed максимальная скорость
     * @param type тип ТС
     */
    public Vehicle(int maxSpeed, String type) {
        this.maxSpeed = maxSpeed;
        this.type = type;
    }
    public int getMaxSpeed() {
        return this.maxSpeed;
    }
    public String getType() {
        return this.type;
    }

    /**
     * Метод расчета допустимой скорости
     * @return допустимая скорость
     */
    public abstract double calculateAllowedSpeed();
}
