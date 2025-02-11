public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int sum(int num, int num2) {
		int theSum = num + num2;
		return theSum; 
	}

	public static int difference(int num, int num2) {
		int theDifference = num - num2;
		return theDifference; 
	}

	public static double product(double num, double num2) {
		double theProduct = num * num2;
		return theProduct; 
	}

	public static String removeFirst(String word) {
		String removeFirst = word.substring(1);
		return removeFirst; 
	}

	public static int combinedLength(String word, String word2) {
		int combinedLength = word.length() + word2.length();
		return combinedLength; 
	}

	public static boolean isEven(int num) {
		boolean trueFalse = num%2 == 0;
		return trueFalse; 
	}

	public static boolean isOdd(int num ) {
		boolean trueFalse = num%2 != 0;
		return trueFalse; 
	}

	public static boolean isPositive(int num ) {
		boolean trueFalse = num > 0;
		return trueFalse; 
	}

	public static boolean isNegative(int num ) {
		boolean trueFalse = num < 0;
		return trueFalse; 
	}

	//Hello Num num NUM

}

