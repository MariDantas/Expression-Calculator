import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Calculator {

	public static void main(String[] args) throws InterruptedException {
		double number;
		double newSum = 0;
		DecimalFormat decimalFormat = new DecimalFormat("#.####");
		Scanner read = new Scanner(System.in);
		
		try {
			System.out.print("Enter a number greater than or equal to 2: ");
			number = read.nextDouble();
			
			if (number >= 2) {
				double j = number;
				
				for (double i = 1; i < number; i++) {
					double currSum = newSum;
					String formattedExp = decimalFormat.format((j * (j-1))/i);
					long roundJ = Math.round(j);
					long roundI = Math.round(i);
					
					TimeUnit.SECONDS.sleep(2);
					System.out.println("\n(" + roundJ + " * " + (roundJ-1) + ")/" + roundI + " = " + formattedExp);
					if (i == 1 || i % 2 == 0) {
						
						newSum += (j * (j-1))/i;
						String formattedNewSum = decimalFormat.format(newSum);
						String formattedCurrSum = decimalFormat.format(currSum);
						
						System.out.println(formattedCurrSum + " + " + formattedExp + " = " + formattedNewSum);
					} else {
						
						newSum -= (j * (j-1))/i;
						String formattedNewSum = decimalFormat.format(newSum);
						String formattedCurrSum = decimalFormat.format(currSum);
						
						System.out.println(formattedCurrSum + " - " + formattedExp + " = " + formattedNewSum);
					}
					
					j--;
				}
				
				System.out.println("\n\nThe result is: " + decimalFormat.format(newSum));
				
			} else {
				System.out.println("Invalid number!");
			}
		} catch (Exception e) {
			System.out.println("Error: the value entered is not a number!");
		}
		
	}

}
