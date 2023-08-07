package movie;

public class MovieMain {

	public static void main(String[] args) {
		Movie m1 =new Movie("1917",11000,10,"인터넷");
		Movie m2 =new Movie("주디",15000,25,"현장");
		Movie m3 =new Movie("인비저블맨",12500,40,"쿠폰");
		//new 연산자를 사용 Movie 클래스를 객체화 하고 Movie 생성자의 값을 입렵한다.
		
		m1.titlePrint();
		//제목출력
		
		m1.rateCal();
		m2.rateCal();
		m3.rateCal();
		//할인율 가져와서 출력
		
		m1.moneyCal();
		m2.moneyCal();
		m3.moneyCal();
		//실구매금액 가져와서 출력
		
		m1.dataPrint();
		m2.dataPrint();
		m3.dataPrint();
		//dataPrint 형식으로 내용 출력 
	
	
	}
	
	

}
