package a_encapsulation.method;

public class WinterConcert {
	
	private final String name = "겨울콘서트";
	
	public void start() {
		System.out.println("Winter Concert Start!!!");
		
		Player a = new Player("바이올린");
		
		a.play(name);
		
		System.out.println("다음에 만나요!!");
		System.out.println("=========================================");
	}

}
