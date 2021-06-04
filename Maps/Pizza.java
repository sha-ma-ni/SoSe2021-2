package Maps;

public class Pizza {
	public static void main(String[] args) {
		//Was stellen Sie fest und warum? Ändern Sie den Vergleich der Variablen b und c so, 
		//dass true ausgegeben wird. Die ersten drei Zeilen bleiben dabei unverändert. 
		//Sie benötigen also einen anderen Vergleich als b == c
		
		long a = 1000;
		Integer b = 1000;       
		Integer c = 1000;       
		System.out.println(a == b);  //true  auto boxing
		System.out.println(b == c);  //false  
		                             //Referenzvergleich, und es findet kein Unboxing auf primitive Werte statt, 
		                             //sodass es auf einen Vergleich von primitiven Werten hinausliefe
		
		System.out.println("b == c? " + b.equals(c));
	}

}
