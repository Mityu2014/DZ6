package DIP;

/**
 * Класс описывающий создание автомобиля
 */
public class Car {
    iEngine engine;

    /**
     * Конструктор со всеми параметрами
     * @param engine тип двигателя
     */
    public Car(iEngine engine) {
        this.engine = engine;
    }

    /**
     * Метод запуска двигателя
     */
    public void start(){
        engine.start();
    }
}
