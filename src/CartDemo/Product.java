package CartDemo;

public class Product {
//	p1 Product 클래스를 만들고, prcice = 0 , discountRate = 0.0
//	no = "a-111", 
//	name = "iphone" , 
//	price 800000, discountRate = 0.001 
	String no;
	String name;
	int price;
	double discountRate;

	public Product(String no, String name, int price, double discountRate) {
		this.no = no;
		this.name = name;
		this.price = price;
		this.discountRate = discountRate;
	}
	
//	인스턴스변수 출력용 함수 / 메소드
	public void info() {
		System.out.println("no : " + this.no + "name : " + this.name + "price : " 
				+ this.price + " discountRate : "
				+ this.discountRate);
	}
}
