import java.util.Scanner;
public class CheckGender{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름을 입력하시오 ");
		String name = scanner.next();
		System.out.println("주민번호를 입력하시오 ");
		String num = scanner.next();
		char ch=num.charAt(7);
		if(ch=='0'||ch=='7'||ch=='8'||ch=='9'){
			System.out.println("다시 입력하세요");
			return ;
		}
		String gender = " ";

		switch(ch){
		case '1':
		case '3':
			gender = "남자";
			break;
			
		case '2':
		case '4':
			gender = "여자";
			break;
			
		case '5':
		case '6':
			gender = "외국인";
			break;
						
		default:
			break;
		}

		System.out.println(name+" : "+num+" : "+gender);
	}
}