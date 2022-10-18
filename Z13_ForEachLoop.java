import java.util.ArrayList;

public class Z13_ForEachLoop {

	public static void main(String[] args) {
		
		//for-each loop = traversing technique to iterate through the elements in an array/collection
		//                less steps, more readable
		//                less flexible
		
		
		//Arrays
		
		String[] cars = {"Mustang", "Ford", "Chevy"};
		
		for(String i : cars) {
			System.out.println(i);
		}
		
		
		//ArrayList
		
		ArrayList<String> food = new ArrayList();
		
		food.add("Pizza");
		food.add("Hotdog");
		food.add("Sushi");
		
		for(String j : food) {
			System.out.println(j);
		}
		

	}

}
