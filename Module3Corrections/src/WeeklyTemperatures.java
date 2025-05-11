import java.util.ArrayList;
import java.util.Scanner;

public class WeeklyTemperatures {
	
	public static void main(String[] args) {
		final int NUM_OF_ELEMENTS = 7;
		Scanner scnr = new Scanner (System.in);
		ArrayList<String> weekDay = new ArrayList<>(); 
		ArrayList<Integer> dailyTemp = new ArrayList<>(); 
		int i; 
		double sum =0;
		/*Two arraylists are created
		 * first arraylist will instantiate the days of the week*/
		
		weekDay.add("monday");
		weekDay.add("tuesday");
		weekDay.add("wednesday");
		weekDay.add("thursday");
		weekDay.add("friday");
		weekDay.add("saturday");
		weekDay.add("sunday");
		
		System.out.println("Please enter the daily average temperature for each day beginning from Monday");
		/*prompt user to input a daily avg temp
		 * the for loop will iterate 7 times and add the corresponding 
		 * new element to the array*/
		for (i = 0; i < NUM_OF_ELEMENTS; i++) {
			System.out.println(weekDay.get(i) + "'s daily average temperature is : ");
			dailyTemp.add(scnr.nextInt()); 
		}
		
		System.out.println("Please select day Monday-Sunday to display daily average temperature or input 'week' "
				+ "to display the weekly average temperature with daily statistics");
		scnr.nextLine();
		
		
		/*prompt user to select a day and consumer the newline since we are 
		 * changing from scanint to scannext
		 * the lowercase is to not worry about the case of the letters entered*/
		
		String input = scnr.nextLine().toLowerCase();
		
		//input will be compared to element in array 
		//index will be returned
		//index of -1 means not found
		int newIndex = weekDay.indexOf(input);
		
		if (newIndex != -1) {
			
			System.out.println("The Daily average temperature for " + weekDay.get(newIndex)
			+ " is: " + dailyTemp.get(newIndex));
			
		}
		else if (input.equals("week")) {
			
			for (int dailyTemps : dailyTemp	) {
				sum += dailyTemps; 
			}
			System.out.println("The weekly average temperateure " + sum/NUM_OF_ELEMENTS	
					+ " and the statistics for the week."); 
			
			for (i = 0; i < dailyTemp.size(); i++) {
				System.out.println(weekDay.get(i) + " : " + dailyTemp.get(i));
			}
		}
		
		
			
	}

}
