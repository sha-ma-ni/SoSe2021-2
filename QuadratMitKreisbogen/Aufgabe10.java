package QuadratMitKreisbogen;

import java.awt.*;

import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Aufgabe10 extends JFrame{
    Canvas canvas;

    public Aufgabe10()
    {
        super();
        this.setTitle("Aufgabe10");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.canvas = new Canvas();
        this.getContentPane().add(this.canvas, BorderLayout.CENTER);

        this.setSize(400, 400);
        this.setLocation(300,200);
        this.setVisible(true);
    }

    private class Canvas extends JPanel
    {
        @Override
        protected void paintComponent(Graphics g)
        {
            super.paintComponent(g);        // Implementierung von JPanel aufrufen
            Graphics2D g2 = (Graphics2D)g;  // Methoden von Graphics2D nutzbar

            int canvasHeight = this.getHeight();
            int canvasWidth = this.getWidth();

            final int DURCHMESSER = 2;
            int x1=0, y1=0, seite=0;

            if(canvasWidth < canvasHeight) {

                x1 = (int) (canvasWidth * 0.05);
                seite = (int) (canvasWidth * 0.9);
                y1 = (canvasHeight - seite)/2;
            }
            else
            {
                y1 = (int) (canvasHeight * 0.05);
                seite = (int) (canvasHeight * 0.9);
                x1 = (int) (canvasWidth - seite)/2;
            }

            g2.setStroke(new BasicStroke(3.0f));
            g2.drawRect(x1,y1,seite,seite);
            g2.drawArc(x1,y1,seite*2,seite*2,90,90);

            Random r = new Random();

            int xm = x1 + seite;
            int ym = y1 + seite;



            for (int i = 0; i < 10000; i++) {
                int x = r.nextInt(seite-DURCHMESSER)+x1;
                int y = r.nextInt(seite-DURCHMESSER)+y1;
                if((x-xm)*(x-xm)+(y-ym)*(y-ym) <= seite*seite){
                    g2.setColor(Color.GREEN);
                }
                else {
                    g2.setColor(Color.RED);
                }
                g2.fillOval(x,y,DURCHMESSER,DURCHMESSER);
            }
        }
    }

    public static void main(String[] args)
    {
        new Aufgabe10();
    }
}
