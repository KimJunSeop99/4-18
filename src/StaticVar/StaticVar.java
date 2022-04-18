package StaticVar;

public class StaticVar {
	int x = 0; // 일반(default)변수
	static int y = 0; // 전역(static)변수
//	인스턴스 메소드
	public void increase() {
		x++;
		y++;
	}
}
