package Interfaces;

public class Student implements Listener {
	
	private String name;                      //speichert den Namen von Student
	private Publisher publisher;              // speichert den Publisher, an den sich Student anmeldet)

	// Im parametrisierten Konstruktor wird der Name initalisiert
	public Student(String name) {
		this.name = name;
	}

	// wird die getUpdate()-Methode des publisher aufgerufen und die zurückgegebene 
	//Nachricht msg wie folgt auf die Konsole ausgegben: this.name + " received " + msg
	@Override
	public void update() {
		String  msg = publisher.getUpdate(this);
		
		System.out.println(this.name + " received " + msg);
	}
	
	//wird die register()-Methode des publisher aufgerufen und der Wert der Objektvariable publisher gesetzt. 
	//Geben Sie bei erfolgreicher Anmeldung an den publisher auf die Konsole this.name + " registered!" aus.
	@Override
	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
		if (this.publisher.register(this)) {
			System.out.println(this.name + "registered!");
		}
	}
	
	//meldet sich Student wieder vom publisher ab (Aufruf von unregister() und Ausgabe auf die Konsole this.name + " deregistered!"
	@Override
	public void removePublisher(Publisher publisher) {
		this.publisher = publisher;
		if (this.publisher.unregister(this)) {
			System.out.println(this.name + "unregistered!");
		}
		this.publisher = null; //damit weiter this auf andere publischer zeigt
	}

	@Override
	public int hashCode() {
		return this.name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		
		return this.name.equals(other.name);
	}
	
}