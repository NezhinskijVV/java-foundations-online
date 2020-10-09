package ru.itsjava.object;

public class ObjectPractice {

    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object(); //ctrl + D

        System.out.println(obj1 == obj2);

        System.out.println("obj1.equals(obj2) = " + obj1.equals(obj2));

        obj2 = obj1;

        System.out.println("obj1.equals(obj2) = " + obj1.equals(obj2));

        Dog gurka = new Dog("Журка", 4);
        Dog gurka2 = new Dog("Журка", 4);

        Dog murka = new Dog("Mурка", 4);

        System.out.println("gurka.equals(gurka2) = " + gurka.equals(gurka2));
        System.out.println("gurka.equals(murka) = " + gurka.equals(murka));


        System.out.println("gurka.equals(obj1) = " + gurka.equals(obj1));

        System.out.println("gurka.toString() = " + gurka);


        System.out.println("gurka.getNickname() = " + gurka.getNickname());
    }
}
