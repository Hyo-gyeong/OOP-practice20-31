//컴퓨터학과 20190975 신효경
import java.util.Scanner;

public class Practice26 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int num;
		
		do {
			System.out.print("정수를 입력하세요: ");
			num = input.nextInt();
			
			if (num <= 0) {
				System.out.println("잘못된 입력입니다. 다시 입력하세요.");
			}
		}while (num <= 0);
		
		printTimes(num);
		
		input.close();

	}
	
	public static void printTimes (int num) {
		
		System.out.println("구구단 "+ num + "단입니다.");
		
		for (int i = 1; i <= 9; i++) {
			System.out.println(num + " * "+ i + " = " + (num * i));
		}
	}

}
