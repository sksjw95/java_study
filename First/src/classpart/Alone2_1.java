package classpart;

public class Alone2_1 {

	public static void main(String[] args) {
		Alone2 shop =new Alone2();
		shop.ordernum=201803120001L;
		shop.cusId="abc123";
		shop.orderdate="2018년 3월 12일";
		shop.name="홍길순";
		shop.pronum="PD0345-12";
		shop.address="서울시 영등포구 여의도동 20번지";
		
		System.out.println("주문번호 : "+shop.ordernum);
		System.out.println("주문자 아이디 : "+shop.cusId);
		System.out.println("주문 날짜 : "+shop.orderdate);
		System.out.println("주문자 이름 : "+shop.name);
		System.out.println("주문 상품 번호 : "+shop.pronum);
		System.out.println("배송 주소 : "+shop.address);

	}

}
