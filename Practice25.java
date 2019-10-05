//컴퓨터학과 20190975 신효경
import java.util.Scanner;

public class Practice25 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요: ");
		int num = input.nextInt();
		
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
