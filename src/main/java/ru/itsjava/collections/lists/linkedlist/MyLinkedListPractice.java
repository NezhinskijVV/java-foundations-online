package ru.itsjava.collections.lists.linkedlist;

public class MyLinkedListPractice {

    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList();

        list.add("Строка 1");
        System.out.println("list = " + list);

        list.add("Строка 2");
        System.out.println("list = " + list);

        list.add("Строка 3");
        System.out.println("list = " + list);


        list.remove(2);
        System.out.println("list = " + list);

    }
}
