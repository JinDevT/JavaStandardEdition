import java.util.Scanner;
public class WhileDemo02{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("첫번 째 수를 입력하시오.");
		int num1 = scanner.nextInt();
		System.out.println("두번 째 수를 입력하시오.");
		int num2 = scanner.nextInt();

		int start =0, end = 0;
		// int sum=0;
		// String result = " ";

		if(num1 > num2){
			start = num2;
			end = num1;
		}else{
			start = num1;
			end = num2;
		}

		int sum=0;
		String result = " ";
		while(start <= end){
			
			if(start==end){
				result += start + "=";
			}else{
				result += start + "+";
			}
			sum+=start;
			start++;

		}
			System.out.print(result+sum);
	}
}