import java.util.*;

public class ChangingPriorityQueueSortOrder20_21 {
    public static void main(String[] args) {
        PriorityQueue<Double> queue = new PriorityQueue<Double>();
        List<Double> list = new LinkedList<>();
        queue.offer(3.9);
        queue.offer(9.8);
        queue.offer(5.4);
        queue.offer(1.2);
        System.out.println("Polling from queue");
        list.addAll(queue);
        Collections.reverse(list);
        for(Double element : list){
            System.out.println(element);
        }

    }
}
