package hiding;

public class MyDateTest {

	public static void main(String[] args) {
		MyDate date1 = new MyDate(30, 2, 2000);
		date1.isValid();
		MyDate date2 = new MyDate(31,10 ,2006);
		date2.isValid();
	}

}
