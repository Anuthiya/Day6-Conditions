package trainingday6CONDITIONS;

public class Elsif10div {
	public static void main(String[] args) {
		int a = 20;
		int b = 30;

		if (a%2==0&&b%3==0) {
			System.out.println("divisible by 2 and 3");
		}
		else if (a%3==0&&b%10==0) {
			System.out.println(a+"is divisible by 5 and 10");
		}
		else if (a%7==0&&b%8==0) {
			System.out.println(a+"is divisible by 7 and 8");
		}
		else {
			System.out.println("all are false");
		}
	}
	}



