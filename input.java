import java.util.Scanner;
public class input {
	public static void main(String[] args){
		Scanner myscaner = new Scanner(System.in);
		System.out.println("name");
		String name = myscaner.next();
		System.out.println("age");
		int age = myscaner.nextInt();
		System.out.println("姓名"+name+"age"+age);
			
		}
	}