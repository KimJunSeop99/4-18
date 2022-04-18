package Student;

public class Student {

	// 학생이름 , 학년 , 학생이 가지고 있는 돈
	private String studentName;
	private int grade;
	private int money;

	// 생성자 : 이름과 돈을 초기화 (매개변수 2개)
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}

	// 메소드 : 버스타기 : takeBus(Bus bus)
	public void takeBus(Bus bus) {
		bus.take(1000); // 버스 요금 1000원 소비
//		학생 돈 감소
		this.money -= 1000;
	}

	public void takeSubway(Subway subway) {
		subway.take(1500); // 지하철 요금 1500원 소비
//		학생돈 감소

	}

	public void showInfo() {
//		잔액을 출력해주세요. : 학생이름 + "님의 남은 돈은" + 학생돈 + "입니다."
		System.out.println(studentName + "님의 남은 돈은" + money + "입니다.");
	}
}
