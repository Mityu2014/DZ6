import DIP.DieselEngine;
import DIP.PetrolEngine;
import ISP.Circle;
import ISP.Cube;
import LSP.Rectangle;
import LSP.Square;
import OCP.Bus;
import OCP.Car;
import OCP.SpeedCalculation;
import OCP.Vehicle;
import SRP.Employee;
import SRP.MethodsClass;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
public class Main {
    static SimpleDateFormat dataForm = new SimpleDateFormat("dd/MM/yyyy");
    public void main() throws ParseException {
        System.out.println("ДЗ 1 код в соответствии с Single Responsibility Principle");
        Employee director = new Employee("Igor", dataForm.parse("02/05/1980"));
        Employee accountant = new Employee("Irina", dataForm.parse("12/06/1995"));
        HashMap<Employee,Integer> salaryStatement = new HashMap<Employee, Integer>();
        salaryStatement.put(director, 100000);
        salaryStatement.put(accountant, 80000);
        MethodsClass listEmployee = new MethodsClass(salaryStatement);
        System.out.println(director.getEmpInfo());
        System.out.println(listEmployee.calculateNetSalary(accountant));

        System.out.println("ДЗ 2 код SpeedCalculation в соответствии с Open-Closed Principle");
        Vehicle vehicle1 = new Bus(200,"Bus");
        Vehicle vehicle2 = new Car(200,"Car");
        SpeedCalculation speedCalculation = new SpeedCalculation();
        System.out.println(speedCalculation.calculateAllowedSpeed(vehicle1));
        System.out.println(speedCalculation.calculateAllowedSpeed(vehicle2));

        System.out.println("ДЗ 3 код в соответствии с Interface Segregation Principle");
        Circle circle = new Circle(25.0);
        Cube cube = new Cube(3);
        System.out.println(circle.area());
        System.out.println(cube.volume());
        System.out.println(cube.area());

        System.out.println("ДЗ 4 код в соответствии с Liskov Substitution Principle");
        Rectangle rectangle = new Rectangle(7,8);
        Square square = new Square(8);
        System.out.println(rectangle.area());
        System.out.println(square.area());

        System.out.println("ДЗ 5 код в соответствии с Dependency Inversion Principle");
        PetrolEngine petrolEngine = new PetrolEngine();
        DieselEngine dieselEngine = new DieselEngine();
        DIP.Car car1 = new DIP.Car(petrolEngine);
        DIP.Car car2 = new DIP.Car(dieselEngine);
        car1.start();
        car2.start();
    }
}

