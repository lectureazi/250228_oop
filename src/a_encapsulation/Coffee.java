package a_encapsulation;


// 1. 추상화
// 2. 캡슐화 : 외부로 부터 속성을 숨기고 속성에 접근하기 위한 진입점(getter/setter)을 열어줌

// 캡슐화의 접근관리
// getter / setter  : 읽기, 쓰기
// getter 			: 읽기
// x				: 접근 불가
public class Coffee {
	
	private String name;  
	private int price;    
	private int stock;
		
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		if(price < 0 ) throw new IllegalArgumentException();
		this.price = price;
	}
	
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	@Override
	public String toString() {
		return "Coffee [name=" + name + ", price=" + price + ", stock=" + stock + "]";
	}
	
}
