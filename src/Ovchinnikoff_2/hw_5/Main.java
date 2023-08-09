package Ovchinnikoff_2.hw_5;

public class Main {
    /* 6) *Создать метод, повышающий зарплату всем сотрудникам старше 45 летна 5000.
     * Метод должен принимать в качестве параметра массив сотрудников.
     * Вывести в main() возраст и зарплату сотрудников до и после вызова метода;*/
    private static void increaser(Employee[] employees, byte age, float increment) {
        for (int i = 0; employees.length; i++) {
            if (employees[i].getAge() > age) {
                employees[i].setSalary(employees[i].getSalary() + 5000);
                employees[i].setSalary(increment);
                employees[i].isSalaryChanged = true;
            }
        }
    }

    /* 7) ** Написать методы (принемающие на вход массив сотрудников),
     * вычисляющие средний возраст и среднюю зарплату сотрудников,
     * вывести результаты работы в консоль.*/
    private static float averageSalary(Employee[] emp) {
        float result = 0;
        for (int i = 0; i < emp.length; i++)
            result +=emp[i].getSalary();

        return result /emp.length;

    }

    private static float averageAge(Employee[] emp) {
        float result = 0;
        for(int i = 0;i< emp.length;i++)
            result += emp[i].getAge();
        return result / emp.length;
    }

    public static void main(String[] args) {
        /* 1) Создать класс "Сотрудник" с полями: ФИО, должность, телефон,зарплата, возраст; */
        /* 4) Вывести при помощи методов из пункта 3 ФИО и должность; */
        System.out.println("Пожалуйста добро пожаловать ваш "+employee.getPosition()+" ,"+employee.getName()+
                " "+employee.getSecondName()+" "+ employee.getSurname()+".");
        //employee.methodq();
        //employee.printNameAndPosition();
        /* 5) Создать массив из 5 сотрудников, С помощью цикла вывести информацию только о сотрудниках старше 40 лет*/
        Employee[] employees = {
                new Employee("Никита", "Сысоев", "Александрович",
                        "89527999921", "Пожарный", 30000, 1992),
        new Employee("Евгений", "Кудикин", "Константинович",
                "89114525487", "Пожарный", 20000, 1994)
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
