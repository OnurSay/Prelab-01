import java.util.Scanner;
public class Question2 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		int hours,minutes,seconds;
		System.out.print("Please enter the time in hours: ");
		hours = keyboard.nextInt();
		System.out.print( "Please enter the time in minutes: ");
		minutes = keyboard.nextInt();
		System.out.print( "Please enter the time in seconds: ");
		seconds = keyboard.nextInt();
		
		
		System.out.println(hours + " hour, " + minutes + " minutes, and " + seconds + " seconds is equivalent to " + ((hours*3600)+(minutes*60)+seconds) + " seconds." );

		
	}

}
