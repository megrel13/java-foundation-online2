package ru.itsjava.arrayList;

public class MyArrayListPractice {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        System.out.println(list.size());
        list.add("Privet");
        list.add("Privet");
        System.out.println("После добавления двух элементов размер равен " + list.size());
        list.add("Пока");
        list.add("Пока");
        list.add("Пока");
        list.add("Пока");
        list.add("Пока");
        list.add("Пока");
        list.add("Пока");
        list.add("Пока");
        System.out.println(list.size());

        System.out.println(list);

    }
}
