import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OpcionesJPanel extends JPanel{
    private JRadioButton puntosRadioButton;
    private JRadioButton lineasRadioButton;
    private JComboBox grosor;

    /*
    puntosRadioButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Puntos activado");
            lineasRadioButton.setSelected(false);
            lienzo.setLineaB(false);
            lienzo.setPuntoB(true);
        }
    });

    lineasRadioButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Lineas activado");
            puntosRadioButton.setSelected(false);
            lienzo.setLineaB(true);
            lienzo.setPuntoB(false);
        }
    });*/


    public OpcionesJPanel() {
        add(puntosRadioButton);
        add(lineasRadioButton);
        add(grosor);
        puntosRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Puntos activado");
                //lienzo.setLineaB(false);
                //lienzo.setPuntoB(true);
            }
        });
        lineasRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Lineas activado");
            }
        });
        grosor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
