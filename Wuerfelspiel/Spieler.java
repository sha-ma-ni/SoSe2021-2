package Wuerfelspiel;

import java.util.Random;

import javax.swing.JOptionPane;

public class Spieler {
	private String name;
	private int aktStand;

	
	Spieler(String name)
	{
		aktStand=0;
		this.name = name;
	}
	
	
	public boolean wuerfeln()
	{
		
		System.out.printf("%n%nSpieler %s ist an der Reihe (bisher %d Punkte) %n ----------------------------------------- %n" , this.name, this.aktStand);
		int punkteInDerReihe = 0;
		int wurf = 0; 
		Random r = new Random();
		boolean ende = false;
		while(!ende)
		{
			wurf = r.nextInt(6)+1;
			System.out.printf("%s hat eine %d gewuerfelt %n" , this.name, wurf);
			if(wurf==6)
			{
				aktStand =0;
				System.out.printf("Versuch zu Ende %n Aktueller Spielstand von %s : %d Punkte %n Der naechste Spieler ist dran%n", this.name, this.aktStand);
				ende = true;
			}
			else if(aktStand+punkteInDerReihe+wurf >= Spiel.siegPunkte)
			{
				System.out.printf("%s hat insgesamt %d Punkte und somit gewonnen !!!", this.name, (aktStand+punkteInDerReihe+wurf));
				return true;
			}
			else	 // eine 1..5 gewuerfelt und noch nicht gewonnen
			{
				punkteInDerReihe += wurf;
				System.out.printf("in diesem Versuch bisher %d Punkte -- insgesamt %d Punkte %n", punkteInDerReihe, (aktStand+punkteInDerReihe));
				int dialogResult = JOptionPane.showConfirmDialog (null, this.name+ ", wollen Sie weiter wuerfeln? ", "Weiter wuerfeln?", JOptionPane.YES_NO_OPTION);
				ende = (dialogResult==JOptionPane.NO_OPTION);
				if(ende)
				{
					aktStand += punkteInDerReihe;
				}
			}
		}
		return false;
	}	

}
