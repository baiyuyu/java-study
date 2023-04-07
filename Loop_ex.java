import java.util.Scanner;
public class Loop_ex{
	public static void main(String[] args) {

		// double mon = 100000;
		// int i = 0;
		// double fee;
		// while (mon>0)
		// 	{	
		// 		if (mon>50000){
		// 			fee = mon*0.050000;}
		// 		else{
		// 			fee = 1000;
		// 		}
			


		// 		mon = mon - fee;
		// 		if (mon<0){
		// 			break;
		// 		}
		// 		i++;
				
		// }
		// System.out.println(i+"times");
		int n = 100;
		// int sum_in = 0;
		int sum = 0;
		for (int i=1;i<=n;i++){
			for (int j=1;j<=i;j++){
				sum += j;
			}
		// 	sum_in += i;
		// 	sum += sum_in;

		}
		System.out.println(sum);
	}
}