public class DoublyMain {
    public static void main(String[] args) {
        DoublyLinkedList dll= new DoublyLinkedList();
        dll.insertFirst(3);
        dll.insertFirst(2);
        dll.insertFirst(8);
        dll.insertFirst(17);

        dll.insertLast(99);

        dll.display();
        dll.insert(2,100);
        dll.display();
    }
}
