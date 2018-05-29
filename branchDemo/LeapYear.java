import java.util.Scanner;
public class LeapYear{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("연도를 입력하시오.");
		int year = scanner.nextInt();
		String result = " ";
		
		if(year%4==0 && year%100!=0 || year%400==0){
			result="윤년이다.";
		}else {
			result="평년이다.";
		}
		System.out.println(year+"년은" +result);
	}
}