package PrintTest;

public class PrintTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LaserPrinter laserprinter = new LaserPrinter();
		ColorPrinter colorprinter = new ColorPrinter();

		testAllPrint(laserprinter); // 출력 : "컬러로 출력합니다."
		testAllPrint(colorprinter); // 출력 : "레이저로 선명하게 출력합니다."
	}

	public static void testAllPrint(Printer p) {
		if (p instanceof ColorPrinter) {
			ColorPrinter color = (ColorPrinter) p;
			color.print();
		} else if (p instanceof LaserPrinter) {
			LaserPrinter laser = (LaserPrinter) p;
			laser.print();
		}
	}
}
