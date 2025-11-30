public class SinglyLinkedList {

    private Node head;
    private Node tail;
    private int size;
    public SinglyLinkedList(){
        this.size=0;
    }
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
        size++;
    }
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+" -> ");
            temp=temp.next;
        }
        System.out.println("END");
    }

    public void insertLast(int val){
        if(tail==null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next=node;
        tail=node;
        size++;
    }

    public void insert(int index, int val){
        if(index==0){
            insertFirst(val);
            return;
        }
        if(index==size){
            insertLast(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp=temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next=node;
        size++;
    }

    public int deleteFirst(){
        int val = head.val;
        head=head.next;
        size--;
        return val;
    }

    public Node get(int index){
        Node node = head;
        if(head==null){
            tail=null;
        }
        for (int i = 0; i < index; i++) {
            node=node.next;
        }
        return node;
    }

    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        int val = tail.val;
        Node secondLast = get(size-2);
        tail=secondLast;
        tail.next=null;
        size--;
        return val;
    }

    public int delete(int index){
        if(index==0){
            return deleteFirst();
        }
        if(index==size){
            return deleteLast();
        }
        Node prev = get(index-1);
        int val = prev.next.val;
        prev.next=prev.next.next;
        size--;
        return val;
    }
    private class Node{
        private int val;
        private Node next;

        public Node(int val){
            this.val=val;
        }
        public Node(int val, Node next){
            this.val = val;
            this.next = next;
        }
    }
}