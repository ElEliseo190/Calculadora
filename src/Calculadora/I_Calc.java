package Calculadora;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.AbstractBorder;
import javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardDownRightHandler;

public class I_Calc extends JFrame implements ActionListener{

	// VARIABLES
	String datos = "";
	CalOBJ o = new CalOBJ();
	// PANTALLA DE RESULTADOS
	JTextField t1 = new JTextField ("0");
	
	// BOTONES DE LOS NUMEROS
	JPanel p1 = new JPanel();
	JButton b0 = new JButton("0");
	JButton b1 = new JButton("1");
	JButton b2 = new JButton("2");
	JButton b3 = new JButton("3");
	JButton b4 = new JButton("4");
	JButton b5 = new JButton("5");
	JButton b6 = new JButton("6");
	JButton b7 = new JButton("7");
	JButton b8 = new JButton("8");
	JButton b9 = new JButton("9");
	
	// BOTONES DE LOS SIMBOLOS

	JButton bsum = new JButton("+");
	JButton bres = new JButton("-");
	JButton bmul = new JButton("x");
	JButton bdiv = new JButton("/");
	JButton bigu = new JButton("=");
	JButton bpun = new JButton(".");
	
	// BOTONES CIENTIFICOS

	JButton bCOS = new JButton("ᶜᵒ");
	JButton bSIN = new JButton("ˢⁱ");
	JButton bC = new JButton("C");
	
	public I_Calc() {
		setLayout(null);
		p1.setLayout(null);
		p1.setBounds(0,0,300,400);
		p1.setBackground(Color.black);
		// PANTALLA DE RESULTADOS
		
		t1.setBackground(Color.BLACK);
		t1.setForeground(Color.white);
		t1.setEditable(false);
		t1.setHorizontalAlignment(JTextField.RIGHT);
		t1.setBounds(20,50,196,50);p1.add(t1);
		
		// NUMEROS DE LA CALCULADORA
		b0.setBackground(Color.DARK_GRAY);
		b0.setForeground(Color.white);
		b0.setHorizontalAlignment(JTextField.LEFT);
		b0.setBounds(20,290,95,35); p1.add(b0);
		
		
		
		
		b1.setBackground(Color.DARK_GRAY);
		b1.setForeground(Color.white);
		b1.setBounds(20,250,45,35); p1.add(b1);
		b2.setBackground(Color.DARK_GRAY);
		b2.setForeground(Color.white);
		b2.setBounds(70,250,45,35); p1.add(b2);
		b3.setBackground(Color.DARK_GRAY);
		b3.setForeground(Color.white);
		b3.setBounds(120,250,45,35); p1.add(b3);
		b4.setBackground(Color.DARK_GRAY);
		b4.setForeground(Color.white);
		b4.setBounds(20,210,45,35); p1.add(b4);
		b5.setBackground(Color.DARK_GRAY);
		b5.setForeground(Color.white);
		b5.setBounds(70,210,45,35); p1.add(b5);
		b6.setBackground(Color.DARK_GRAY);
		b6.setForeground(Color.white);
		b6.setBounds(120,210,45,35); p1.add(b6);
		b7.setBackground(Color.DARK_GRAY);
		b7.setForeground(Color.white);
		b7.setBounds(20,170,45,35); p1.add(b7);
		b8.setBackground(Color.DARK_GRAY);
		b8.setForeground(Color.white);
		b8.setBounds(70,170,45,35); p1.add(b8);
		b9.setBackground(Color.DARK_GRAY);
		b9.setForeground(Color.white);
		b9.setBounds(120,170,45,35); p1.add(b9);
		
		// SIMBOLOS DE LA CALCULADORA
		bigu.setBackground(Color.orange);
		bigu.setForeground(Color.white);
		bigu.setBounds(170,290,45,35);p1.add(bigu);	
		bsum.setBackground(Color.orange);
		bsum.setForeground(Color.white);
		bsum.setBounds(170,250,45,35);p1.add(bsum);	
		bres.setBackground(Color.orange);
		bres.setForeground(Color.white);
		bres.setBounds(170,210,45,35);p1.add(bres);
		bmul.setBackground(Color.orange);
		bmul.setForeground(Color.white);	
		bmul.setBounds(170,170,45,35);p1.add(bmul);	
		bdiv.setBackground(Color.orange);
		bdiv.setForeground(Color.white);
		bdiv.setBounds(170,130,45,35);p1.add(bdiv);	
		bpun.setBackground(Color.DARK_GRAY);
		bpun.setForeground(Color.white);
		bpun.setBounds(120,290,45,35);p1.add(bpun);
		
		// FUNCIONES CALCULADORA CIENTIFI
		bC.setBackground(Color.gray);
		bC.setForeground(Color.white);	
		bC.setBounds(20,130,45,35);p1.add(bC);	
		bSIN.setBackground(Color.gray);
		bSIN.setForeground(Color.white);
		bSIN.setBounds(70,130,45,35);p1.add(bSIN);
		bCOS.setBackground(Color.gray);
		bCOS.setForeground(Color.white);
		bCOS.setBounds(120,130,45,35);p1.add(bCOS);	
		add(p1);
		
		
		
		b0.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		
		bC.addActionListener(this);
		bpun.addActionListener(this);
		bsum.addActionListener(this);
		bigu.addActionListener(this);
		bres.addActionListener(this);
		bmul.addActionListener(this);
		bdiv.addActionListener(this);
		bCOS.addActionListener(this);
		bSIN.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == bC) {
			bsum.setBackground(Color.orange);
			bsum.setForeground(Color.white);
			
			bres.setBackground(Color.orange);
			bres.setForeground(Color.white);
			
			bmul.setBackground(Color.orange);
			bmul.setForeground(Color.white);
			
			bdiv.setBackground(Color.orange);
			bdiv.setForeground(Color.white);

			bCOS.setBackground(Color.gray);
			bCOS.setForeground(Color.white);
			t1.setText("0");
			datos = "";
		}
		
		if(e.getSource() == b1) {
			datos += "1";
			t1.setText(datos);
		} if(e.getSource() == b2) {
			datos += "2";
			t1.setText(datos);
		} if(e.getSource() == b3) {
			datos += "3";
			t1.setText(datos);
		} if(e.getSource() == b4) {
			datos += "4";
			t1.setText(datos);
		}if(e.getSource() == b5) {
			datos += "5";
			t1.setText(datos);
		}if(e.getSource() == b6) {
			datos += "6";
			t1.setText(datos);
		}if(e.getSource() == b7) {
			datos += "7";
			t1.setText(datos);
		}if(e.getSource() == b8) {
			datos += "8";
			t1.setText(datos);
		}if(e.getSource() == b9) {
			datos += "9";
			t1.setText(datos);
		}if(e.getSource() == b0) {
			datos += "0";
			t1.setText(datos);
		}if(e.getSource() == bpun) {
			datos += ".";
			t1.setText(datos);
		}
		

		if(e.getSource() == bsum) {
			bsum.setBackground(Color.white);
			bsum.setForeground(Color.orange);
			o.setMenu(0);
			o.setNum1(Double.parseDouble(datos));
			datos = "";
		}
		if(e.getSource() == bres) {
			bres.setBackground(Color.white);
			bres.setForeground(Color.orange);
			o.setMenu(1);
			o.setNum1(Double.parseDouble(datos));
			datos = "";
		}
		if(e.getSource() == bmul) {
			bmul.setBackground(Color.white);
			bmul.setForeground(Color.orange);
			o.setMenu(2);
			o.setNum1(Double.parseDouble(datos));
			datos = "";
		}
		if(e.getSource() == bdiv) {
			bdiv.setBackground(Color.white);
			bdiv.setForeground(Color.orange);
			o.setMenu(3);
			o.setNum1(Double.parseDouble(datos));
			datos = "";
		}
		if(e.getSource() == bCOS) {
			o.setMenu(4);
			o.setNum1(Double.parseDouble(datos));
			t1.setText(""+o.getresu());
			datos = "";
		}
		if(e.getSource() == bSIN) {
			o.setMenu(5);
			o.setNum1(Double.parseDouble(datos));
			t1.setText(""+o.getresu());
			datos = "";
		}
		if(e.getSource() == bigu) {

			bsum.setBackground(Color.orange);
			bsum.setForeground(Color.white);
			
			bres.setBackground(Color.orange);
			bres.setForeground(Color.white);
			
			bmul.setBackground(Color.orange);
			bmul.setForeground(Color.white);
			
			bdiv.setBackground(Color.orange);
			bdiv.setForeground(Color.white);
			
			o.setNum2(Double.parseDouble(datos));
			t1.setText(""+o.getresu());
			datos = "";
		}
	}

	public static void main(String[] args) {
		I_Calc i = new I_Calc();
		
		Image icon = new ImageIcon("src\\Calculadora\\icon.png").getImage();
        i.setIconImage(icon);
        
		i.setResizable(false);
		i.setVisible(true);
		i.setTitle("Calculadora");
		i.setSize(250,400);
		i.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
