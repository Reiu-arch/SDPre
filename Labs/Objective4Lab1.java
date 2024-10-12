import java.util.Scanner;

public class Objective4Lab1 {
	public static void main (String [] args) {
		Scanner keyboard = new Scanner(System.in);

		//first name
		System.out.println("What is your first name?");
		String fname = keyboard.nextLine();

		//last name
		System.out.println("What is your last name?");
		String lname = keyboard.nextLine();

		//fave animal
		System.out.println("What is your favorite animal?");
		String fanimal = keyboard.nextLine();

		//fave food
		System.out.println("What food is your favorite?");
		String ffood = keyboard.nextLine();

		//fave Song
		System.out.println("What is your favorite song?");
		String fsong = keyboard.nextLine();


		System.out.println("My name is " + fname + " " + lname);
		System.out.println("My favorite animal is " + fanimal);
		System.out.println("My favorite food is " + ffood);
		System.out.println("My favorite song is " + fsong);

	}
}