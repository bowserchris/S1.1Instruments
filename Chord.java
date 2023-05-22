package n1ejercicio1Instrumentos;

public class Chord extends Instrument {
	
	{
		System.out.println("A chord instrument is being created.");
	}
	
	private String instrument;
	
	public Chord (String name,int price) {
		super(name, price);
		this.instrument = "chord";
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
