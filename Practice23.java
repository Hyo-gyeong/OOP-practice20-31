//��ǻ���а� 20190975 ��ȿ��
import java.util.Scanner;

public class Practice23 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���: ");
		int num = input.nextInt();
		System.out.println("�Էµ� ���� "+ num +"�� ���밪�� "+ abs(num)+"�Դϴ�.");

		input.close();
	}

	public static int abs(int num) {
		
		if (num >= 0) {
			return num;
		}
		else {
			return -num;
		}
	}
}
