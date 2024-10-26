import java.util.Date;
import java.util.List;

public class Employee {
    private String name;
    private int salary;
    private int age;

    public Employee(String name, int salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    public static void increaseSalary(List<Employee> employeeList, int amount){
//        for (Employee employee : employeeList) {
//            employee.insreaser(amount);
//        }
//    }

    public void insreaser(int amount){
        this.salary += amount;
    }

    @Override
    public String toString() {
        return "Сотрудник: " +
                "имя: " + name +
                ", заработная плата: " + salary +
                ", возраст: " + age;
    }

    public int comparatorDate(int YYYY1, int MM1, int DD1, int YYYY2, int MM2, int DD2){
        int empl = DD1 + (MM1 << 6) + (YYYY1 << 11);
        int income = DD2 + (MM2 << 6) + (YYYY2 << 11);
        return empl - income;
    }
}
