package linked;
import java.util.*;
public class linked {
	public static void main(String[] args){
		String[] things = {"eggs", "bread", "sausage", "racoon"};
		List<String> list1 = new LinkedList<String>();
		for(String x : things){
			list1.add(x);
		}
		String[] things2 = {"harrypotter", "bacon", "cheese"};
		List<String> list2 = new LinkedList<String>();
		for(String y : things2){
			list2.add(y);
		}
		
		list1.addAll(list2);
		list2 = null;
		
		printMe(list1);
		removeStuff(list1, 2, 5);
		printMe(list1);
		reverseMe(list1);
		
	}
	//printMe method
	private static void printMe(List<String> l1){
		for(String b : l1){
			System.out.printf("%s ", b);
		}
		System.out.println();
	}
	//removeStuff method
	private static void removeStuff(List<String> l1, int from, int to){
		l1.subList(from, to).clear();
	}
	//reverseMe method
	private static void reverseMe(List<String> l1){
		ListIterator<String> bobby = l1.listIterator(l1.size());
		while(bobby.hasPrevious()){
			System.out.printf("%s ", bobby.hasPrevious());
		}
	}
}
