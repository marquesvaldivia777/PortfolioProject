import java.util.Scanner;

public class gradeStatistics {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
	
		double nextNumber;
		double maxNumber=0;
		double minNumber=0;
		double total=0; 
		int i;
		double numValues =0;
		
		System.out.println("Please provide 10 numbers from the class to calculate the Average, Minimum, and Maximum values: ");
		//prompt user for input
		
		for (i=0; i<10; i++) {
			nextNumber = scnr.nextDouble();
			numValues = numValues + 1; //this will give me the total numbers
			
			if (i==0) {				//1st iteration 	
				total = nextNumber;
			}
			else {
				total = total + nextNumber; // this will give me total
			}
			
			if (i==0) { //1st iteration
				maxNumber = nextNumber;
			}
			else if (nextNumber>maxNumber) {
				maxNumber = nextNumber; // this will give me maximum
			}
			
			if (i==0) { //1st iteration
				minNumber = nextNumber;
			}
			else if (nextNumber<minNumber) {
				minNumber = nextNumber; //this will give me minimum number
			}
			
				
		}
		System.out.println("The statistics for the 10 grades are as follows: ");
		System.out.println("Average: " + (total/numValues));
		System.out.println("Maximum: " + maxNumber);
		System.out.println("Minimum:" + minNumber);
			

	}

}
