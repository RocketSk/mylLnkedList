public class Main {
    public static void main(String[] args) {
        MyLinkedList<String> stringMyLinkedList = new MyLinkedList<>();

        stringMyLinkedList.addLast("Hello everybody");
        stringMyLinkedList.addLast("Hello hello");
        stringMyLinkedList.addLast("Hello very");
        stringMyLinkedList.addFirst("very very");
        stringMyLinkedList.addFirst("lady very");
        stringMyLinkedList.addFirst("lol very");

        for (String s : stringMyLinkedList) {
            System.out.println(s);
        }
    }
}
