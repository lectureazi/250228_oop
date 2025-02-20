package a_encapsulation.method;

public class AutumnConcert {
	
	private final String name = "가을콘서트";
	
	public void start() {
		System.out.println("가을 콘서트 시작!!!");
		
		Player a = new Player("드럼");
		
		a.play(name);
		
		System.out.println("콘서트 끝!");
	}

}
