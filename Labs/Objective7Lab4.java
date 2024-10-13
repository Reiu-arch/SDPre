public class Objective7Lab4 {
	public static void main(String[] args) {
            int counter = 0;
            int count = 0;

            while (counter < 20) {
                counter = counter + 1;
                count = counter + count;
            }
            System.out.println(count);
        }
    }