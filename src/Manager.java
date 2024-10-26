import java.util.List;

public class Manager extends Employee{
    public Manager(String name, int salary, int age) {
        super(name, salary, age);
    }

    public static void increaseSalary(List<Employee> employeeList, int amount){
        for (Employee employee : employeeList) {
            if (!(employee instanceof Manager)){
                employee.insreaser(amount);
            }
        }
    }
}
