import model.Balle;
import model.Barre;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

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

        ArrayList<Balle> listeBalle = new ArrayList();
        listeBalle.add(new Balle());

        Barre barre = new Barre();

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
