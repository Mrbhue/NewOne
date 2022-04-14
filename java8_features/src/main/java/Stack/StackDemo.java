package main.java.Stack;

import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {
        Stack<String> stack= new Stack<>();
        stack.push("leo");
        stack.push("monkey");
        stack.push("cat");
        stack.push("horse");
        stack.push("Cow");
        System.out.println(stack);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.search("leo"));
        System.out.println(stack.contains("leo"));
    }
}
