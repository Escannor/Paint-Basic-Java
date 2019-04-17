import javafx.scene.shape.Circle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Path2D;
import java.awt.geom.Point2D;
import java.security.PrivateKey;
import java.util.ArrayList;

public class DibujoJPanel extends JPanel implements MouseListener, MouseMotionListener {  //MouseAdapter incluye todos
    ArrayList<Punto> listaPuntos = null;
    ArrayList<Linea> listaLineas = null;
    int mx;
    int my;
    int x2;
    int y2;
    int op;
    int alto, ancho;
    int diametro = 5;
    private boolean puntoB = true, lineaB = false;

    int strk_width = 5;
    String posX, posY;
    Color color = Color.BLUE;
    //Paint Objeto = Circle;


    public DibujoJPanel(){
        this.setBackground(Color.BLACK);
        setListaPuntos(new ArrayList<>());
        setListaLineas(new ArrayList<>());

        addMouseListener(this);
        //this.shape = new Path2D.Float();
    }



    public ArrayList<Punto> getListaPuntos() {
        return listaPuntos;
    }

    public void setListaPuntos(ArrayList<Punto> listaPuntos) {
        this.listaPuntos = listaPuntos;
    }

    public ArrayList<Linea> getListaLineas() {
        return listaLineas;
    }

    public void setListaLineas(ArrayList<Linea> listaLineas) {
        this.listaLineas = listaLineas;
    }


    public void paint(Graphics g) {
        super.paint(g);
        //Graphics2D draw = (Graphics2D) g;
        g.setColor(color);
        for (Punto objPunto : getListaPuntos()){
            objPunto.dibujar(g);
        }
        for (Linea objLinea : getListaLineas()){
            objLinea.dibujar(g);
        }
        System.out.println("Entra a paint");

        //draw.setStroke(new BasicStroke(this.strk_width));
        //draw.setColor(Color.BLUE);
            //g.setColor(color);
        //draw.fillOval(mx, my, 10, 10);
        //repaint();


            //draw.fillRect(0 , 0,this.getWidth(),this.getHeight());

            //draw.draw(this.shape);
    }


    @Override
    public void mouseClicked(MouseEvent e) {
        mx = e.getX();
        my = e.getY();
        //Graphics g = getGraphics();
        //g.setColor(Color.BLUE);
        //g.fillOval(mx,my,10,10);
        //this.paint();
        System.out.println("mouseClicked en ("+mx+" ,"+my+" )");
        if (puntoB == true) {
            //getListaPuntos().add(new Punto(mx - Punto.d, my - Punto.d, color));
            getListaPuntos().add(new Punto(mx - diametro, my - diametro, color, diametro));
        }
        repaint();
        //circle = new Punto(mx - Punto.d, my - Punto.d)
        //paint(punto);
        //repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {
        //System.out.println("mousePressed");
        mx = e.getX();
        my = e.getY();
        //Graphics g = getGraphics();
        //g.setColor(Color.BLUE);
        //g.drawRect(mx, my, ancho, alto);

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("mouseReleased");
        x2 = e.getX();
        y2 = e.getY();
        if(lineaB == true){
            getListaLineas().add(new Linea(mx, my, x2, y2, color));
        }
        repaint();
        //Graphics g = getGraphics();
        //g.setColor(Color.BLUE);
        //g.drawRect(mx, my, ancho, alto);

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }


    public boolean isPuntoB() {
        return puntoB;
    }

    public boolean isLineaB() {
        return lineaB;
    }

    public void setPuntoB(boolean puntoB) {
        this.puntoB = puntoB;
    }

    public void setLineaB(boolean lineaB) {
        this.lineaB = lineaB;
    }
}
