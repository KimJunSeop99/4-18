package Account;

public class Account {
	// 인스턴스변수 : 이름, 잔액, 패스워드
	private String name;
	private int money;
	private int password;
	// 생성자 : 매개변수 3개짜리
	public Account() {
	}
	
	public Account(String name, int money, int password) {
		this.name = name;
		this.money = money;
		this.password = password;
	}
	
	// 메소드 : deposit(입금액, 패스워드)
	public int deposit(int a , int password) {
		if(this.password == password) {
		System.out.println(this.name + "고객님" + a + "원이 입금되었습니다.");
		System.out.println("현재 잔액은 : " + (money + a));  
		} else if (this.password != password) {
			System.out.println("비밀번호가 일치하지 않습니다.");
			System.out.println("다시 입력해주시기 바랍니다.");
		}
		return money + a;
	}
	// 매개변수 패스워드와 인스턴스변수 패스워드가 일치할때만
	// 입금액을 증가 시키기

	// 출력1 : 이름 + "고객님" + 입금액 + "원이 입금되었습니다"
	// 출력2 : "현재 잔액은 : " + 잔액 + "원 입니다." 
	// 일치안하면 출력1 : "비밀번호가 일치하지 않습니다."
	// 출력2 : "다시 입력해주시기 바랍니다"
}

