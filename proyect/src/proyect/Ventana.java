package proyect;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class Ventana{
	
	private JFrame frame;
	private JPanel panel;
	private JButton btn1,btn2,btn3;
	private JLabel label,label2;
	private List lista;
	private BorderLayout bl;
	private JCheckBox box1;
	private ImageIcon etiquetaIcono;
	
	public Ventana(){
	
		frame = new JFrame("Red de Ordenamiento");	
		panel= new JPanel();
		label= new JLabel("                                ");
		etiquetaIcono = new ImageIcon("nota.png");
		label2 = new JLabel( etiquetaIcono );
		btn1 = new JButton("Construye tu red de ordenamiento");
		btn2 = new JButton();
		btn3 = new java1430("");
		lista =new List();
		bl= new BorderLayout();
		box1 = new JCheckBox("< a >");
		agregar();
	
	}
	public void agregar(){
		frame.setSize(900,500);	
		label2.setBounds(783,352,100,110);
		panel.setLayout(bl);
		panel.add(btn1, BorderLayout.NORTH);
		panel.add(lista, BorderLayout.CENTER);
		panel.add(label, BorderLayout.WEST);
		btn2.setBounds(30,100,30,30);
		btn2.setBackground(Color.pink);
		box1.setBounds(20,380,70,70);
		btn3.setBounds(30,150,30,30);
	    btn3.setBackground(Color.yellow);
	    frame.add(label2);
	    frame.add(btn3);
	    frame.add(box1);
	    frame.add(btn2);
	    frame.add(panel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
