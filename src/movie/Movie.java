package movie;

public class Movie {

	// 필드

	String movieName; //영화제목 
	int price;//금액
	int age;//나이
	int money;//실구매금액
	double rate;//할인율
	String way;//구매방법
	
	//생성자
	public Movie(String movieName, int price, int age, String way ) {
	//매개변수로 값을 받아서 멤버변수에 넣기
	this.movieName = movieName;
	this.price = price;
	this.age = age;
	this.way = way;

	}
	
	//메소드 
	//1. 할인율 ->
	void rateCal() {
		
		if (age<20) {
			rate= 0.25;}
		
		else if (age<=30) {
			rate= 0.20;} 
		
		else {
			rate= 0.15;}
		// if ,else if, else 문을 사용하여 나이에 따른 할인율 계산
		
		switch (way) {
		case "현장" :
			rate+=0.00;
			break;
			
		case "인터넷" :
			rate +=0.05;
			break;
			
		case "쿠폰" :
			rate+=0.10;
			break;
		//switch문으로 구매방법에 따른 할인율 계산 
		}
	}
		//2. 실구매금액 ->
		
		void moneyCal() {
			money=(int)(price-(price*rate));
	   //실구매금액 = 금액-할인금액 int를 사용하여 double rate를 int로 타입변환 
		}
			
			
		//3. 제목인쇄하기 ->
			void titlePrint() {
				System.out.println("영화명\t\t금액\t\t나이\t\t실구매금액");
			}
			//titlePrint 메서드에 제목인쇄 
		
		//4. 내용 출력하기 ->
			void dataPrint(){
				System.out.println(movieName+"\t\t"+price+"\t\t"+age+"\t\t"+money);
		   //dataPrint 내용 출력 
		
		
		
	}

			

	
}
