package main.java.Collection_Frameworks;

import java.util.LinkedList;
import java.util.Queue;

public class QueuDemo {
    public static void main(String[] args) {
        Queue<Integer> queue= new LinkedList<>();

        queue.offer(12);
        queue.offer(13);
        queue.offer(25);
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);
        System.out.println(queue.peek());
        queue.add(56);
        queue.element();
        queue.remove();//remove head of queue and throw exception if the list is empty

    }
}
