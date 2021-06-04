package Maps;

import java.util.*;

public class PizzaMenu {
	public static void main(String[] args) {
		
		Map<String, Double> menu = new HashMap<>();

		menu.put("Margheritta", 7.00); //beides richtig
		menu.put("Veggi", 7.50);  //auto boxing
		menu.put("Salami", Double.valueOf(8.50));
		menu.put("Schinken",Double.valueOf (8.50));
		//System.out.println(pizzaMap);
		System.out.println("Preis");
		System.out.println("#####################");
		printPrice(menu, "Veggi");
		printPrice(menu, "Margheritta");
		printPrice(menu, "Hawaii");
		System.out.println(" ");
		System.out.println("Menu 1");
		printMenu(menu);
//		menu.clear(); //menu löschen
//		System.out.println("Nach dem Löschen");
//		printMenu(menu);
		System.out.println(" ");
		System.out.println("Preis von Salami ändern");
		menu.put("Salami", 8.20); //in Map kann key nur 1 Mal vorhanden
		printMenu(menu);
		System.out.println();
		affordablePizza(menu, 8.0);
		affordablePizza(menu, 4.0);
		
		menu.clear();
		menu.put("Verde", 7.00); 
		menu.put("Hawaii", 8.20);
		menu.put("Tradizionale", Double.valueOf(8.50));
		Map<String, Double> menu2 = new HashMap<>();
		menu2.putAll(menu);
		System.out.println();
		System.out.println("Menu 2");
		printMenu(menu2);
		System.out.println();
		System.out.println("Hawaii von Menu 2 entfernen");
		menu2.remove("Hawaii");
		printMenu(menu2);
	}
	
	//testet, ob eine eingegebene Pizza im Menü existiert
	public static boolean existingPizza(Map<String, Double> menu, String pizza) {

		if (menu.containsKey(pizza)) {
			return true;
		}
		return false;
	}

	//für eine eingegebene Pizza den Preis ausgibt. Verwenden Sie dazu existingPizza()
	public static void printPrice(Map<String, Double> menu, String pizza) {

		if (existingPizza(menu, pizza)) { //wenn pizza im Menu exestiert

			System.out.println(pizza + ": " + menu.get(pizza));
		} else {
			System.out.println(pizza + ": Diese Pizza gibt es nicht.");
		}
	}
	
	//ausgibt, wie viele Pizzen es im Menü gibt. Wenn das Menü nicht leer ist, 
	//sollen zudem alle Pizzen mit ihrem Preis ausgegeben werden
	public static void printMenu(Map<String, Double> menu) {
		System.out.println("#####################");
		System.out.println("Das Menu enthält " + menu.size() + " Pizzen."); // wie viel Pizzen sind im Menu
		// wenn menu leer ist
		if (!menu.isEmpty()) {
			for(Map.Entry<String, Double> pizza : menu.entrySet()) {//foreach pizza aus dem Menu
				System.out.println("Pizza " + pizza.getKey() + " : " + pizza.getValue() + " Euro");
			}
			System.out.println("#####################");
		}
	}
	
	//alle Pizzen ausgibt, die man sich für einen bestimmten Betrag leisten kann
	public static void affordablePizza(Map<String, Double> menu, double maxPrice) {
		Set<String> allePizzen = new HashSet<>();
		System.out.println("Eingegebener Betrag: " + maxPrice + " Euro.");
		// einzelne Pizza im Map
		for (Map.Entry<String, Double> pizza : menu.entrySet()) {
			if (pizza.getValue() <= maxPrice) {  //wenn der Pizzapreis kleine als maximaler Preis, 
				allePizzen.add(pizza.getKey());  //dann fügen wir die pizza im Set
			}
		}
		if (allePizzen.size() != 0) {  //wenn pizzen im Set gibt
			System.out.println("Mögliche Pizzen: " + allePizzen);
		} else {
			System.out.println("Leider gibt es zu diesem Preis keine Pizza.");
		}
	}
}

 