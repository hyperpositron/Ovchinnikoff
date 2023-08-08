package Ovchinnikoff_2.hw_5;

public class Main {
    /* 6) *Создать метод, повышающий зарплату всем сотрудникам старше 45 летна 5000.
     * Метод должен принимать в качестве параметра массив сотрудников.
     * Вывести в main() возраст и зарплату сотрудников до и после вызова метода;*/
    private static void increaser(Employee[] emp, byte age, float increment) {
        for (int i = 0; emp.length; i++) {
            if (emp[i].getAge() > age) {
//                emp[i].setSalary(emp[i].getSalary() + 5000);
                emp[i].setSalary(increment);
                emp[i].isSalaryChanget = true;
            }
        }
    }

    /* 7) ** Написать методы (принемающие на вход массив сотрудников),
     * вычисляющие средний возраст и среднюю зарплату сотрудников,
     * вывести результаты работы в консоль.*/
    private static float averageSalary(Employee[] emp) {
        float result = 0;
        for (int i = 0; i < emp.length; i++)
    }

    private static float averageAge(Employee[] emp) {
        float result = 0;
        for(int i = 0;i< emp.length;i++)
            result += emp[i].getAge();
        return result / emp.length;
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Никита", 20000, 30, "Пожарный");
        employee.methodq();
        employee.printNameAndPosition();
        /*5) Создать массив из 5 сотрудников, С помощью цикла вывести информацию только о сотрудниках старше 40 лет*/
        Employee[] employees = {
                new Employee("Евгений", 30000, 29, "Маляр"),
                new Employee("Петя", 70000, 42, "Дальнобойщик"),
                new Employee("Артур", 50000, 35, "Агент"),
                new Employee("Мария", 42000, 47, "Администратор"),
                new Employee("Виктория", 0, 58, "Бухгалтер")
        };
        for (int i = 0; i < employees.length; i++)
            if (employees[i].getAge() > 40)
                System.out.println(employees[i].getFullInfo());

        System.out.println("_____________________________________________");
        for (int i = 0; i < employees.length; i++)
            System.out.println(employees[i].getFullInfo());
        increaser(employees, (byte) 45, 5000.0f);

        System.out.println("_____________________________________________");
        for (int i = 0; i < employees.length; i++)
            if (employees[i].isSalaryChanged)
                System.out.println(employees[i].getFullInfo());
    }

}
}