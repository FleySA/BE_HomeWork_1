package com.telran.org.homework1;

public class Homework1App {

    public static void main(String[] args){


        Person mann = new Person();
        mann.setName("Саша ");
        mann.setFullName("Александр");
        mann.setAge(30);


        Person bigmann = new Person("Коля", "Николай", 50);

        System.out.println(mann);
        System.out.println(bigmann);

        System.out.println("Name: " + mann.getName());
        System.out.println("fullName: " + mann.getFullName());
        System.out.println("Age is - " + mann.getAge());

        System.out.println("\nPerson 1:");
        System.out.println(mann);
        mann.move();  // Вызываем метод для объекта mann
        mann.talk();  // Вызываем метод для объекта mann

        System.out.println("\nPerson 2:");
        System.out.println(bigmann);
        bigmann.move();  // Вызываем метод для объекта bigmann
        bigmann.talk();  // Вызываем метод для объекта bigmann

        Phone phone1 = new Phone("123456789", "iPhone X", 0.3);
        Phone phone2 = new Phone("987654321", "Samsung Galaxy S10", 0.4);
        Phone phone3 = new Phone("111222333", "Google Pixel 3", 0.35);


        System.out.println("\nPhone 1:");
        System.out.println("Number: " + phone1.getNumber());
        System.out.println("Model: " + phone1.getModel());
        System.out.println("Weight: " + phone1.getWeight() + " kg");

        System.out.println("\nPhone 2:");
        System.out.println("Number: " + phone2.getNumber());
        System.out.println("Model: " + phone2.getModel());
        System.out.println("Weight: " + phone2.getWeight() + " kg");

        System.out.println("\nPhone 3:");
        System.out.println("Number: " + phone3.getNumber());
        System.out.println("Model: " + phone3.getModel());
        System.out.println("Weight: " + phone3.getWeight() + " kg");

        System.out.println("\nPhone 1:");
        phone1.receiveCall("Alice");
        System.out.println("Phone number: " + phone1.getNumber());

        System.out.println("\nPhone 2:");
        phone2.receiveCall("Bob");
        System.out.println("Phone number: " + phone2.getNumber());

        System.out.println("\nPhone 3:");
        phone3.receiveCall("Charlie");
        System.out.println("Phone number: " + phone3.getNumber());

    }


}