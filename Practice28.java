//��ǻ���а� 20190975 ��ȿ��
import java.util.Scanner;

public class Practice28 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int[] num = new int[5];
		
		for (int i = 0; i < num.length; i++) {
			System.out.print((i+1)+"��° ���ڸ� �Է��ϼ���(0~9): ");
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
		
		//int[] count = {0,0,0,0,0,0,0,0,0,0};
		
		int[] count = new int[10];
		for (int i = 0; i < 10; i++) {
			count[i] = 0;
		}
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < 10; j++) {
				if (num[i] == j) {
					count[j]++;
				}
			}
		}
		
		System.out.println("\n���ں��� �Էµ� Ƚ���� ������ �����ϴ�.");
		for (int i = 0; i < 10; i++) {
			System.out.println("����" + i + ": " + count[i] +"��");
		}
		
		int biggest = num[0];
		for (int i = 1; i < num.length - 1; i++) {
			if (biggest < num[i+1]) {
				biggest = num[i+1];
			}
		}
		
		int index = 0;
		for (int i = 0; i < 10; i++) {
			if (i == biggest) {
				index = i;
			}
		}
		System.out.println("\n���� ū ���� "+biggest+"�̰� �迭 ���� "+count[index]+"�� ��Ÿ���ϴ�.");
		
		input.close();

	}
}
