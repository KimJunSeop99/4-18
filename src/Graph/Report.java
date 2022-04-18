package Graph;

public class Report {
	// 온갖 그래프 출력 기능 구현
	
	// 컬러 , 흑백 , 컬러 + 흑백 등등 
	// 향후에 계속 기능이 추가하게된다면 
	// 다형성 메소드를 고려해야함
	// spring DI 형태 (의존성 주입)
	public void drawing(Graph g) {
		g.draw();
	}
}
