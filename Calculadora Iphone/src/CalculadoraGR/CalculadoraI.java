package CalculadoraGR;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculadoraI extends JFrame implements ActionListener{
	
	JLabel title = new JLabel("CALCULADORA GRADOS");
	JLabel l1 = new JLabel("Ingresa Grados: ");
	JLabel l2 = new JLabel("Convercion: ");

	JTextField t1 = new JTextField();
	JTextField t2 = new JTextField();
	
	String[] datos = {"K a C","F a C","C a K","K a F","F a K","F a C"};
	JComboBox cb1 = new JComboBox(datos);
	JButton b1 = new JButton("Calcular");
	
	JPanel p1 = new JPanel();
	public CalculadoraI() {
		setLayout(null);
		p1.setLayout(null);
		p1.setBounds(0,0,350,350);
		
		title.setBounds(100,30,200,35);p1.add(title);
		l1.setBounds(50,100,120,25);p1.add(l1);
		l2.setBounds(50,250,120,25);p1.add(l2);

		cb1.setBounds(100,150,120,25);p1.add(cb1);
		
		t1.setBounds(150,100,120,25);p1.add(t1);
		t2.setBounds(130,250,120,25);p1.add(t2);
		
		b1.setBounds(110,200,120,25);p1.add(b1);
		add(p1);
		b1.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b1) {
			CGObjetos o = new CGObjetos();
			
			o.setGrados(Double.parseDouble(t1.getText()));
			
			t2.setText(""+o.getResultado(cb1.getSelectedIndex()));
		}
	}
	public static void main(String[] args) {
		CalculadoraI i = new CalculadoraI();
		
		i.setTitle("CALCULADORA");;
		i.setVisible(true);
		i.setSize(350,350);
		i.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
