package DIP;

/**
 * Класс описывающий работу дизельного двигателя
 */
public class DieselEngine implements iEngine {
    /**
     * Метод запуска двигателя
     */
    @Override
    public void start() {
        System.out.println("start DieselEngine");
    }
}
