//��ǻ���а�  20190975 ��ȿ��
import java.util.Scanner;

public class Practice24 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("�̸��� �Է��ϼ���: ");
		String name = input.next();
		
		greeting(name);
		
		input.close();

	}
	
	public static void greeting (String name) {
		
		System.out.println(name+"��, ���� ��ħ�Դϴ�.");
		
	}

}
