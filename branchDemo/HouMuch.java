import java.util.Scanner;
public class HouMuch{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("�󸶿���?");
		int price = scanner.nextInt();
		System.out.println(price+"�� �Դϴ�.");
		System.out.println("� �帱���?");
		int num = scanner.nextInt();
		System.out.println(num+"�� �ּ���.");
		int sum = price * num;
		System.out.println("�� �ݾ���" +sum+"�� �Դϴ�.");
		System.out.println("��ο� ����ּ���.");
		System.out.println("�� �ۼ�Ʈ DC�Ҳ���?");
		int sale = scanner.nextInt();

		String result="���Ⱦƿ�";
		
		if(sale<10){
		result = "���ε� �ݾ���"+sum*(100-sale)/100 + "�� �Դϴ�.";
	}
		System.out.println(result);
	}
}