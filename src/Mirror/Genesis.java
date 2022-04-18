package Mirror;

public class Genesis {

//	Mirror 인스턴스 변수를 정의
	Mirror m;

	public Genesis() {
	}

//	다형성 메소드 : 생성자 : spring DI(의존성 주입)
	public Genesis(Mirror m) {
		this.m = m;
	}
	
	public void powerOff() {
		System.out.println("시동끄기");
		m.autoClose();
	}
	public void joystic() {
		System.out.println("조절 기능");
		m.control();
	}
}
