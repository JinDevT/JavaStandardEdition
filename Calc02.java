import java.util.Scanner;
public class Calc02{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("ù�� ° ���� �Է��Ͻÿ�");
		int num1 = scanner.nextInt();
		System.out.println("�ι� ° ���� �Է��Ͻÿ�");
		int num2 = scanner.nextInt();
		System.out.println("�����ڸ� �Է��Ͻÿ�");
		int opcode = scanner.nextInt();

		int num3=0;
		String op=null;
		


		if(opcode==1){
			num3 = num1 + num2;
			 op ="+";
		}else if(opcode==2){
			num3 = num1 - num2;
			 op ="-";
		}else if(opcode==3){
			num3 = num1 * num2;
			 op ="*";
		}else if(opcode==4){
			num3 = num1 / num2;
			 op ="/";
		}else{
			num3 = num1 % num2;
			 op ="%";
		}
		
		System.out.println(num1+op+num2+"="+num3);
	}
}