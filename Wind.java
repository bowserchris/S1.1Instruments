package n1ejercicio1Instrumentos;

public class Wind extends Instrument {
	
	{
		System.out.println("A wind instrument is being created.");
	}
	
	private String instrument;
	
	public Wind (String name,int price) {
		super(name, price);
		this.instrument = "wind";
	}
	
	public String getInstrument() {
		return instrument;
	}
		
	void play() {			
		System.out.println("A " + instrument + " instrument is being played.");
	}
	
	public String toString() {
		return super.toString() + "The instrument type is: " + instrument + ".\r";
	}
	
}
