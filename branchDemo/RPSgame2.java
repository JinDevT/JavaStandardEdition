import java.util.Scanner;
public class RPSgame2{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("1.가위(R) , 2.바위(P) , 3.보(S) 중 하나를 고르시오");
		String a = scanner.next();
		System.out.println("1.가위(R) , 2.바위(P) , 3.보(S) 중 하나를 고르시오");
		String b = scanner.next();

		String result;

		if(a.equals("R") && b.equals("R") || a.equals("P") && b.equals("P")
			|| a.equals("S") && b.equals("S")){
			result = "비김";
		}else if(a.equals("R") && b.equals("P") || a.equals("P") && b.equals("S")
			|| a.equals("S") && b.equals("R")){
			result = "b가 이겼습니다.";
		}else {
			result = "a가 이겼습니다.";
		}
		System.out.println(result);
	}
}