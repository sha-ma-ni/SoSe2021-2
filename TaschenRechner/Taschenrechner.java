package TaschenRechner;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.Border;

public class Taschenrechner extends JFrame {
	public Taschenrechner() {
		super();

		this.setTitle("Taschenrechner"); // Titel
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Verhalten beim Schließen

		this.setSize(400, 400);      // Größe
		this.setLocation(500, 300);  // Location
		
	
		JPanel content = this.initContent();
		this.getContentPane().add(content);
		
		this.setVisible(true);       // Sichtbarkeit
	}

	private JPanel initContent() {
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());
		
		Border line = BorderFactory.createLineBorder(Color.BLUE);
		JPanel oben = new JPanel();
		
		oben.setLayout(new FlowLayout(FlowLayout.CENTER,20, 20));
		
		JTextField input = new JTextField(30);
		
		
		input.setPreferredSize(new Dimension(100, 30)); //grösse der Textfeld ändern
		
		oben.add(input);
		input.setBorder(line);

		//oben.setBackground(Color.WHITE);
		
		JPanel mitte = new JPanel();
		mitte.setLayout(new GridLayout(5, 5, 10, 10));
		mitte.add(new JButton("MRC"));
		mitte.add(new JButton("M-"));
		mitte.add(new JButton("M+"));
		mitte.add(new JButton("%"));
		mitte.add(new JButton("÷"));
		mitte.add(new JButton("√"));
		mitte.add(new JButton("7"));
		mitte.add(new JButton("8"));
		mitte.add(new JButton("9"));
		mitte.add(new JButton("✕"));
		mitte.add(new JButton("→"));
		mitte.add(new JButton("4"));
		mitte.add(new JButton("5"));
		mitte.add(new JButton("6"));
		mitte.add(new JButton("−"));
		mitte.add(new JButton("AC"));
		mitte.add(new JButton("1"));
		mitte.add(new JButton("2"));
		mitte.add(new JButton("3"));
		mitte.add(new JButton("+"));
		mitte.add(new JButton("ON"));
		mitte.add(new JButton("0"));
		mitte.add(new JButton("00"));
		mitte.add(new JButton("·"));
		mitte.add(new JButton("="));


		mainPanel.add(oben, BorderLayout.NORTH);
		mainPanel.add(mitte, BorderLayout.CENTER);
		return mainPanel;
	}




	public static void main(String[] args) {
		new Taschenrechner();
	}

}
