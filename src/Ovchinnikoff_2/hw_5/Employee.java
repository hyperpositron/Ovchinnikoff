package Ovchinnikoff_2.hw_5;

public class Employee {
    public static final int CURRENT_YEAR = 2023;
    public String surname;
    public String secondName;
    public String name;
    public String position;

    public String phone;
    public float salary;
    boolean isSalaryChanged;
    public int birthYear;
    public static int id = 0;

    public int uid; /* заводим поле которое будет хванить значение прям в объекте(т.е. не static)*/

    /* 2) Конструктор Класса должен заполнять эти поля при создании объекта*/

    public Employee(String name, String secondName, String surname, String phone,
                    String position, float salary, int birthYear) {
        this.name = name;
        this.secondName = secondName;
        this.surname = surname;
        this.phone = phone;
        this.position = position;
        this.salary = salary;
        this.birthYear = birthYear;
        this.uid = ++id; /*уникальный идентификационный номер uid сделать то что есть сейчас в static и
        к этому что то прибавить ++id  8 задание*/

    /* 3) Внутри класса "Сотрудник" написать методы, которые возвращают значение каждого поля*/
    public int getAge() {
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




}
}
