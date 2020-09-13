
package lab4;

import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Esteban
 */
public class Ventana extends JFrame {
    public Ventana() {
        super("Titulo de ventana");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container cp = getContentPane();
        GridLayout gl = new GridLayout(4,3);
        gl.setHgap(5); 
        gl.setVgap(5);
        cp.setLayout(gl);
        JLabel nombreAutor = new JLabel("Nombre del Autor: ");
        JLabel nombreRepo = new JLabel("Nombre del Repositorio: ");
        JTextField texto = new JTextField(20);
        JTextField texto2 = new JTextField(20);
        JButton boton = new JButton("Ingresar.");
        cp.add(nombreAutor);
        cp.add(texto2);
        cp.add(nombreRepo);
        cp.add(texto);
        cp.add(boton);
    }
    
}
