import java.util.Scanner;
public class Test{
	public static void main(String[] args){
		System.out.print("내 이름은: ");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		System.out.print("안녕 난 "+name);	
	}
}