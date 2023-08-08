package Ovchinnikoff_2.hw_5;

public class Employee {
    private static final int CURRENT_YEAR = 2023;
    private String surname;
    private String secondName;
    private String name;
    private String position;

    private String phone;
    private float salary;
    boolean isSalaryChanged;
    private int birthYear;
    private static int id = 0;

    public int uid;
    /* 2) Конструктор Класса должен заполнять эти поля при создании объекта*/

    public Employee(String name, int salary, int age, String position) {
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.position = position;


    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    void methodq() {
        System.out.println("Имя : " + name);
        System.out.println("Зарплата : " + salary);
        System.out.println("Год рождения: " + age);
        System.out.println("Должность: " + position);
    }

    void printNameAndPosition() {
        System.out.println("Имя : " + name);
        System.out.println("Должность : " + position);
    }

    /* 3) Внутри класса "Сотрудник" написать методы, которые возвращают значение каждого поля*/
    int getAge() {
        return CURRENT_YEAR - birthYear;
    }

    int getSalary() {
        return (int) salary;
    }

    void setSalary(float difference) {
        this.salary = this.salary + difference;
    }

    void setSalary(int salary) {
        this.salary = salary;
    }

    String getSecondName() {
        return secondName;
    }

    String getName() {
        return name;
    }

    String getSurname() {
        return surname;
    }

    String getPosition() {
        return position;
    }

    void getFullInfo() {
        System.out.println("Имя : " + name);
        System.out.println("Зарплата : " + salary);
        System.out.println("Год рождения: " + age);
        System.out.println("Должность: " + position);
    }


}
