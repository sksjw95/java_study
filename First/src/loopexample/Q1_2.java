package loopexample;

public class Q1_2 {

	public static void main(String[] args) {
		int num1 =10;
		int num2 =2;
		char operator = 'ㅁ';
		switch(operator) {
		case '+':System.out.println(num1+num2);
		break;
		case '-':System.out.println(num1-num2);
		break;
		case '*':System.out.println(num1*num2);
		break;
		case '/':System.out.println(num1/num2);
		break;
		default:System.out.println("잘못된 기호입니다.");
		}
		
	}

}
