import java.util.Scanner;
public class RPSgame{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("1.���� 2.���� 3.�� �� �ϳ��� �Է��Ͻÿ�");
		int playA = scanner.nextInt();
		System.out.println("1.���� 2.���� 3.�� �� �ϳ��� �Է��Ͻÿ�");
		int playB = scanner.nextInt();
		//Sytem.out.println("����� ? ");
		String result;

		if( playA == playB){
			result ="playA�� playB�� �����ϴ�.";
		}else if(playA==1 && playB==2){
			result ="playA�� �����ϴ�.";
		}else if(playA==1 && playB==3){
			result ="playA�� �̰���ϴ�.";
		}else if(playA==2 && playB==1){
			result = "palyA�� �̽��ϴ�.";
		}else if(playA==2 && playB==3){
			result = "palyA�� �����ϴ�.";
		}else if(playA==3 && playB==1){
			result = "playA�� �����ϴ�.";
		}else{
			result = "playA�� �̰���ϴ�.";
		}
		System.out.println(result);
	}
}
