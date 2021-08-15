package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		int input = 14;
		boolean flag = false;
		int output = input/2;
		System.out.println(output);
		for (int i = 2; i <= output; i++) {
			if (input%2!=0) {
				System.out.println(input+ " is a prime number");
				flag = true;
				break;
			}
		}
             if(flag == false) {
            	 System.out.println(input+" is not a prime number");
             }
	}

}
