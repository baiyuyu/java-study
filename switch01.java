import java.util.Scanner;
public class switch01 {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("please input a letter");
		char c1 = myScanner.next().charAt(0);
		switch (c1){
		case 'a':		
			System.out.println("Monday");
			// break;
		case 'b':		
			System.out.println("Tuesday");
			// break;
		case 'c':		
			System.out.println("Wednesday");
			// break;
		default:
			System.out.println("Hahaha");
			break;

		}
		
		System.out.println("finish");





	}

}