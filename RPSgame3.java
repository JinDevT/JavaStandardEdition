import java.util.Scanner;
public class RPSgame3{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("1.����(R) 2.����(S) 3.��(P) �� �ϳ��� ���ÿ�.");
		String a = scanner.next();
		System.out.println("1.����(R) 2.����(S) 3.��(P) �� �ϳ��� ���ÿ�.");
		String b = scanner.next();

		String result = "b�� �̰���ϴ�.";

		if(a.equals(b)){
			result="a�� b�� �����ϴ�.";
		}else if(a.equals(R) && b.equals(P) ||
				 a.equals(S) && b.equals(R) ||
				 a.equals(P) && b.equals(S)){
			result="a�� �̰���ϴ�.";
		}
			System.out.println(result);
		
	}
}