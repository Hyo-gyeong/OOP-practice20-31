//컴퓨터학과 21090975 신효경
import java.util.Random;
public class Practice31 {

	public static void main(String[] args) {
		
		int[] data = getData(20);
		
		displayArray(data);
		
		System.out.println("가장 큰 숫자는 "+findMax(data)+"입니다.");
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
	
	public static int[] getData(int num) {
		
		Random r = new Random();
		int[] rslt = new int[num];
		
		for(int i = 0; i < 20; i++) {
			rslt[i] = r.nextInt(100);
		}
		return rslt;
	}

}
