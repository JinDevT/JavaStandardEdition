import java.util.Scanner;
public class MonthEndday{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("월을 입력하시오.");
		int month = scanner.nextInt();
		String Nmonth = "잘못입력하셨습니다.";
		String day= " ";
		switch(month){
			case 1: case 3: case 5:  case 7: case 8: case 10: case 12:
			day="31";
			break;
			case 4: case 6: case 9: case 11:
			day="30";
			break;
			case 2:
			day="28";
			default:
			 	System.out.println(Nmonth);
			return;
		}

		System.out.println(month+"월은"+day+"일 까지 있습니다.");
	}
}