import model.Balle;

import javax.swing.*;
import java.awt.*;

public class CasseBrique extends Canvas {

    public CasseBrique() throws InterruptedException {

        JFrame fenetre = new JFrame("Mon super casse brique");


        fenetre.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        fenetre.pack();
        fenetre.setSize(600, 800);

        JPanel panneau = new JPanel();
        panneau.add(this);

        fenetre.setContentPane(panneau);

        fenetre.requestFocus();
        this.setFocusable(false);

        fenetre.setIgnoreRepaint(true);
        fenetre.setResizable(false);


        this.setSize(600, 800);
        this.setBounds(0,0, 600, 800);

        fenetre.setVisible(true);

        this.createBufferStrategy(2);

        demarrer();
    }

    public void demarrer() throws InterruptedException {

        Balle maBalle = new Balle();

        maBalle.setX(300);
        maBalle.setVitesseHorizontale(5);
        maBalle.setY(200);
        maBalle.setVitesseVerticale(3);

        while(true) {

            Graphics2D dessin = (Graphics2D) getBufferStrategy().getDrawGraphics();
            // tout le code du jeu

            dessin.setColor(Color.WHITE);
            dessin.fillRect(0,0,600,800);

            dessin.setColor(Color.RED);
            dessin.fillOval(maBalle.getX(), maBalle.getY(),20,20);

            maBalle.deplacement();

            dessin.dispose();
            getBufferStrategy().show();

            Thread.sleep(1000 / 60);

        }

    }

    public static void main() throws InterruptedException {

        new CasseBrique();

    }
}
