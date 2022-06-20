package arrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AddFunction {

	public static void main(String[] args) {
		
		List<String> animals = new LinkedList();
		
		List<String> vegetables = new ArrayList();
		
		animals.add("Dog");
		animals.add("Cat");
		animals.add("Monkey");
		
		vegetables.add("Cabbage");
		vegetables.add("Tomato");
		vegetables.add("Spinach");
		
		vegetables.addAll(animals);
		
		System.out.println(animals);
		System.out.println(vegetables);
	}

}
