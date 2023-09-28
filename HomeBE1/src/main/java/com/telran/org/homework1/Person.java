package com.telran.org.homework1;


public class Person {
    private String name;
    private String fullName;
    private int age;

    public Person() {

    }

    public String getName() {
        return name;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAge(int age) {
        if (age<0){
            return;
        }
        this.age = age;
    }

    public Person(String name, String fullName, int age){
        this.name = name;
        this.fullName = fullName;
        this.age = age;

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", fullName='" + fullName + '\'' +
                ", age=" + age +
                '}';
    }

    public void move() {
        System.out.println(name + " " + age + " лет" + " идет.");
    }

    public void talk() {
        System.out.println(fullName + " " + age + " лет" + " говорит.");
    }
}