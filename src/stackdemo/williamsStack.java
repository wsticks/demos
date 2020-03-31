package stackdemo;

public class williamsStack {

    public static void main(String[] args) {

        Stack stack = new Stack();

        System.out.println("Empty = " + stack.isEmpty());

        stack.push(15);
        stack.push(8);
        System.out.println(stack.peek());
        stack.push(10);
        stack.push(7);
        stack.push(6);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());








        System.out.println("size is: " + stack.size());

        System.out.println("Empty = " + stack.isEmpty());

        stack.show();

    }
}
