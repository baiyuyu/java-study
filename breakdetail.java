import java.util.Scanner;
public class breakdetail{
	public static void main(String[] args) {

		int mon = 10;
		label1:
		for (;mon<15;mon++)
			{
				int j = 10;
				label2:
				while (j<mon)
				{
					if (j<100){
					break label2;
				}

				}
				System.out.println("hello");
		}
		
	}
}