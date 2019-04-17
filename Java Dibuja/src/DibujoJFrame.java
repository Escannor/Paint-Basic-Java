import com.sun.xml.internal.ws.api.databinding.ClientCallBridge;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;


public class DibujoJFrame extends JFrame {
    private JButton colorButton;
    private JButton backgroundButton;
    private JPanel panel1;
    private Color color;
    private Color pincelColor;
    private JRadioButton puntosRadioButton;
    private JRadioButton lineasRadioButton;
    private JComboBox comboBox1;
    private DibujoJPanel lienzo = new DibujoJPanel();
    private OpcionesJPanel opciones = new OpcionesJPanel();
    //private JPanel DibujoJPanel;


    /*private void createUIComponents() {

    }*/

        public DibujoJFrame(String title, Integer width, Integer height) {
            //DibujoJPanel lienzo = new DibujoJPanel();
            //panel1.add(opciones, BorderLayout.SOUTH);
            panel1.add(lienzo);
            add(panel1);
            setTitle(title);
            setSize(width,height);
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

            //panel1.add(JPanel);
            puntosRadioButton.setSelected(true);

            //colorButton.addActionListener((ActionListener) this);
            colorButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    //JOptionPane.showMessageDialog(null,"Boton color");

                    JColorChooser Selectorcolor=new JColorChooser();
                    pincelColor=Selectorcolor.showDialog(null, "Seleccione un Color", Color.BLUE);
                    lienzo.color = pincelColor;

                }
            });

            backgroundButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    //JOptionPane.showMessageDialog(null,"Boton color");

                    JColorChooser Selectorcolor=new JColorChooser();
                    color=Selectorcolor.showDialog(null, "Seleccione un Color", Color.BLUE);
                    lienzo.setBackground(color);
                }
            });

            /*
            EventQueue.invokeLater(new Runnable() {
                public void run() {
                    try {
                        DibujoJFrame frame = new DibujoJFrame();
                        frame.setVisible(true);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });*/

            this.setVisible(true);
            lineasRadioButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                }
            });

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
            });
            comboBox1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println("Seleccion de grosor");
                    //lienzo.diametro = (comboBox1.getSelectedIndex()) * 5;
                    lienzo.diametro = Integer.valueOf(comboBox1.getSelectedItem().toString());
                    //lienzo.diametro = 20;
                }
            });
        } ///Final del constructor

        /*colorButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"boton Color");
        }
    });*/

        //colorButton


}
