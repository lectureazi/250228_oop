package a_encapsulation.method;

public class SummerConcert {
	
	private final String name = "여름콘서트";
	
	public void start() {
		System.out.println("Summer Concert Start!!!");
		
		Player a = new Player("바이올린");
		
		a.play(name);
		
		System.out.println("다음에 만나요!!");
		System.out.println("=========================================");
	}

}
