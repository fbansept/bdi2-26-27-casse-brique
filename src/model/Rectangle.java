package model;

import java.awt.*;

public class Rectangle extends Sprite {

    protected int largeur = 200;
    protected int hauteur = 40;

    public void dessiner(Graphics2D dessin) {
        dessin.setColor(couleur);
        dessin.fillRect( x, y, largeur, hauteur);
    }

}
