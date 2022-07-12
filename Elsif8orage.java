package trainingday6CONDITIONS;

public class Elsif8orage {
	public static void main(String[] args) {
		int a = 42;
		if (a>0||a<=5) {
			System.out.println(a+"kid");
		}
		else if (a>=6||a<18) {
			System.out.println(a+"children");
		}
		else if (a>=19||a<=25) {
			System.out.println(a+"teeanage");
		}
		else if (a>=26||a<=40) {
			System.out.println(a+"adult");
		}
		else if (a>=41||a<=60) {
			System.out.println(a+"oldage");
		}
		else {
			System.out.println("all are false");
		}
	}


}
