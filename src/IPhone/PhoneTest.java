package IPhone;

public class PhoneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IPhone iphone = new IPhone();
		Galaxy galaxy = new Galaxy();
		
//		iphone.call(); // 기본기능 : 전화걸기
//		iphone.sms(); // 기본기능 : 문자
//		iphone.facetime(); // 특수기능 
//		iphone.itunes(); // 특수기능 
//
//		galaxy.call(); // 기본기능 : 전화걸기
//		galaxy.sms(); // 기본기능 : 문자
//		galaxy.dmb(); // 특수기능
//		galaxy.navi(); // 특수기능
		
//		다형성 메소드 : 매개변수로 부모클래스가 있는 메소드
		testAllPhone(iphone);
		testAllPhone(galaxy);
	}
	
	public static void testAllPhone(Phone p) {
//		공통 기능
		p.call();
		p.sms();
		if( p instanceof IPhone) {
			IPhone iph = (IPhone)p;
			iph.facetime(); // 특수기능 
			iph.itunes(); // 특수기능
			System.out.println("---------------------------");
		} else if (p instanceof Galaxy) {
			Galaxy gal = (Galaxy)p;
			gal.dmb(); // 특수기능
			gal.navi(); // 특수기능
			System.out.println("---------------------------");
		}
	}

}
