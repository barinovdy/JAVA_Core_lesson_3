//Написать прототип компаратора - метод внутри класса
//сотрудника, сравнивающий две даты, представленные в
//виде трёх чисел гггг-мм-дд, без использования условного
//оператора.
//Опишите класс руководителя, наследник от сотрудника.
//Перенесите статический метод повышения зарплаты в
//класс руководителя, модифицируйте метод таким образом,
//чтобы он мог поднять заработную плату всем, кроме
//руководителей. В основной программе создайте руководителя
//и поместите его в общий массив сотрудников. Повысьте зарплату
//всем сотрудникам и проследите, чтобы зарплата руководителя
//не повысилась.


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Ivan", 30000, 35));
        employeeList.add(new Manager("Daria", 50000, 40));
        employeeList.add(new Employee("Sergey", 40000, 45));

        System.out.println("Employees before salary increase");
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }

        Manager.increaseSalary(employeeList, 5000);
        System.out.println("Employees after salary increase");
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }

    }
}