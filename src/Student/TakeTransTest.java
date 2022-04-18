package Student;

public class TakeTransTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student james = new Student("James" , 5000);
		Student tomas = new Student("tomas" , 10000);
		
		Bus bus100 = new Bus(100); // 100번 버스생성.
		james.takeBus(bus100); // 100번 버스를 탑니다.
		tomas.takeBus(bus100); // 100번 버스를 탑니다.
		
		james.showInfo();
		tomas.showInfo();
		
//		버스 정보
		bus100.showInfo();
		
	}

}
