

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.addFirst(1);
        linkedList.addFirst(8);
        linkedList.addFirst(5);


        linkedList.addLast(3);
        linkedList.removeLast();
        linkedList.add(2, 12);



        linkedList.printLinkedList();
    }
}
