import java.util.Scanner;

public class Objective4Lab3 {
	public static void main(String[] args) {

	Scanner keyboard = new Scanner(System.in);

	//ask age
	System.out.println("How old are you?");
	int age = keyboard.nextInt();

	int birthyear = 2024 - age;

	System.out.println("You where born in " + birthyear);

	}
}
