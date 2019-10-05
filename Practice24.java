//컴퓨터학과  20190975 신효경
import java.util.Scanner;

public class Practice24 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요: ");
		String name = input.next();
		
		greeting(name);
		
		input.close();

	}
	
	public static void greeting (String name) {
		
		System.out.println(name+"씨, 좋은 아침입니다.");
		
	}

}
