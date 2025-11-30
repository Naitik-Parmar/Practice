public class SinglyMain {
    public static void main(String[] args) {
        SinglyLinkedList sl=new SinglyLinkedList();
        sl.insertFirst(3);
        sl.insertFirst(2);
        sl.insertFirst(8);
        sl.insertFirst(17);
        sl.insertLast(99);
        sl.display();

        sl.insert(2,1);
        sl.display();

        System.out.println(sl.deleteFirst());
        sl.display();

        System.out.println(sl.deleteLast());
        sl.display();

        System.out.println(sl.delete(3));
        sl.display();
    }
}
