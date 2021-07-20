package Wuerfelspiel;

import javax.swing.JOptionPane;

public class Spiel {

	 public static int siegPunkte;
	    private Spieler[] spieler;

	    Spiel()
	    {
	        anzSpielerFestlegen();
	        anzSiegPunkteFestlegen();
	        nameDerSpieler();
	    }

	    public void anzSpielerFestlegen() {
	        int anzSpieler = 0;
	        boolean inputOk = false;
	        while(!inputOk)
	        {
	            try
	            {
	                String input = JOptionPane.showInputDialog("Anzahl Spieler :");
	                inputOk = true;
	                anzSpieler = Integer.parseInt(input);
	            }
	            catch(NumberFormatException e)
	            {

	                JOptionPane.showMessageDialog(null, "Die Eingabe muss eine Zahl sein ");
	                inputOk = false;
	            }
	        }
	        spieler = new Spieler[anzSpieler];
	    }

	    public void anzSiegPunkteFestlegen() {
	        boolean inputOk = false;
	        while(!inputOk)
	        {
	            try
	            {
	                String input = JOptionPane.showInputDialog("Siegpunkte :");
	                inputOk = true;
	                siegPunkte = Integer.parseInt(input);
	            }
	            catch(NumberFormatException e)
	            {
	                JOptionPane.showMessageDialog(null, "Die Eingabe muss eine Zahl sein ");
	                inputOk = false;
	            }
	        }

	    }

	    public void nameDerSpieler() {
	        String name = "";
	        for(int i=0; i<spieler.length; i++)
	        {
	            name = JOptionPane.showInputDialog("Name des Spielers " + (i+1)+" :");
	            spieler[i] = new Spieler(name);
	        }
	    }


	    public void spielen()
	    {
	        int index = 0;
	        boolean gewonnen = false;
	        while(!gewonnen)
	        {
	            gewonnen = spieler[index].wuerfeln();
	            index = (index<spieler.length-1) ? index+1 : 0;
	        }
	    }

	    public static void main(String[] args)
	    {
	        Spiel spiel = new Spiel();
	        spiel.spielen();
	    }
}
