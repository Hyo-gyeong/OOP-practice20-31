//��ǻ���а� 20190975 ��ȿ��
import java.util.Scanner;

public class Practice26 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int num;
		
		do {
			System.out.print("������ �Է��ϼ���: ");
			num = input.nextInt();
			
			if (num <= 0) {
				System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է��ϼ���.");
			}
		}while (num <= 0);
		
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
