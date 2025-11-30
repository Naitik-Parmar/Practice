public class DLLMain {
    public static void main(String[] args) {
        DLL dll = new DLL();
        dll.insertFirst(3);
        dll.insertFirst(2);
        dll.insertFirst(8);
        dll.insertFirst(17);
        dll.insertLast(99);
        dll.insertLast(199);
        dll.display();
    }
}
