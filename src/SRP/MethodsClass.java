package SRP;
/**
 * Класс описываюший методы
 */

import java.util.HashMap;
public class MethodsClass {
    public HashMap<Employee, Integer> setSalStat; //зарплатная ведомость

    /**
     * Конструктор класса с параметрами
     * @param salaryStatement зарплатная ведомость
     */
    public MethodsClass(HashMap<Employee,Integer> salaryStatement) {
        this.setSalStat=new HashMap<>(salaryStatement);
    }

    /**
     * Метод расчета ЗП за минусом НДФЛ
     * @param employee работник
     * @return ЗП за минусом НДФЛ
     */
    public int calculateNetSalary(Employee employee) {
        int baseSalary = this.setSalStat.get(employee);
        int tax = (int) (this.setSalStat.get(employee) * 0.25);//calculate in otherway
        return baseSalary - tax;
    }
}
