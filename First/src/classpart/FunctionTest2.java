package classpart;

public class FunctionTest2 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		int sum =add(num1,num2);
		System.out.println(num1+" + "+num2+" = "+sum+"입니다.");
		int sum2 =sub(num1,num2);
		System.out.println(num2+" - "+num1+" = "+sum2+"입니다.");
		int sum3 =mul(num1,num2);
		System.out.println(num1+" x "+num2+" = "+sum3+"입니다.");
		int sum4 =div(num1,num2);
		System.out.println(num2+" / "+num1+" = "+sum4+"입니다.");
	}
	public static int add(int n1,int n2) {
		int sum = n1+n2;
		return sum;
	}
	public static int sub(int n1,int n2) {
		int sum = n2-n1;
		return sum;
	}
	public static int mul(int n1,int n2) {
		int sum = n1*n2;
		return sum;
	}
	public static int div(int n1,int n2) {
		int sum = n2/n1;
		return sum;
	}

}
