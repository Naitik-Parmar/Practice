public class DLL{

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

    public void insertLast(int val){
        if(head==null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        Node last = head;
        while(last.next!=null){
            last=last.next;
        }
        last.next=node;
        node.next=null;
        node.prev=last;
    }
    public void display(){
        Node temp = head;
        Node last = null;
        while(temp!=null){
            System.out.print(temp.val+" -> ");
            last=temp;
            temp = temp.next;
        }
        System.out.println("END");

        System.out.println("Reverse Print");
        while(last!=null){
            System.out.print(last.val+" -> ");
            last=last.prev;
        }
        System.out.println("START");
    }

    private class Node{
        private int val;
        private Node prev;
        private Node next;

        public Node(int val){
            this.val = val;
        }
        public Node(int val, Node prev, Node next){
            this.val = val;
            this.prev = prev;
            this.next = next;
        }
    }
}