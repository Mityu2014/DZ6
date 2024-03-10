package DIP;

/**
 * Класс описывающий работу бензинового двизателя
 */
public class PetrolEngine implements iEngine {
    /**
     * Метод запуска двигателя
     */
    @Override
    public void start() {
        System.out.println("start PetrolEngine");
    }
}
