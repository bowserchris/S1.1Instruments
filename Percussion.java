package n1ejercicio1Instrumentos;

public class Percussion extends Instrument{
	
	{
		System.out.println("A percussion instrument is being created.");
	}
			
	private String instrument;
		
	public Percussion (String name,int price) {
		super(name, price);
		this.instrument = "percussion";
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
