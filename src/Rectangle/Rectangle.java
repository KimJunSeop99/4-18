package Rectangle;

public class Rectangle {
//	인스턴스변수 : 너비 , 높이
//	인스턴스 메소드 : 면적 계산하기 , 테두리길이 계산 ( 네 변의 길이를 합 )
	int width;
	int height;

//	자동 indent 조정 단축키 : CTRL + SHiFT + F
	public Rectangle() {
		width = 0;
		height = 0;
	}

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
//	면적 계산 메소드
	public void area() {
		int value = width * height;
		System.out.println("면적 : " + value);
	}
//	둘레 계산 메소드
	public void round() {
		int value = (width + height) * 2;
		System.out.println("둘레 : " + value);
	}
}
