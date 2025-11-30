import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> stack =new Stack<>();
        stack.add("harry");
        stack.add("ronald");
        stack.add("hermione");

        System.out.println(stack);

        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
