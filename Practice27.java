//��ǻ���а� 20190975 ��ȿ��
import java.util.Scanner;

public class Practice27 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int[] num = new int[5];
		
		for (int i = 0; i < num.length; i++) {
			System.out.print((i+1)+"��° ���ڸ� �Է��ϼ���: ");
			num[i] = input.nextInt();
		}
		
		System.out.println("�Էµ� ���ڴ� ������ �����ϴ�.");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]+" ");
		}
		
		System.out.println("\n���� ����Դϴ�.");
		for (int i = num.length-1; i >= 0; i--) {
			System.out.print(num[i]+" ");
		}
		
		int bigger = num[0];
		for (int i = 1; i < num.length; i++) {
			if (bigger < num[i]) {
				bigger = num[i];
			}
		}
		System.out.println("\n���� ū���� "+bigger+"�Դϴ�.");
		
		input.close();
		
	}

}
