//컴퓨터학과 21090975 신효경
import java.util.Scanner;

public class Practice22 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요: ");
		int num1 = input.nextInt();
		System.out.print("정수를 입력하세요: ");
		int num2 = input.nextInt();
		
		System.out.println(num1 + " + " + num2 + " = " + sum(num1, num2));
		System.out.println(num2 + " + " + num1 + " = " + sum(num1, num2));

		input.close();
	}
	
	public static int sum(int n1, int n2) {
		
		int rslt = n1 + n2;
		
		return rslt;
	}
	
}
