package n1ejercicio1Instrumentos;

public abstract class Instrument {
	
	private String name;
	private int price;
	
	public Instrument (String name,int price) {
		this.name = name;
		this.price = price;
	}
	
	public Instrument () {
		this.name = "name";
		this.price = 10;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	abstract void play();
	
	public String toString() {
		return "The name of the instrument is: " + name + ".\r"
				+ "The price for the instrument is: " + price + "\r.";
	}

}
