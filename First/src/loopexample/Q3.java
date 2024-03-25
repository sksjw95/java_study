package loopexample;

public class Q3 {

	public static void main(String[] args) {
		int i;
		int k;
		for(i=2;i<=9;i++) {
			for(k=1;k<=9;k++) {
				if(i<k) {
					break;
				}
				System.out.println(i+" x "+k+"="+(i*k));
			}
			System.out.println();
		}

	}

}
