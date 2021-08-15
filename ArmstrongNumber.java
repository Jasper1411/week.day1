package week1.day1;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int input = 153;
		int original;
		int calculated=0 , remainder;
		original=input;
		while(original>0) {
			remainder = original % 10;
			System.out.println("The remainder is" + remainder);
			calculated = calculated+(remainder*remainder*remainder);
			original = original / 10;
			System.out.println("The Quotient is "+original);
		}
          System.out.println(original);
          System.out.println(calculated);
          if(calculated == input) {
        	  System.out.println("This is an Armstrong number");
          }
          else {
        	  System.out.println("This is not an Armstrong number");
          }
	}

}
