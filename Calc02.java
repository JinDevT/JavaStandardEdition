import java.util.Scanner;
public class Calc02{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("첫번 째 값을 입력하시오");
		int num1 = scanner.nextInt();
		System.out.println("두번 째 값을 입력하시오");
		int num2 = scanner.nextInt();
		System.out.println("연산자를 입력하시오");
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