public class SinglyLinkedList<E>{

    private Node head;
    private int size;
    private class Node {
        public E element;

        public Node next;

        public void displayNodeData() {
            System.out.print( element +  " -> ");
        }
        public Node(E element){
            this.element = element;
            next = null;
        }

        public Node(E element, Node next){
            this.element = element;
            this.next = next;
        }
        public String toString(){
            return "Node = " + this.element.toString();
        }
    }


    private Node getNode(int index){
        try {
            if (index < 0 || index > size) throw  new IndexOutOfBoundsException();
        }
        catch (IndexOutOfBoundsException e){

        }

        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }



    public void addFirst(E element) {
        Node newNode = new Node(element);
        newNode.element = element;
        newNode.next = head;
        head = newNode;
    }

    public void removeFirst() {
        head = head.next;
    }

    public void addLast(E element) {
        Node current = head;
        while(current.next != null) {
            current = current.next;
        }

        Node newNode = new Node(element);
        newNode.element = element;
        current.next = newNode;
    }

    public void removeLast() {
        Node current = head;
        Node temp = head;
        while (current.next != null) {
            temp = current;
            current = current.next;
        }
        current = temp;
        current.next = null;
    }

    public void add(int index,E element) {
        try {
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException();
            }
        }
        catch (IndexOutOfBoundsException e) {

        }

        if (index == 0) {
            Node node = new Node(element, head);
            head = node;
            size++;
        } else {
            Node node = getNode(index - 1);
            Node newNode = new Node(element, node.next);
            node.next = newNode;
        }
    }



    public void remove(int index) {
        if (index == 0){
            head = head.next;
        }
        Node node = getNode(index - 1);
        node.next = node.next.next;
    }

    public void printLinkedList() {
        Node current = head;
        while (current != null) {
            current.displayNodeData();
            current = current.next;

        }
        System.out.print("NULL");

    }
}
