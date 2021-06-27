package TaschenRechnerAction;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.Border;

public class Taschenrechner2 extends JFrame implements ActionListener {

	JTextField input;
	String display = "";
	double result;
	double SolveResult;
	Boolean addBool = false;
    Boolean subBool = false;
    Boolean divBool = false;
    Boolean mulBool = false;
    String first, second, operator;

	public Taschenrechner2() {

		super();

		this.setTitle("Taschenrechner"); // Titel
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Verhalten beim Schließen

		this.setSize(400, 400); // Größe
		this.setLocation(500, 300); // Location

		JPanel content = this.initContent();
		this.getContentPane().add(content);

		this.setVisible(true); // Sichtbarkeit
	}

	private JPanel initContent() {
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());

		Border line = BorderFactory.createLineBorder(Color.BLUE);
		JPanel oben = new JPanel();

		oben.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));

		input = new JTextField(30);

		input.setPreferredSize(new Dimension(100, 30)); // grösse der Textfeld ändern

		oben.add(input);
		input.setBorder(line);

		// oben.setBackground(Color.WHITE);

		JPanel mitte = new JPanel();
		mitte.setLayout(new GridLayout(5, 5, 10, 10));
		mitte.add(new JButton("MRC"));
		mitte.add(new JButton("M-"));
		mitte.add(new JButton("M+"));

		JButton proz = new JButton("%");
		proz.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String s = input.getText();
				input.setText(s + "%");

			}
		});
		mitte.add(proz);

		JButton div = new JButton("÷");
		div.setBackground(Color.YELLOW);
		div.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String display = input.getText();
				
				input.setText(display + "÷");
			}
		});
		mitte.add(div);
		mitte.add(new JButton("√"));

		JButton b7 = new JButton("7");
		b7.setBackground(Color.YELLOW);
		b7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				display = input.getText();
				input.setText(display + "7");

			}
		});
		mitte.add(b7);

		JButton b8 = new JButton("8");
		b8.setBackground(Color.YELLOW);
		b8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				display = input.getText();
				input.setText(display + "8");

			}
		});
		mitte.add(b8);

		JButton b9 = new JButton("9");
		b9.setBackground(Color.YELLOW);
		b9.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				display = input.getText();
				input.setText(display + "9");

			}
		});
		mitte.add(b9);

		JButton multi = new JButton("✕");
		multi.setBackground(Color.YELLOW);
		multi.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				display = input.getText();
				input.setText(display + "✕");

			}
		});
		mitte.add(multi);

		mitte.add(new JButton("→"));

		JButton b4 = new JButton("4");
		b4.setBackground(Color.YELLOW);
		b4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				display = input.getText();
				input.setText(display + "4");

			}
		});
		mitte.add(b4);
		JButton b5 = new JButton("5");
		b5.setBackground(Color.YELLOW);
		b5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				display = input.getText();
				input.setText(display + "5");

			}
		});
		mitte.add(b5);
		JButton b6 = new JButton("6");
		b6.setBackground(Color.YELLOW);
		b6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				display = input.getText();
				input.setText(display + "6");

			}
		});
		mitte.add(b6);
		JButton minus = new JButton("-");
		minus.setBackground(Color.YELLOW);
		minus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				display = input.getText();
				input.setText(display + "-");

			}
		});
		mitte.add(minus);
		//mitte.add(new JButton("AC"));
		JButton start = new JButton("AC");
		start.setBackground(Color.YELLOW);
		start.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				input.setText("");
				////String s = input.getText();
				//input.setText(s + "");
			}
		});
		mitte.add(start);

		JButton b1 = new JButton("1");
		b1.setBackground(Color.YELLOW);
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				display = input.getText();
				input.setText(display + "1");
			}
		});
		mitte.add(b1);

		JButton b2 = new JButton("2");
		b2.setBackground(Color.YELLOW);
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				display = input.getText();
				input.setText(display + "2");

			}
		});
		mitte.add(b2);

		JButton b3 = new JButton("3");
		b3.setBackground(Color.YELLOW);
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				display = input.getText();
				input.setText(display + "3");

			}
		});
		mitte.add(b3);

		JButton plus = new JButton("+");
		plus.setBackground(Color.YELLOW);
		plus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				display = input.getText();
				input.setText(display + "+");

			}
		});
		mitte.add(plus);
		mitte.add(new JButton("ON"));
		
		JButton zero = new JButton("0");
		zero.setBackground(Color.YELLOW);
		zero.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				display = input.getText();
				input.setText(display + "0");

			}
		});
		mitte.add(zero);
		JButton doubleZero = new JButton("00");
		doubleZero.setBackground(Color.YELLOW);
		doubleZero.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				display = input.getText();
				input.setText(display + "00");

			}
		});
		mitte.add(doubleZero);
		JButton punkt = new JButton(".");
		punkt.setBackground(Color.YELLOW);
		punkt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				display = input.getText();
				input.setText(display + ".");

			}
		});
		mitte.add(punkt);
		JButton gleich = new JButton("=");
		gleich.setBackground(Color.YELLOW);
		gleich.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				display = input.getText();
				input.setText(display + "=");

			}
		});
		mitte.add(gleich);

		mainPanel.add(oben, BorderLayout.NORTH);
		mainPanel.add(mitte, BorderLayout.CENTER);
		return mainPanel;
	}



	public static void main(String[] args) {
		new Taschenrechner2();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		

		
		      char[] arr = display.toCharArray();
		
		      for (int i = 0; i < arr.length; i++) {
			         if (arr[i] >= '0' && arr[i] <= '9' || arr[i] == '.') 
			         {
			            if(operator.isEmpty()){
			               first += arr[i];
			            }else{
			               second += arr[i];
			            }
			         }  

		
		if(arr[i] == '+' || arr[i] == '-' || arr[i] == '/' || arr[i] == '*') 
        {
           operator += arr[i];
        }
     }

		
		if (operator.equals("+"))
			result = (Double.parseDouble(first) + Double.parseDouble(second));
		else if (operator.equals("-"))
			result = (Double.parseDouble(first) - Double.parseDouble(second));
		else if (operator.equals("/"))
			result = (Double.parseDouble(first) / Double.parseDouble(second));
		else
			result = (Double.parseDouble(first) * Double.parseDouble(second));
		
	
	//display = Double.toString(result);	
		}
	
		}
	

