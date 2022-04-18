package Rectangle;

public class RectangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. 객체 생성 : 초기값없이 생성
//		2. 기능 사용 : 면적계산 메소드호출 , 둘레 계산 메소드 호출
//		3. 객체 생성 : 매개변수 (30, 50)
//		2. 기능 사용 : 면적계산 메소드 호출, 둘레 계산 메소드 호출

		Rectangle rectangle = new Rectangle();

		rectangle.area();
		rectangle.round();

		Rectangle rectangle2 = new Rectangle(30, 50);

		rectangle2.area();
		rectangle2.round();
	}
}
