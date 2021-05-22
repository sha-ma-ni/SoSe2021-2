package Mengen;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SetOperations {
	// Erstellen Sie drei Objektvariablen:
		Set<Integer> numbers1;
		Set<Integer> numbers2;
		Set<Integer> both;

		// Erzeugen Sie für diese Objektvariablen TreeSet-Objekte:
		public SetOperations() {
			this.numbers1 = new TreeSet<>();
			this.numbers2 = new TreeSet<>();
			this.both = new TreeSet<>();

		
		}

		// Erstellen Sie eine Objektmethode fill(). In dieser Methode sollen die beiden
		// Sets numbers1 und numbers2
		// mit Zufallszahlen aus dem Wertebereich 0..99 befüllt werden. Erzeugen Sie
		// jeweils 100 Zufallszahlen
		// (die numbers-Sets werden dann aber jeweils weniger als 100 Einträge haben, da
		// doppelte Elemente nicht aufgenommen werden.)

		public void fill() {
			
			
			Random random = new Random();
			for (int i = 0; i < 100; i++) {
				this.numbers1.add(Integer.valueOf(random.nextInt(100)));
				this.numbers2.add(Integer.valueOf(random.nextInt(100)));
			}
			
		}

		// Erstellen Sie eine Objektmethode fillBothUnion(). In dieser Methode wird die
		// both-Menge derart befüllt,
		// dass both einer Vereinigung der Mengen numbers1 und numbers2 entspricht.
		public void fillBothUnion() {
			//c = a+b
			
			System.out.println();
			System.out.println("----------------------------------------------------------------------------");
			System.out.println("         A                           B                         Union ");
			System.out.println("----------------------------------------------------------------------------");

			this.both.addAll(this.numbers1);
			this.both.addAll(this.numbers2);
		}

		// In dieser Methode wird die both-Menge derart befüllt,
		// dass both einem Schnitt der Mengen numbers1 und numbers2 entspricht

		public void fillBothIntersection() {
			// a.retainAll(b)
			                                       // c= a+b
			this.both.clear();                     // c ist leer
			System.out.println();
			System.out.println("----------------------------------------------------------------------------");
			System.out.println("         A                           B                      Intersection ");
			System.out.println("----------------------------------------------------------------------------");

			this.both.addAll(this.numbers1);       // c = a
			this.both.retainAll(this.numbers2);    // c.retainAll(b)
		}

		// In dieser Methode wird die both-Menge derart befüllt,
		// dass both der Differenz der Menge numbers1 minus der Menge numbers2
		// entspricht.
		
		public void fillBothDifference() 
		{   
			//c.addAll(a);
			//c.removeAll(b);
			System.out.println();
			System.out.println("----------------------------------------------------------------------------");
			System.out.println("         A                           B                      Difference ");
			System.out.println("----------------------------------------------------------------------------");

			this.both.addAll(this.numbers1);
			this.both.removeAll(this.numbers2);
		}

		public void print() {
			int counterA = 0;
			int counterB = 0;
			int counterBoth = 0;

			for (int row = 0; row < 10; row++)   // geben auf der konsole ein Quadrat 10*10 aus für jede Set
			{
				for (int col = 0; col < 10; col++) 
				{
					if (this.numbers1.contains(Integer.valueOf(counterA))) 
					{
						System.out.print(" " + "*");
					} 
					else 
					{
						System.out.print(" " + " ");
					}
					counterA++;	
				}
				System.out.print("        ");  //Leerzeichen zwischen set1, set2, set3
				
				for (int col = 0; col < 10; col++) 
				{
					if (this.numbers2.contains(Integer.valueOf(counterB))) 
					{
						System.out.print(" " + "*");
					} 
					else 
					{
						System.out.print(" " + " ");
					}
					counterB++;
				}

				System.out.print("        ");
				for (int col = 0; col < 10; col++) {
					if (this.both.contains(Integer.valueOf(counterBoth))) 
					{
						System.out.print(" " + "*");
					} 
					else 
					{
						System.out.print(" " + " ");
					}
					counterBoth++;
				}
				System.out.println();
			}
			
		}
}
