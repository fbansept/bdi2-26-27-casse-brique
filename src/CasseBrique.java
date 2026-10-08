import model.Balle;
import model.Barre;
import model.Sprite;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class CasseBrique extends Canvas {

    private ArrayList<Balle> listeBalle = new ArrayList();
    private Barre barre = new Barre();

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

        KeyListener evenement = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_LEFT) {

                    System.out.println("gauche");

                } else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
                    System.out.println("droite");
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        };

        fenetre.addKeyListener(evenement);

        fenetre.setIgnoreRepaint(true);
        fenetre.setResizable(false);

        this.setSize(600, 800);
        this.setBounds(0,0, 600, 800);

        fenetre.setVisible(true);

        this.createBufferStrategy(2);

        demarrer();
    }

    public void demarrer() throws InterruptedException {


        listeBalle.add(new Balle());


        while(true) {

            Graphics2D dessin = (Graphics2D) getBufferStrategy().getDrawGraphics();
            // tout le code du jeu

            dessin.setColor(Color.WHITE);
            dessin.fillRect(0,0,600,800);

//            for(int i = 0; i < tableauBalle.length; i ++) {
//                tableauBalle[i].deplacement();
//                tableauBalle[i].dessiner(dessin);
//            }

            barre.dessiner(dessin);

            for(Balle balle : listeBalle) {
                balle.deplacement();
                balle.dessiner(dessin);
            }

            dessin.dispose();
            getBufferStrategy().show();

            Thread.sleep(1000 / 60);
        }

    }

    public static void main() throws InterruptedException {

        new CasseBrique();

    }
}
