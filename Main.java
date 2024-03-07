package brocode;

import java.util.*;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		// String name = "istiak";
		// System.out.println("Enter Name:");

		/*
		 * while(!name.equals("istiak")) { name = sc.nextLine() ;
		 * 
		 * 
		 * 
		 * } System.out.println("Welcome "+ name);
		 * 
		 * 
		 * do { name = sc.nextLine() ;
		 * 
		 * 
		 * 
		 * }while(!name.equals("istiak")); System.out.println("Welcome "+ name);
		 */

		/*
		 * int row,colum; String star; System.out.println("Enter Row:"); row =
		 * sc.nextInt(); System.out.println("Enter Colum:"); colum = sc.nextInt();
		 * System.out.println("Enter Symbol:"); star = sc.next(); for(int i = 1;
		 * i<=row;i++) { System.out.println(); for(int j =1 ; j<=colum;j++) {
		 * System.out.print(star); } }
		 */
		
		/*ArrayList<Wraper class>
		ArrayList<String> food = new ArrayList();
		food.add("Biryani");
		food.add("Morog Polaw");
		food.add("Teheri");
		food.add("Vuna Khicuri");
		food.add("Halim");
		food.set(1, "kabab");
		
		/*for(int i=0 ; i<food.size(); i++ ) {
			System.out.println(food.get(i));
		}
		
		for(String i : food) {
			System.out.println(i);
		}*/
		
		DiceRoller dr = new DiceRoller();
		
		
		

	}

}
