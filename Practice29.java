//��ǻ���а� 20190975 ��ȿ��
import java.util.Scanner;

public class Practice29 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int[] nums = new int[10];
		for (int i = 0; i < 10; i++) {
			System.out.print((i+1)+"��° ���ڸ� �Է��ϼ���: ");
			nums[i] = input.nextInt();
		}
		
		displayArray(nums);
		System.out.println("\n���� ū ���ڴ� "+findMax(nums)+"�Դϴ�.");
		
		input.close();

	}
	public static void displayArray(int[] iArray) {
		System.out.println("�Էµ� ���ڴ� ������ �����ϴ�.");
		
		for (int i = 0; i < iArray.length; i++) {
			System.out.print(iArray[i]+" ");
		}
	}
	public static int findMax(int[] iArray) {
		
		int best = iArray[0]; 
		for (int i = 1; i < iArray.length; i++) {
			if (best < iArray[i]) {
				best = iArray[i];
			}
		}
		return best;
	}

}
