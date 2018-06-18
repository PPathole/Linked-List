import java.util.*;
public class beerbongs {
	public static void main(String[] args){
		Character[] cray = {'p','w','n','x','c','f'};
		LinkedList<Character> list1 = new LinkedList<Character>(Arrays.asList(cray)); //Converstion to List from Array
		System.out.println("Original list: ");
		output(list1);
		
		Collections.sort(list1);
		System.out.println("Sorted List: ");
		output(list1);
		
		Collections.reverse(list1);
		System.out.println("Reverse list: ");
		output(list1);
		
		cray = list1.toArray(new Character[list1.size()]); //Converting back to Array from list
		
	}
	private static void output(LinkedList<Character> l){
		for(Character x : l){
			System.out.printf("%s ", x);
		}
		System.out.println();
	}
}
