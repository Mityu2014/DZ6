package SRP;
/**
 * Клас описывающий создание сотрудника
 */
import java.util.Date;
public class Employee {
    private String name; // имя сотрудника
    private Date dob; // размер ЗП

    /**
     * Конструктор класса с параметрами
     * @param name имя сотрудника
     * @param dob размер ЗП
     */
      public Employee(String name, Date dob) {
        this.name = name;
        this.dob = dob;
    }

    /**
     * Метод получения информации о сотруднике
     * @return информации о сотруднике
     */
    public String getEmpInfo() {
        return "name - " + name + " , dob - " + dob.toString();
    }

}

