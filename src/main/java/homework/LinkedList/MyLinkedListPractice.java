package homework.LinkedList;

public class MyLinkedListPractice {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.add("Строка1");
        System.out.println("list = " + list);
        list.add("Строка2");
        System.out.println("list = " + list);
        list.add("Строка3");

        System.out.println("list = " + list);
        System.out.println("list.size() = " + list.size());
        System.out.println("list.isEmpty() = " + list.isEmpty());
        System.out.println("list.contains(\"Строка4\") = " + list.contains("Строка4"));


        list.remove(1);
        System.out.println("list = " + list);
        System.out.println("list.get(0) = " + list.get(0));

        list.set(0, "Строка0");
        System.out.println("list = " + list);

        list.remove("Строка4");
        System.out.println(list);

        System.out.println("list.indexOf(\"Строка2\") = " + list.indexOf("Строка2"));
    }

}
