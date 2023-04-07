import java.util.Scanner;
public class Switch_ex{
	public static void main(String[] args) {
		// Scanner myScanner = new Scanner(System.in);
		// System.out.println("input a letter");
		// char a = myScanner.next().charAt(0);
		// String x;
		// int b;
		// if (a<'e'){
		// 	b = 1;
		// } else{
		// 	b = 0;
		// }
		
		// System.out.println(b);
		// switch (b){
		// case 1:
		// 	x = a+"";
		// 	System.out.println(x.toUpperCase());
		// 	break;
		// default:
		// 	System.out.println("no");
		// 	break;
		// }
		// System.out.println("finish");


// 联系方式2
		// System.out.println("input a grade"); 
	// 	double a = 30;		
	// 	switch ((int)(a/60)){
	// 	case 1:
	// 		System.out.println("pass");
	// 		break;
	// 	case 0:
	// 		System.out.println("not pass");
	// 		break;
	// 	}
	// 	System.out.println("finish");

		Scanner myScanner = new Scanner(System.in);
		System.out.println("input a month");
		int mon = myScanner.nextInt();
		
		switch (mon){
			// 相当于穿透
		case 3:
		case 4:
		case 5:
			System.out.println("春季");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("夏季");
			break;
		default:
			System.out.println("no");
			break;
		}
		System.out.println("finish");
	}
}