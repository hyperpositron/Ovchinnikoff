package Ovchinnikoff_2.hw_5;

public class Main {
    /* 6) Создать метод, повышающий зарплату всем сотрудникам старше 45 летна 5000.
    * Метод должен принимать в качестве параметра массив сотрудников.
    * Вывести в main() возраст и зарплату сотрудников до и после вызова метода;*/
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
                System.out.println(employees[i].getFullInfo);
    }

}
}