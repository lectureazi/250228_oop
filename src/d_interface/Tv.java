package d_interface;

public class Tv extends Product{
	
	
	private int inch;
	private final double tax = 0.1; 

	public Tv(String brand, String name, int price, int inch) {
		super(brand, name, price);
		this.inch = inch;
	}
	
	@Override
	public int getSalePrice() {
		int price = super.getSalePrice();
		return (int) (price + price * tax);
	}



	public int getInch() {
		return inch;
	}

	public void setInch(int inch) {
		this.inch = inch;
	}

	@Override
	public String toString() {
		return "Tv [inch=" + inch + ", brand=" + brand + ", name=" + name + ", price=" + price + "]";
	}

	
	
	
	
}
