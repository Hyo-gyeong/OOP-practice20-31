//컴퓨터학과 20190975 신효경
import java.util.Scanner;

public class Practice28 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int[] num = new int[5];
		
		for (int i = 0; i < num.length; i++) {
			System.out.print((i+1)+"번째 숫자를 입력하세요(0~9): ");
			num[i] = input.nextInt();
		}
		
		System.out.println("입력된 숫자는 다음과 같습니다.");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]+" ");
		}
		
		System.out.println("\n역순 출력입니다.");
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
		
		System.out.println("\n숫자별로 입력된 횟수는 다음과 같습니다.");
		for (int i = 0; i < 10; i++) {
			System.out.println("숫자" + i + ": " + count[i] +"번");
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
		System.out.println("\n가장 큰 수는 "+biggest+"이고 배열 내에 "+count[index]+"번 나타납니다.");
		
		input.close();

	}
}
