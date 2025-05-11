package com.corejava;

class Parent {
    private String name;
    private int age;
    private int salary;
    private static final int PRE_SAVED_AMOUNT = 2500000;

    public Parent(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getIncome() {
        return this.salary + PRE_SAVED_AMOUNT;
    }
    public void getDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println();
    }
}

class Child extends Parent {

    public Child(String name, int age, int salary) {
        super(name, age, salary);
    }
}
public class Inheritance {

    public static void main(String[] args) {
        Parent parent = new Parent("Prasad", 41, 75000);
        System.out.println("Parent Income: " + parent.getIncome());
        parent.getDetails();

        Child child = new Child("Eswar", 21, 185000);
        System.out.println("Child Income: " + child.getIncome());
        child.getDetails();
    }
}
