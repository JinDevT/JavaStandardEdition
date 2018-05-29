import java.util.Scanner;
public class Test3{
	public static void main(String[] args){
		int num;
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		System.out.println("개수"+num);

		if(num>0){
			System.out.println("정수 입니다");
		}
			else {
				System.out.println("0보다 작습니다");
			}
		}

	}
