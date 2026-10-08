package model;

import java.awt.*;

public class Balle extends Sprite {

    private int vitesseHorizontale;
    private int vitesseVerticale;

    public Balle() {
        this.x = (int)(Math.random() * 600);
        this.y = (int)(Math.random() * 800);
        this.vitesseHorizontale = (int)(Math.random() * 9) + 1;
        this.vitesseVerticale = (int)(Math.random() * 9) + 1;
        this.couleur = new Color(
                (float)Math.random(),
                (float)Math.random(),
                (float)Math.random());
    }

    public Balle(int x, int y, int vitesseHorizontale, int vitesseVerticale) {
        this.x = x;
        this.y = y;
        this.vitesseHorizontale = vitesseHorizontale;
        this.vitesseVerticale = vitesseVerticale;
    }

    public void deplacement() {
        x += vitesseHorizontale;
        y += vitesseVerticale;

        if(x < 0 || x > 580) {
            vitesseHorizontale = -vitesseHorizontale;
        }

        if(y < 0 || y > 780) {
            vitesseVerticale = -vitesseVerticale;
        }
    }

    public void dessiner(Graphics2D dessin) {
        dessin.setColor(couleur);
        dessin.fillOval(x, y,20,20);
    }

    public int getVitesseHorizontale() {
        return vitesseHorizontale;
    }

    public void setVitesseHorizontale(int vitesseHorizontale) {
        this.vitesseHorizontale = vitesseHorizontale;
    }

    public int getVitesseVerticale() {
        return vitesseVerticale;
    }

    public void setVitesseVerticale(int vitesseVerticale) {
        this.vitesseVerticale = vitesseVerticale;
    }
}
