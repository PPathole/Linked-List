package merge;
import java.util.*;
public class merge {
	public static void main(String[] args){
		LinkedList<Integer> l1 = new LinkedList<Integer>();
		l1.add(3);
		l1.add(12);
		l1.add(13);
		l1.add(1);
		
		LinkedList<Integer> l2 = new LinkedList<Integer>();
		l2.add(4);
		l2.add(116);
		l2.add(14);
		l2.add(15);
		
		l1.addAll(l2);
		l2 = null;
		System.out.println("Merged list: ");
		output(l1);
		
	}
	private static void output(LinkedList<Integer> l){
		for(Integer x : l){
			System.out.printf("%d ", x);
		}System.out.println();
	}
}