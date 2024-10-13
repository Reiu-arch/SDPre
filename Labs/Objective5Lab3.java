import java.util.Scanner;

public class Objective5Lab3 {
	public static void main (String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Please enter a number: ");
            int userNum = scanner.nextInt();

            if (userNum% 2 == 0)
            {
                System.out.println(userNum + " is Even.");
            }
            else{
                System.out.println(userNum + " is Odd.");
            }
            scanner.close();
        }
    }