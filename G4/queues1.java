package G4;
import java.util.*;
public class queues1 {
    public static void main(String[] args) {
        //collection-> list, set queue;
        //queue () -> offer, peek, poll
        Queue<Integer> que = new ArrayDeque<>();
        que.offer(234);// adding the element, will not show exception if queue is full, will simply return false
        que.add(1234); // will throw an exception 

        que.poll(); //for removing the element, return false
        que.remove(); // throw exception

        que.peek();//return the  head of the queue

        //queue-> dqueue (double ended queue), priorityqueue()

        ArrayDeque<Integer> dq = new ArrayDeque<>(); //dono taraf se elements add ho sakte hai
        dq.offerFirst(12); //adding the element at start
        dq.addFirst(145);

        dq.pollFirst(); // used to remove element from head
        dq.removeFirst();

        dq.pollLast(); // remove element from the last
        dq.removeLast();

        dq.peekFirst(); // returns the head of queue (first element)
        dq.peekLast();


        //Priority Queue
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.offer(13);
        pq.offer(42);
        pq.offer(4);
        pq.offer(5);

        System.out.println(pq.poll());

    }
}
