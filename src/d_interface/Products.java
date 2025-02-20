package d_interface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Products implements Iterable<Product>{
	
	private List<Product> products = new ArrayList<Product>();
	
	public void add(Product p) {
		products.add(p);
	}
	
	public Product get(int index) {
		return products.get(index);
	}

	@Override
	public String toString() {
		return "Products [products=" + products + "]";
	}
	
	
	// 제어반전
	// 프로그램의 흐름을 개발자가 아니라 모듈이 제어하는 것
	// => 우리가 작성한 코드를 Collection Framework가 호출한다!
	
	// 라이브러리 : 프로그램의 흐름을 개발자가 제어
	// 프레임워크 : 프로그램의 흐름을 프레임워크가 제어 ex) Spring
	// Spring : IOC/DI, AOP, PSA 
	// 		웹애플리케이션의 라이프사이클이 Spring(Servlet)에 의해 제어됨
	@Override
	public Iterator<Product> iterator() {
		return new Iterator<Product>() {
			
			private int pointer = 0;
			private int size = products.size();
			
			@Override
			public boolean hasNext() {
				return pointer < size;
			}
			
			@Override
			public Product next() {
				Product e =  get(pointer);
				pointer++;
				return e;
			}
		};
	}

}
