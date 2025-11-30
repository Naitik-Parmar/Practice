import java.util.Queue;
import java.util.LinkedList;

public class D2QueueDemo {
    public static void main(String[] args) {
        Queue<String> queue=new LinkedList<>();
        queue.add("harry");
        queue.add("ronald");
        queue.add("hermione");

        System.out.println(queue);
        System.out.println(queue.size());
        System.out.println(queue.remove());
        System.out.println(queue);
        System.out.println(queue.size());
        System.out.println(queue.element());
        System.out.println(queue);
    }
}
