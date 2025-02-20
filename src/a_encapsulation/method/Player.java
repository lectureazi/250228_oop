package a_encapsulation.method;

// 구체적인 기능은 숨기고, 외부로부터 메세지(요청)을 받기 위한 진입점을 생성
// 객체는 자율적으로 행동해야한다. 
// 연주자 객체는 연주를 어떻게 수행할지 스스로 결정해야한다.
public class Player {
	
	private String instrument;

	public Player(String instrument) {
		super();
		this.instrument = instrument;
	}
	
	public void play(String concertName) {
		prepare();
		playMusic();
		stop();
		curtainCall(concertName);
		leave();
	}
	
	private void prepare() {
		System.out.println(instrument + " 연주 준비");
	}
	
	private void playMusic() {
		System.out.println(instrument + "를 연주하고 있습니다.");
	}
	
	private void stop() {
		System.out.println("악기 연주를 멈춥니다.");
	}
	
	public void curtainCall(String concertName) {
		System.out.println(concertName + "의 커튼콜을 합니다.");
	}
	
	private void leave() {
		System.out.println("무대를 떠납니다.");
	}
	
	
	
}
