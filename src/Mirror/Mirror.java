package Mirror;

// 모든 메소드가 추상메소드 형태 ( 메소드 이름(형태)만 있음 )
// 멤버변수 X , 상수 O
public interface Mirror {
	
//	상수
//	public static final int MAX_AGE = 5;
	int MAX_AGE = 5;
	
	void autoClose(); // 사이드미러 자동 접힘
	void control(); // 거울 각도 조절
}
