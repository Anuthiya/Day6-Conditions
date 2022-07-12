package trainingday6CONDITIONS;

public class Elsif3div {
	public static void main(String[] args) {
		int a = 55;
		if (a%2==0) {
			System.out.println(a+"is divisible by 2");
		}
		else if (a%3==0) {
			System.out.println(a+"is divisible by 3");
		}
		else if (a%5==0) {
			System.out.println(a+"is divisible by 5");
		}
		else {
			System.out.println("all are false");
		}
	}


}
