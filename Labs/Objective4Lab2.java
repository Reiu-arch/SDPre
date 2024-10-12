import java.util.Scanner;

public class Objective4Lab2 {
	public static void main (String[] args) {

		Scanner keyboard = new Scanner(System.in);

        //first number
        System.out.println("what is the first whole number you would like to add?");
        int num1 = keyboard.nextInt();

        //second number
        System.out.println("what is the second whole number you would like to add?");
        int num2 = keyboard.nextInt();

        //third number
        System.out.println("what is the third whole number you would like to add?");
        int num3 = keyboard.nextInt();

        int sum1 = num1 + num2 + num3;

        //first decimal
        System.out.println("what is the first decimal number you would like to add?");
        double dub1 = keyboard.nextDouble();

        //second decimal
        System.out.println("what is the second decimal number you would like to add?");
        double dub2 = keyboard.nextDouble();

        //third decimal
        System.out.println("what is the third decimal number you would like to add?");
        double dub3 = keyboard.nextDouble();

        double sum2 = dub1 + dub2 + dub3;

        //sum of whole and printout
        System.out.println("The sum of "+ num1+ " + "+ num2 +" + " +num3+ " = " +sum1);

        //sum of decimals and printout
        System.out.println("The sum of " +dub1 +" + " +dub2 +" + " +dub3 +" = "+ sum2);
	}
}