package Student;

public class Bus {
//	멤버변수 : 버스번호 , 승객 수 , 버스 수입
	private int busNumber;
	private int passengerCount;
	private int money;

	public Bus() {
	}

//	생성자 1개짜리 : 버스번호
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}

	public void take(int money) {
//		버스 돈 증가
		this.money = this.money + money;
//		승객 수 증가
		this.passengerCount++;

	}

//	버스의 승객 수와 버스잔액을 출력하는 함수
	public void showInfo() {
//		print 출력 : "버스" + 버스번호 + "번의 승객은" + 승객수 + "명이고, 수입은" + 버스돈 + "입니다"
		System.out.println("버스" + this.busNumber + "번의 승객은" + this.passengerCount + "명이고, 수입은" + this.money + "입니다");
	}

}
