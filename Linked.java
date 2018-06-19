import java.util.*;
public class Linked {
	public static void main(String[] args){
		Integer[] iray = {3,7,5,1,9,4};
		LinkedList<Integer> list1 = new LinkedList<Integer>(Arrays.asList(iray));
		
		Integer[] ray = {14,12,4,5};
		LinkedList<Integer> list2 = new LinkedList<Integer>(Arrays.asList(ray));
		
		list1.addAll(list2);
		list2 = null;
		
		printMe(list1);
		removeStuff(list1, 2, 5);
		printMe(list1);
		reverseMe(list1);
		
	}
	//printMe method
	private static void printMe(LinkedList<Integer> l){
		for(Integer x : l){
			System.out.printf("%d ", x);
		}
		System.out.println();
	}
	//removeStuff Method
	private static void removeStuff(LinkedList<Integer> l, int from, int to){
		l.subList(from, to).clear();
	}
	//reverseMe Method
	private static void reverseMe(LinkedList<Integer> l){
		ListIterator<Integer> bobby = l.listIterator(l.size());
		while(bobby.hasPrevious()){
			System.out.printf("%d ", bobby.previous());
		}
	}
}
