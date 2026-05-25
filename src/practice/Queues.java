package practice;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    public static void main(String[] args){
        /* Queue is a FIFO data Structue.First in first Out.
        add->offer,enqueue
        remove->poll,dequeue
        top_element->peek
         */
        Queue<String> queue= new LinkedList<>();
        //queue is an interface .it implements Linked list.
        queue.offer("yoga");
        queue.offer("raja");
        queue.offer("durai");
        queue.offer("arun");
        System.out.println(queue);
        queue.poll();
        System.out.println(queue.peek());
        System.out.println(queue);
        //some of the important methods
        System.out.println(queue.isEmpty());
        System.out.println(queue.size());

        System.out.println(queue.contains("durai"));


    }
}
