import java.util.*;
public class bluewhales {
	public static void main(String[] args){
		PriorityQueue<Integer> q = new PriorityQueue<Integer>();
		q.offer(3);
		output(q);
		q.offer(7);
		output(q);
		q.offer(1);
		output(q);
		q.offer(17);
		output(q);
		q.offer(12);
		output(q);
		
		q.poll();
		output(q);
		q.poll();
		output(q);
		q.poll();
		output(q);
		q.poll();
		output(q);
		q.poll();
		output(q);
		
	}
	private static void output(PriorityQueue<Integer> queue){
		if(queue.isEmpty()){
			System.out.println("Nothing to see here hoss!");
		}else{
			for(Integer x : queue){
				System.out.printf("%d ", x);
			}
			System.out.println();
		}
	}
}
