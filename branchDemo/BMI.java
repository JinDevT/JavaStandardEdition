import java.util.Scanner;
public class BMI{
	public static void main(String[]args ){
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ �Է�: ");
		double weight = scanner.nextInt();
		System.out.println("Ű �Է�: ");
		double height = scanner.nextInt();
		height/=100;
		double bmi =(weight/(height*height));
		String result=" ";
		if(bmi<18.5){
			result ="��ü��";
		}else if(bmi>18.5 && bmi<23){
			result = "����";
		}else if(bmi>23 && bmi<25){
			result ="�� ���ܰ�";
		}else if(bmi>25 && bmi<30){
			result="1�ܰ� ��";
		}else if(bmi>30 && bmi<35){
			result="2�ܰ� ��";
		}else{
			result="3�ܰ� ��";
		}
		System.out.println("BMI : "+bmi+"�ܰ�: "+result+"�Դϴ�");
	}
}