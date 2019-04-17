import java.awt.*;

public class Punto extends Geometria {

    private int x = 0, y = 0;
    private Color color;
    public int d;

    public Punto(int x, int y, Color color, int diametro){
        setX(x);
        setY(y);
        setColor(color);
        this.d = diametro;
    }

    @Override
    public void dibujar(Graphics g) {
        //g.setColor();
        g.setColor(getColor());
        g.fillOval(getX() ,getY(), this.d, this.d);
        System.out.println("Grosor: "+this.d);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
