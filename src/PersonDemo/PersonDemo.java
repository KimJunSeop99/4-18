package PersonDemo;

public class PersonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		문제 1: Person 클래스를 만들고
//			   인스턴스 변수는 name : ""
//			   			   age : 0
//						   email : ""
//		setter 이용해서 아래 값을 저장
//		객체 p1 : name = "홍길동"
//				 age = 23
//		 		 email = "hong@gmail.com"
//		객체 p2 : name = "김유신"
//		 age = 44
//		 email = "kim@gmail.com"
		
//		출력 : getter 이용해서 print출력
		
		Hong p1 = new Hong();
		Kim p2 = new Kim();
		
		p1.setName("홍길동");
		p1.setAge(23);
		p1.setEmail("hong@gmail.com");
		
		p2.setName("김유신");
		p2.setAge(44);
		p2.setEmail("kim@gmail.com");
	
		System.out.println(p1.getName() + p1.getAge() + p1.getEmail());
		System.out.println(p2.getName() + p2.getAge() + p2.getEmail());
	}

}
