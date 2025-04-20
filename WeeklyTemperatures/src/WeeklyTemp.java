import java.util.ArrayList;
import java.util.Scanner;

public class WeeklyTemp {

	public static void main(String[] args) {
		final int NUM_OF_ELEMENTS = 7;
		Scanner scnr = new Scanner (System.in);
		ArrayList<String> weekDay = new ArrayList<>(); 
		ArrayList<Integer> dailyTemp = new ArrayList<>(); 
		int i; 
		double sum =0;
		
		
		weekDay.add("monday");
		weekDay.add("tuesday");
		weekDay.add("wednesday");
		weekDay.add("thursday");
		weekDay.add("friday");
		weekDay.add("saturday");
		weekDay.add("sunday");
		
		System.out.println("Please enter the daily average temperature for each day beginning from Monday");
		
		for (i = 0; i < NUM_OF_ELEMENTS; i++) {
			System.out.println(weekDay.get(i) + "'s daily average temperature is : ");
			dailyTemp.add(scnr.nextInt()); 
		}
		
		System.out.println("Please select day Monday-Sunday to display daily average temperature or input 'week' "
				+ "to display the weekly average temperature with daily statistics");
		scnr.nextLine();
		String input = scnr.nextLine().toLowerCase();
		
		int newIndex = weekDay.indexOf(input);
		
		if (newIndex != -1) {
			
			System.out.println("The Daily average temperature for " + weekDay.get(newIndex) + " is: " + dailyTemp.get(newIndex));
			
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
