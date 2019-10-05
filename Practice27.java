//컴퓨터학과 20190975 신효경
import java.util.Scanner;

public class Practice27 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int[] num = new int[5];
		
		for (int i = 0; i < num.length; i++) {
			System.out.print((i+1)+"번째 숫자를 입력하세요: ");
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
		
		int bigger = num[0];
		for (int i = 1; i < num.length; i++) {
			if (bigger < num[i]) {
				bigger = num[i];
			}
		}
		System.out.println("\n가장 큰수는 "+bigger+"입니다.");
		
		input.close();
		
	}

}
