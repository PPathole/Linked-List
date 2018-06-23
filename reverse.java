package reverse;
import java.util.*;
public class reverse {
	public static void main(String[] args){
		LinkedList<Integer> l1 = new LinkedList<Integer>();
		addElements(l1);
		printMe(l1);
		reverseMe(l1);
	}
	//addElements Method
	private static void addElements(LinkedList<Integer> l){
		l.add(3);
		l.add(7);
		l.add(1);
		l.add(16);
		l.add(4);
		l.add(6);
	}
	//PrintME method
	private static void printMe(LinkedList<Integer> l){
		for(Integer x : l){
			System.out.printf("%d ", x);
		}System.out.println();
	}
	//reverseME method
	private static void reverseMe(LinkedList<Integer> l){
		ListIterator<Integer> bobby = l.listIterator(l.size());
		while(bobby.hasPrevious()){
			System.out.printf("%d ", bobby.previous());
		}
	}
}
