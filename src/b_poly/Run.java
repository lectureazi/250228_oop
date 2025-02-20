package b_poly;

import javax.management.relation.RoleUnresolvedList;

public class Run {
	
	public static void main(String[] args) {
	
		Client client = new Client();
		
		Desktop samsung = new Desktop("삼성", "갤럭시북", 500, "i7", 32, false);
		Tv tv = new Tv("LG", "LGTV", 1000, 300);
		
		Product[] products = new Product[2];
		products[0] = samsung;
		products[1] = tv;
		
		for (Product product : products) {
			client.buy(product);
		}
		
		
	}
}
