import java.util.Scanner;
public class LeapYear{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ �Է��Ͻÿ�.");
		int year = scanner.nextInt();
		String result = " ";
		
		if(year%4==0 && year%100!=0 || year%400==0){
			result="�����̴�.";
		}else {
			result="����̴�.";
		}
		System.out.println(year+"����" +result);
	}
}