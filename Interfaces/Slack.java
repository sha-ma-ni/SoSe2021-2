package Interfaces;

import java.util.*;

public class Slack implements Publisher{
	
	private Set<Listener> listeners; //speichert alle "Abonnenten"; kann gerne auch eine Liste sein
	private int nrOfMessages;        //speichert die aktuelle Nummer einer veröffentlichten Nachricht - die Nachrichten, 
	                                 //die veröffentlicht werden, sollen fortlaufend nummeriert werden

	//Im parameterlosen Konstruktor werden die Menge (oder Liste) erzeugt und die nrOfMessages auf `0 gesetzt.
	public Slack() {
		
		this.listeners = new HashSet<>();
		this.nrOfMessages = 0;
	}

	//Hier wird der listener in die Set listeners eingefügt. Geben Sie ein true zurück, 
	//wenn listener tatsächlich eingefügt wurde und false sonst (falls er schon in der Menge (oder Liste) war. 
	@Override
	public boolean register(Listener listener) {

		return listeners.add(listener);
	}

	//Hier wird der listener wieder aus der Set listeners gelöscht. Geben Sie ein true zurück, 
	//wenn listener tatsächlich gelöscht wurde und false sonst (falls er nicht in der Menge (oder Liste) war.
	@Override
	public boolean unregister(Listener listener) {
	
		return listeners.remove(listener);
	}

	//wird für alle listener aus der Menge listeners die update()-Methode aufgerufen (siehe Listener und Student)
	@Override
	public void notifyListeners() {
		for (Listener l: listeners) {
			l.update();
		}
		
	}

	//liefert einfach folgenden String zurück: "Breaking News " + this.nrOfMessages.
	@Override
	public String getUpdate(Listener listener) {
		
		return "Breaking News " + this.nrOfMessages;
	}

	//in der die nrOfMessages um 1 erhöht und die Methode notifyListeners() aufgerufen wird.
	public void publishNews() {
		this.notifyListeners();
		this.nrOfMessages++;
	}
}
