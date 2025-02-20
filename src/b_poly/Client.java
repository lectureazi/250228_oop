package b_poly;

public class Client {
	
	public void buy(Product product) {
		System.out.println(product.getName() + "의 가격은 " + product.getSalePrice() + " 입니다.");
		System.out.println(product.getName() + " 구매하였습니다.");
	}

}
