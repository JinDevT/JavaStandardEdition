import java.util.Scanner;
public class Calc04{
	public static void main(String[] args){
		Scanner scanner= new Scanner(System.in);
		System.out.println("첫번 째 숫자를 입력하시오.");
		int num1 = scanner.nextInt();
		System.out.println("두번 째 숫자를 입력하시오.");
		int num2 = scanner.nextInt();
		System.out.println("연산자를 입력하시오.");
		String op = scanner.next();

		int num3 = 0;

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

		}
		System.out.println(num1+op+num2"="num3);
	}
}