import java.util.Scanner;
public class RPSgame2{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("1.����(R) , 2.����(P) , 3.��(S) �� �ϳ��� ���ÿ�");
		String a = scanner.next();
		System.out.println("1.����(R) , 2.����(P) , 3.��(S) �� �ϳ��� ���ÿ�");
		String b = scanner.next();

		String result;

		if(a.equals("R") && b.equals("R") || a.equals("P") && b.equals("P")
			|| a.equals("S") && b.equals("S")){
			result = "���";
		}else if(a.equals("R") && b.equals("P") || a.equals("P") && b.equals("S")
			|| a.equals("S") && b.equals("R")){
			result = "b�� �̰���ϴ�.";
		}else {
			result = "a�� �̰���ϴ�.";
		}
		System.out.println(result);
	}
}