import java.util.Scanner;
public class CheckGender{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("�̸��� �Է��Ͻÿ� ");
		String name = scanner.next();
		System.out.println("�ֹι�ȣ�� �Է��Ͻÿ� ");
		String num = scanner.next();
		char ch=num.charAt(7);
		if(ch=='0'||ch=='7'||ch=='8'||ch=='9'){
			System.out.println("�ٽ� �Է��ϼ���");
			return ;
		}
		String gender = " ";

		switch(ch){
		case '1':
		case '3':
			gender = "����";
			break;
			
		case '2':
		case '4':
			gender = "����";
			break;
			
		case '5':
		case '6':
			gender = "�ܱ���";
			break;
						
		default:
			break;
		}

		System.out.println(name+" : "+num+" : "+gender);
	}
}