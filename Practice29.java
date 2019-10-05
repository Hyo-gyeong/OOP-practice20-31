//컴퓨터학과 20190975 신효경
import java.util.Scanner;

public class Practice29 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int[] nums = new int[10];
		for (int i = 0; i < 10; i++) {
			System.out.print((i+1)+"번째 숫자를 입력하세요: ");
			nums[i] = input.nextInt();
		}
		
		displayArray(nums);
		System.out.println("\n가장 큰 숫자는 "+findMax(nums)+"입니다.");
		
		input.close();

	}
	public static void displayArray(int[] iArray) {
		System.out.println("입력된 숫자는 다음과 같습니다.");
		
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
