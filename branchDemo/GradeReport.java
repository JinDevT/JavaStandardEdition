import java.util.Scanner;
public class GradeReport{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("�̸� ?");
		String name = scanner.next();
		String result="�߸��Է� �ϼ̽��ϴ�.";

		System.out.println("���� ����? ");
		int kor = scanner.nextInt();
		if(kor>100 && kor<0){
			System.out.println(result);
			return;
		}
		System.out.println("���� ����? ");
		int eng = scanner.nextInt();
		if(eng>100 && eng<0){
			System.out.println(result);
			return;
		}
		System.out.println("���� ����? ");
		int math = scanner.nextInt();
		if(math>100 && math<0){
			System.out.println(result);
			return;
		}
		int sum = kor + eng + math;
		System.out.println("�հ� : "+sum);
		
		int avg = (sum)/3;
		String grade = "";

		if(avg>=90){
			grade="A";
		}else if(avg>=80 && avg<90){
			grade="B";
		}else if(avg>=70 && avg<80){
			grade="C";
		}else if(avg>=60 && avg<70){
			grade="D";
		}else if(avg>=50 && avg<60){
			grade="E";
		}else {
			grade="F";
		}

		

		System.out.println(name+"[���]" +avg+ "[����]" +grade);

	}
}