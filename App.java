package n1ejercicio1Instrumentos;

public class App {
	
	public static Chord createChord(String name, int price) {
		return new Chord (name, price);
	}
	
	public static Wind createWind(String name, int price) {
		return new Wind (name, price);
	}
	
	public static Percussion createPercussion(String name, int price) {
		return new Percussion (name, price);
	}

	static {
		System.out.println("The program is running.");
	}

	public static void main(String[] args) {
		
		Chord chordInitia = new Chord ("yamaha", 150);				
		Wind windInitia = new Wind("flute", 80);
		Percussion percussionInitia = new Percussion ("drums", 450);
		
		chordInitia.play();
		windInitia.play();
		percussionInitia.play();

	}
	
}


/*
wind
chord
percussion

all attributes:
name
price

play() method abstract to class instrument for all subclasses (wind, chord, percussion)
in each subclass whenn play is used method  should print "Està sonant un instrument de x"

En un grup de música hi ha diferents tipus d’instruments musicals. 
Hi ha instruments de vent, de corda i de percussió.

Tots els instruments tenen com a atributs el seu nom, i el seu preu. 
A més, tenen un mètode anomenat tocar(). Aquest, és abstracte a la classe 
instrument i, per tant, s’ha d’implementar a les classes filles. Si s’està
 tocant un instrument de vent, el mètode ha de mostrar per consola: "Està 
 sonant un instrument de vent", si s’està tocant un instrument de corda: 
 “Està sonant un instrument de corda” i si s’està tocant un instrument
  de percussió: “Està sonant un instrument de percussió”.

El procés de càrrega d'una classe només té lloc una vegada. Demostra que 
la càrrega pot ser provocada per la creació de la primera instància d'aquesta
 classe o per l'accés a un membre estàtic d'aquesta. 

Cerca informació sobre els blocs d'inicialització i blocs estàtics en Java.


In a music group there are different types of musical instruments.
There are wind, string and percussion instruments.

All instruments have their name and price as attributes.
Also, they have a method called touch(). This one is abstract in class
instrument and therefore must be implemented in child classes. If it is
 playing a wind instrument, the method should display by console: “It is
 playing a wind instrument", if a stringed instrument is being played:
 "A stringed instrument is playing" and if an instrument is being played
  of percussion: "A percussion instrument is playing".

The process of loading a class takes place only once. Show that
the load can be caused by the creation of the first instance of it
 class or by accessing a static member of it.

Find information about initialization blocks and static blocks in Java.






*/