import java.util.Scanner;

public class TaxWithholding {
	public static void main(String[] args) {
		Scanner scnr = new Scanner (System.in);
		double weeklyIncome;
		double taxRate;
		double taxWithholding;
		
		
		/*prompt user to enter weekly income which will be used
		to calculate taxWithholding
		 */
		System.out.println("::: Please enter your weekly income :::"
				+ "\n(Your tax with holding will be calculated \naccording to your tax bracket.)");
		weeklyIncome = scnr.nextInt();
		
		
		/*if else if and else used to determine stepwise taxbracket
		 * will pass taxRate*/
		if (weeklyIncome <500) {
			taxRate = 0.10;
		}
		else if (weeklyIncome <1500) {
			taxRate = 0.15;
		}
		else if (weeklyIncome < 2500) {
			taxRate = 0.20;
		}
		else {
			taxRate = 0.30;
		}
		
		/*taxRate received from if statement is then used to calculate taxWithholding*/
		taxWithholding = weeklyIncome * taxRate;
		
		//print the results to the user
		System.out.println("Your weekly tax with holding is "
				+ taxWithholding + " with a tax rate of " + taxRate*100 + "%");
	

	}

}
