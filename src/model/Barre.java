package model;

import java.awt.*;

public class Barre extends Rectangle {

    public Barre() {
        couleur = Color.GREEN;
        x = 200;
        y = 700;
    }

    public void dessiner(Graphics2D dessin) {
        dessin.setColor(couleur);
        dessin.fillRect( x, y, largeur, hauteur);
    }
}
