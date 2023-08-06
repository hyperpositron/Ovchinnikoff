package Ovchinnikoff_2.hw_5;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Никита", 20000, 1992, "Пожарный");
        employee.methodq();
        employee.printNameAndPosition();

        Employee[] employees = {employee,
                new Employee("Евгений", 30000, 1994, "Маляр"),
                new Employee("Петя",70000,1968,"Дальнобойщик"),
                new Employee("Артур",50000,1990,"Агент" ),
                new Employee("Мария",42000,1994,"Администратор"),
                new Employee("Виктория",0,1994,"Бухгалтер")
        };

    }
}