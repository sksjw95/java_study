package loopexample;

public class Q2 {

	public static void main(String[] args) {
		int i;
		int k;
		for(i=2;i<=9;i++) {
			if(i%2 !=0) {
				continue;
			}
			for(k=1;k<=9;k++) {
				System.out.println(i+" x "+k+" = "+i*k);
			}
			System.out.println();
		}
		

	}

}
