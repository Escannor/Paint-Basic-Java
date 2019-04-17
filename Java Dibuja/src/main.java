import javax.swing.*;

///Programa hecho por Arturo Casillas Diaz
///El 23/03/2019
////Paint básico que dibuja línes y puntos

public class main {
    public static void main (String []args) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {

        if (JOptionPane.showConfirmDialog(null,"Te gustaria usar el UI de tu sistema operativo?") == 0) {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        DibujoJFrame dibujo;
        dibujo = new DibujoJFrame("Paint",1000,700);
        //dibujo.getContentPane().addMouseListener(new DibujoJPanel());
        //dibujo.setVisible(true);
    }
}
