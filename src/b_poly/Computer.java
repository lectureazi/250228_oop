package b_poly;

public class Computer extends Product {

	protected String cpu;
	protected int ram;

	public Computer(String brand, String name, int price, String cpu, int ram) {
		super(brand, name, price);
		this.cpu = cpu;
		this.ram = ram;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	@Override
	public String toString() {
		return "Computer [cpu=" + cpu + ", ram=" + ram + "]";
	}

}
