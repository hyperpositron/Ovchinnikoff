package Ovchinnikoff_2.hw_5;

public class Employee {
    String name;
    int salary;
    int age;
    String position;

    public Employee(String name, int salary, int age, String position) {
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.position = position;


    }
    public String getName(){
        return name;
    }
    public Integer getAge(){
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
    void getFullInfo() {
        System.out.println("Имя : " + name);
        System.out.println("Зарплата : " + salary);
        System.out.println("Год рождения: " + age);
        System.out.println("Должность: " + position);
    }



}
