//��ǻ���а� 20190975 ��ȿ��
import java.util.Scanner;

public class Practice25 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���: ");
		int num = input.nextInt();
		
		printTimes(num);
		
		input.close();

	}
	
	public static void printTimes (int num) {
		
		System.out.println("������ "+ num + "���Դϴ�.");
		
		for (int i = 1; i <= 9; i++) {
			System.out.println(num + " * "+ i + " = " + (num * i));
		}
	}

}
