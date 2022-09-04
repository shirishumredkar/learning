import java.util.Deque;
import java.util.concurrent.LinkedBlockingDeque;

public class DequeueDemo {

	public static void main(String[] args) {
		
		Deque<Integer> dq = new LinkedBlockingDeque<Integer>();
		
		dq.offerFirst(0);
		dq.offer(1);
		dq.offer(2);
		dq.offer(3);
		dq.offerLast(4);
		
		System.out.println("Printing the List after addition at first , middle & last");
		for(Integer dqp : dq)
		{
			System.out.println(dqp);
		}
		
		System.out.println("Printing the List after removal at first , middle & last");
		dq.pollFirst();
		dq.poll();
		dq.pollLast();
		for(Integer dqp : dq)
		{
			System.out.println(dqp);
		}
	}

}
