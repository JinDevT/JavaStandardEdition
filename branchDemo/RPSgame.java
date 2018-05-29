import java.util.Scanner;
public class RPSgame{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("1.가위 2.바위 3.보 중 하나를 입력하시오");
		int playA = scanner.nextInt();
		System.out.println("1.가위 2.바위 3.보 중 하나를 입력하시오");
		int playB = scanner.nextInt();
		//Sytem.out.println("결과는 ? ");
		String result;

		if( playA == playB){
			result ="playA와 playB가 비겼습니다.";
		}else if(playA==1 && playB==2){
			result ="playA가 졌습니다.";
		}else if(playA==1 && playB==3){
			result ="playA가 이겼습니다.";
		}else if(playA==2 && playB==1){
			result = "palyA가 이습니다.";
		}else if(playA==2 && playB==3){
			result = "palyA가 졌습니다.";
		}else if(playA==3 && playB==1){
			result = "playA가 졌습니다.";
		}else{
			result = "playA가 이겼습니다.";
		}
		System.out.println(result);
	}
}
