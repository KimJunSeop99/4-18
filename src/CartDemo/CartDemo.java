package CartDemo;

public class CartDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		생성자를 이용해서 정보 저장하고 출력하기
//		Cart 클래스를 만들고, 멤버 : Owner = "홍길동"
//		p1 Product 클래스를 만들고, prcice = 0 , discountRate = 0.0
//		no = "a-111", 
//		name = "iphone" , 
//		price 800000, discountRate = 0.001 
		
		
//		p2 Product 클래스를 만들고, prcice = 0 , discountRate = 0.0
//		no = "b-222", 
//		name = "ipad" , 
//		price 1000000, discountRate = 0.002
		
//		p1.info() : 메소드 출력
//		Cart 클래스의 mycart 객체 정보 출력 getter를 이용해서 출력
		
		Cart mycart = new Cart();
		Product p1 = new Product("a-111" , "iphone" , 800000 , 0.001);
		Product p2 = new Product("b-222" , "ipad" , 1000000 , 0.002);
		mycart.setOwner("홍길동");
		System.out.println(mycart.getOwner());
		p1.info();
		p2.info();
	}

}
