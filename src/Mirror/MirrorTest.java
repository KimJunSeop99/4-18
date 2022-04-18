package Mirror;

public class MirrorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TaejungMirror tm = new TaejungMirror();
		DongSungMirror ds = new DongSungMirror();

		Genesis g = new Genesis(tm);
		Genesis g2 = new Genesis(ds);

//		다형성 클래스를 이용한 방법
		g.powerOff();
		g2.powerOff();
		System.out.println("--------------------");
		g.joystic();
		g2.joystic();
	}
}
	