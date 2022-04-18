package StaticVar;

public class StaticVarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticVar sv1 = new StaticVar();
//		일반 , 전역변수 : 1씩 증가 시키기
		sv1.increase();
//		x : 일반변수 , y : 전역변수
		System.out.println("x = " + sv1.x + " , y = " + StaticVar.y);
		
		
		StaticVar sv2 = new StaticVar();
//		일반 , 전역변수 : 1씩 증가 시키기
		sv2.increase();
//		x : 일반변수 , y : 전역변수
		System.out.println("x = " + sv2.x + " , y = " + StaticVar.y);
		
		
		StaticVar sv3 = new StaticVar();
//		일반 , 전역변수 : 1씩 증가 시키기
		sv3.increase();
//		x : 일반변수 , y : 전역변수
		System.out.println("x = " + sv3.x + " , y = " + StaticVar.y);
	}
}
