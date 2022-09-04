import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueDemo {

	public static void main(String[] args) {
		
		Queue<Integer> qu = new ArrayBlockingQueue<>(4);
		
		System.out.println("Removing the Element before anything is added - No Error" );
		qu.poll();
		
		System.out.println("Checking the Elelment before anything is added - No Error" );
		qu.peek();
		
		System.out.println("Adding More than four Element - No Error");
		qu.offer(1);
		qu.offer(2);
		qu.offer(3);
		qu.offer(4);
		qu.offer(5);
		
		System.out.println("Printing the Elements ");

		for ( Integer quprin : qu)
		{
			System.out.println(quprin);
		}
		
		System.out.println("Removing the Element after anything is added - No Error" );
		qu.poll();
		System.out.println("Printing the Elements Post Removal ");

		for ( Integer quprin : qu)
		{
			System.out.println(quprin);
		}
		
		System.out.println("Checking the Elelment after anything is added - No Error" );
		qu.peek();
		System.out.println("Printing the Elements Post Peek ");

		for ( Integer quprin : qu)
		{
			System.out.println(quprin);
		}
		
	}

}
