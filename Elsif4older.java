package trainingday6CONDITIONS;

public class Elsif4older {
	public static void main(String[] args) {
		int age1 = 35;
		int age2 = 25;
		int age3 = 45;
		if (age1>age2&&age1>age3) {
			System.out.println(age1+"older");
		}
		else if (age2>age1&&age2>age3) {
			System.out.println(age2+"older");
		}
		else if (age3>age1&&age3>age2) {
			System.out.println(age3+"older");
		}
		else {
			System.out.println("all are false");
		}
	}


}
