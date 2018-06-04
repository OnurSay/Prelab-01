import java.util.Scanner;
public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
			
		int divisor, divident;
		System.out.print("Please enter the Divisor: ");
		divisor = scanner.nextInt();
		System.out.print("Please enter the Dividend: ");
				divident = scanner.nextInt();
					
					
						System.out.println("The result of " +divisor+"/"+divident + " is "+ divisor/divident+ " and the remainder is " +(divisor-((divisor/divident)*divident))+"." );
		
	}

}
