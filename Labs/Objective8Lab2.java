public class Objective8Lab2 {
	public static void main(String[] args) {
		int counter = 0;
		int count = 0;

		for (counter = 1; counter <= 20; counter+=1){
			count = counter + count;
		}
		System.out.println(count);
	}
	
}