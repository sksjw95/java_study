package hiding;

//import javax.xml.crypto.Data;

public class MyDate {
	
	private int day;
	private int month;
	private int year;
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public MyDate(int day,int month,int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public boolean isValid() {
		if( month == 1||month ==3||month ==5||month ==7||month ==8||month ==10||month ==12) {
			if(day == 31) {
				
				System.out.println("유효한 날짜입니다.");
				//return true;
				
			}
			else {
				System.out.println("유효하지 않은 날짜입니다.");
				//return false;
			}
			
		}
		else if( month == 4||month ==6||month ==9||month ==11) {
			if(day == 30) {
				System.out.println("유효한 날짜입니다.");
				//return true;
			}
			else {
				System.out.println("유효하지 않은 날짜입니다.");
				//return false;
			}
		}
		else if(month ==2) {
			if(day==28) {
				System.out.println("유효한 날짜입니다.");
				//return true;
			}
			else {
				System.out.println("유효하지 않은 날짜입니다.");
				//return false;
			}
		}
		/*if("유효한 날짜입니다.") {
			return true;
		}
		else {
			System.out.println("유효하지 않은 날짜입니다.");
		}*/
		return true;
	}
}
