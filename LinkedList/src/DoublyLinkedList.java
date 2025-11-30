public class DoublyLinkedList {
    private Node head;
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next=head;
        node.prev=null;
        if(head!=null){
            head.prev=node;
        }
        head=node;
    }
    public void display(){
        Node temp = head;
        Node last = null;
        while(temp!=null){
            last=temp;
            System.out.print(temp.val+" -> ");
            temp=temp.next;
        }
        System.out.println("END");
        System.out.println();
        System.out.println("Reverse Print...");
        while(last!=null){
            System.out.print(last.val+" -> ");
            last=last.prev;
        }
        System.out.println("START");
    }

    public void insertLast(int val){
        Node last = head;
        while(last.next!=null){
            last=last.next;
        }
        Node node = new Node(val);
        last.next=node;
        node.next=null;
        node.prev=last;
    }

    public Node get(int index){
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }
    public void insert(int index, int val){
        Node temp = get(index-1);
        Node node = new Node(val,temp.prev,temp.next);
        temp.next=node;
        node.prev=temp;
    }
    private class Node{
        private int val;
        private Node prev;
        private Node next;


        public Node(int val){
            this.val=val;
        }
        public Node(int val, Node prev, Node next){
            this.val = val;
            this.prev = prev;
            this.next = next;
        }
    }
}
