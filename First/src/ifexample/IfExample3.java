package ifexample;

public class IfExample3 {

	public static void main(String[] args) {
		
		int score = 70;
		char grade;
		
		if(score <= 100 && score >= 90) {
			grade = 'A';
		}
		else if(score < 90 && score >= 80) {
			grade = 'B';
		}
		else if(score < 80&& score >=70) {
			grade = 'C';
		}
		else if(score < 70&& score>=60) {
			grade = 'D';
		}
		else {
			grade = 'F';
		}
		System.out.println("내 등급은"+ grade+"입니다.");
		
	}

}
