package Car;

public class Car {
//	인스턴스변수 : 이름 , 메이커 , 가격
	private String name;
	private String maker;
	private String price;
	
//	생성자 2개 : 기본생성자 , 매개변수 3개 생성자

	public Car() {
		
	}
	
	public Car(String name, String maker, String price) {
		this.name = name;
		this.maker = maker;
		this.price = price;
	}
//	메소드 : 인스턴스변수의 값을 출력할 메소드
	public void A() {
		this.name = "싼타페";
		this.maker = "현대";
		this.price = "35,000,000";
		System.out.println(name + " " + maker + " " + price);
	}
	public void B() {
		System.out.println(this.name);
		System.out.println(this.maker);
		System.out.println(this.price);
	}
}
