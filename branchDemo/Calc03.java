import java.util.Scanner;
public class Calc03{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("ù�� ° ���ڸ� �Է��Ͻÿ�");
		int num1 = scanner.nextInt();
		System.out.println("�ι� ° ���ڸ� �Է��Ͻÿ�");
		int num2 = scanner.nextInt();
		System.out.println("�����ڸ� �Է��Ͻÿ�");
		String op = scanner.next();
		String result=" ";
		int num3=0;

		switch(op){
			case "+":
			num3 = num1 + num2;
			break;
			case "-":
			num3 = num1 - num2;
			break;
			case "*":
			 num3 = num1 * num2; 
			 break;
			case "/": 
			num3 = num1 / num2; 
			break;
			case "%": 
			num3 = num1 & num2; 
			break;
			default : 
			result = "�߸��Է�";
			break;


		}

		if(!result.equals("�߸��Է�")){
			result=num1+op+num2+"="+num3;
		}

		System.out.println(result);
	}
}