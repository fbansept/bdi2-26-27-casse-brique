package model;

public class Balle {

    private int x = 300;
    private int y = 200;
    private int vitesseHorizontale = 5;
    private int vitesseVerticale = 3;

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


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getVitesseHorizontale() {
        return vitesseHorizontale;
    }

    public void setVitesseHorizontale(int vitesseHorizontale) {
        this.vitesseHorizontale = vitesseHorizontale;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getVitesseVerticale() {
        return vitesseVerticale;
    }

    public void setVitesseVerticale(int vitesseVerticale) {
        this.vitesseVerticale = vitesseVerticale;
    }
}
