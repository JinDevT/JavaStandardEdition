import java.util.Scanner;
public class GradeReport02{
	public static void main(Stringp[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("�̸� ?");
		String name = scanner.next();
		System.out.println("���� ����? ");
		int kor = scanner.nextInt();
		System.out.println("���� ����? ");
		int eng = scanner.nextInt();
		System.out.println("���� ����? ");
		int math = scanner.nextInt();
		int sum = kor + eng + math;
		System.out.println("�հ� : "+sum);
		
		int avg = (sum)/3;
		String grade = "";

		switch(avg)
		case "10": 
		case "9":
			grade:"A";
			break;
		case "8":
			grade:"B";
			break;
		case "7":
			grade:"C";
			break;
		case "6":
			grade:"D";
			break;
		case "5":
			grade:"F";
			break;
		default:
			grade:"E";
			break;



		System.out.println(name+"[���]" +avg+ "[����]" +grade);
	}
}