package OCP;

public class SpeedCalculation {
    /**
     * Метод расчета допустимой скорости
     * @param vehicle передаваемое ТС
     * @return допустимая скорость
     */
    public double calculateAllowedSpeed(Vehicle vehicle) {
        return vehicle.calculateAllowedSpeed();
    }
}
