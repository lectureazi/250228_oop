package d_interface;

import java.util.Iterator;

public class Run {
	
	// interface
	// inter  +  face	
	
	// 서로 독립된 두 모듈이 만나는 지점, 약속
	
	// ex) 
	
	// API : Application Programing Interface
	// 서로 다른 두 애플리케이션이 하나의 프로그램을 만들기 위해 만나는 지점, 약속
	
	// UI :  User + Interface
	//		사용자와 애플리케이션이 만나는 지점, 약속
	
	public static void main(String[] args) {
		
		Products products = new Products();
		
		Tv samsung = new Tv("삼성", "삼텐바이", 3000000, 52);
		Tv lg = new Tv("LG", "LG", 4000000, 52);
		Tv shaomi = new Tv("shaomi", "짭텐바이", 2000000, 52);
		
		products.add(samsung);
		products.add(lg);
		products.add(shaomi);
		
//		Iterator iter = products.iterator();
//		
//		while(iter.hasNext()) {
//			System.out.println(iter.next());
//		}
		
		for (Product product : products) {
			System.out.println(product);
		}
		
		
	}
}
