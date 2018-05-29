import java.util.Scanner;
public class Test1{
	public static void main(String[]args ){
		System.out.print("이름? ");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		System.out.print("안녕 나는 "+name);
	}

}