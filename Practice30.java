//��ǻ���а� 20190975 ��ȿ��
import java.util.Random;
public class Practice30 {

	public static void main(String[] args) {
		
		Random rg = new Random();
		
		int[] randNums = new int[20];
		for(int i = 0; i < 20; i++) {
			randNums[i] = rg.nextInt(100);
		}
		
		displayArray(randNums);
		System.out.println("���� ū ���ڴ� "+findMax(randNums)+"�Դϴ�.");
	}
	public static void displayArray(int[] iArray) {
		
		for (int i = 0; i < iArray.length; i++) {
			System.out.print(" "+iArray[i]+" ");
			if ((i+1) % 10 == 0) {
				System.out.println();
			}
		}
	}
	public static int findMax(int[] iArray) {
		
		int best = iArray[0];
		for (int i = 0; i < iArray.length; i++) {
			if (best < iArray[i]) {
				best = iArray[i];
			}
		}
		return best;
	}

}
