package practice;
import java.util.PriorityQueue;
import java.util.Queue;

public class priorityQueue {
    public static void main(String[] args) {
        Queue<Double> queue =new PriorityQueue<>();
        Queue<String> queue1 =new PriorityQueue<>();
        //to print in reverse order -> Queue<String> queue1 =new PriorityQueue<>(Collections.reverseOrder());
        queue.offer(3.0);
        queue.offer(2.5);
        queue.offer(4.0);
        queue.offer(1.0);
        queue.offer(2.0);
        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
        System.out.println();
        queue1.offer("A");
        queue1.offer("C");
        queue1.offer("B");
        queue1.offer("D");
        queue1.offer("E");
        while(!queue1.isEmpty()){
            System.out.println(queue1.poll());
        }
    }
}
