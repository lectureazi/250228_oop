package b_poly;

public class Desktop extends Computer{
	
	private boolean isAllInOne;

	public Desktop(String brand, String name, int price, String cpu, int ram, boolean isAllInOne) {
		super(brand, name, price, cpu, ram);
		this.isAllInOne = isAllInOne;
	}

	public boolean isAllInOne() {
		return isAllInOne;
	}

	public void setAllInOne(boolean isAllInOne) {
		this.isAllInOne = isAllInOne;
	}

	@Override
	public String toString() {
		return "Desktop [isAllInOne=" + isAllInOne + ", brand=" + brand + ", cpu=" + cpu + ", name=" + name + ", price="
				+ price + ", ram=" + ram + "]";
	}


	
	
	

}
