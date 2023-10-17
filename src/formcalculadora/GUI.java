package formcalculadora;

import javax.swing.*;
import java.text.DecimalFormat;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame implements ActionListener {
	JPanel p1 = new JPanel();
	JTextField t1 = new JTextField("0");

	JButton b1 = new JButton("C");
	JButton b2 = new JButton("!");
	JButton b3 = new JButton("√");
	JButton b4 = new JButton("^");

	JButton b6 = new JButton("7");
	JButton b7 = new JButton("8");
	JButton b8 = new JButton("9");
	JButton b9 = new JButton("x");

	JButton b11 = new JButton("4");
	JButton b12 = new JButton("5");
	JButton b13 = new JButton("6");
	JButton b14 = new JButton("-");

	JButton b16 = new JButton("1");
	JButton b17 = new JButton("2");
	JButton b18 = new JButton("3");
	JButton b19 = new JButton("+");

	JButton b21 = new JButton("π");
	JButton b22 = new JButton("0");
	JButton b23 = new JButton(".");
	JButton b24 = new JButton("=");
	JButton b25 = new JButton("/");

	Code c = new Code();

	public GUI() {
		Font font = new Font("Arial", Font.BOLD, 30);

		setLayout(null);
		p1.setLayout(null);
		p1.setBounds(0, 0, 200, 350);
		add(p1);

		t1.setBounds(0, 0, 200, 75);
		t1.setHorizontalAlignment(JTextField.RIGHT);
		t1.setEditable(false);
		t1.setFont(font);
		p1.add(t1);

		b1.setBounds(0, 75, 50, 50);
		p1.add(b1);
		b2.setBounds(50, 75, 50, 50);
		p1.add(b2);
		b3.setBounds(100, 75, 50, 50);
		p1.add(b3);
		b4.setBounds(150, 75, 50, 50);
		p1.add(b4);

		b6.setBounds(0, 125, 50, 50);
		p1.add(b6);
		b7.setBounds(50, 125, 50, 50);
		p1.add(b7);
		b8.setBounds(100, 125, 50, 50);
		p1.add(b8);
		b9.setBounds(150, 125, 50, 50);
		p1.add(b9);

		b11.setBounds(0, 175, 50, 50);
		p1.add(b11);
		b12.setBounds(50, 175, 50, 50);
		p1.add(b12);
		b13.setBounds(100, 175, 50, 50);
		p1.add(b13);
		b14.setBounds(150, 175, 50, 50);
		p1.add(b14);

		b16.setBounds(0, 225, 50, 50);
		p1.add(b16);
		b17.setBounds(50, 225, 50, 50);
		p1.add(b17);
		b18.setBounds(100, 225, 50, 50);
		p1.add(b18);
		b19.setBounds(150, 225, 50, 50);
		p1.add(b19);

		b22.setBounds(0, 275, 50, 50);
		p1.add(b22);
		b23.setBounds(50, 275, 50, 50);
		p1.add(b23);
		b24.setBounds(100, 275, 50, 50);
		p1.add(b24);
		b25.setBounds(150, 275, 50, 50);
		p1.add(b25);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b11.addActionListener(this);
		b12.addActionListener(this);
		b13.addActionListener(this);
		b14.addActionListener(this);
		b16.addActionListener(this);
		b17.addActionListener(this);
		b18.addActionListener(this);
		b19.addActionListener(this);
		b21.addActionListener(this);
		b22.addActionListener(this);
		b23.addActionListener(this);
		b24.addActionListener(this);
		b25.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		// borrar
		String cade = t1.getText();
		if (e.getSource() == b1) {
		    if (b1.getText().equals("C")) {
		        if (!cade.equals("0")) {
		            t1.setText(cade.substring(0, cade.length() - 1));
		            if (cade.length() <= 1) {
		                t1.setText("0");
		            }
		        }
		    } else if (b1.getText().equals("CE")) {
		        t1.setText("0");
		        b1.setText("C");
		    }
		}

		// numeros
		if (e.getSource() == b22) {
			if (cade.equals("0")) {
			} else {
				cade = cade + "0";
				t1.setText(cade);
			}
		}
		if (e.getSource() == b16) {
			if (cade.equals("0")) {
				cade = "1";
			} else {
				cade = cade + "1";
			}
			t1.setText(cade);
		}
		if (e.getSource() == b17) {
			if (cade.equals("0")) {
				cade = "2";
			} else {
				cade = cade + "2";
			}
			t1.setText(cade);
		}
		if (e.getSource() == b18) {
			if (cade.equals("0")) {
				cade = "3";
			} else {
				cade = cade + "3";
			}
			t1.setText(cade);
		}
		if (e.getSource() == b11) {
			if (cade.equals("0")) {
				cade = "4";
			} else {
				cade = cade + "4";
			}
			t1.setText(cade);
		}
		if (e.getSource() == b12) {
			if (cade.equals("0")) {
				cade = "5";
			} else {
				cade = cade + "5";
			}
			t1.setText(cade);
		}
		if (e.getSource() == b13) {
			if (cade.equals("0")) {
				cade = "6";
			} else {
				cade = cade + "6";
			}
			t1.setText(cade);
		}
		if (e.getSource() == b6) {
			if (cade.equals("0")) {
				cade = "7";
			} else {
				cade = cade + "7";
			}
			t1.setText(cade);
		}
		if (e.getSource() == b7) {
			if (cade.equals("0")) {
				cade = "8";
			} else {
				cade = cade + "8";
			}
			t1.setText(cade);
		}
		if (e.getSource() == b8) {
			if (cade.equals("0")) {
				cade = "9";
			} else {
				cade = cade + "9";
			}
			t1.setText(cade);
		}

		// operaciones
		String ope;
		if (e.getSource() == b3) {
		    String cadena = t1.getText();
		    if (!cadena.equals("0")) {
		        double numero = Double.parseDouble(cadena);
		        c.setNum1(numero);
		        c.setOpe("√");
		        double resultado = c.getRes();
		        DecimalFormat df = new DecimalFormat("#.######"); 
		        t1.setText(df.format(resultado)); 
		        b1.setText("CE");
		    }
		}
		if (e.getSource() == b2) {
			String cadena = t1.getText();
			if (!cadena.equals("0")) {
				double numero = Double.parseDouble(cadena);
				c.setNum1(numero);
				c.setOpe("!");
				double resultado = c.getRes();
				DecimalFormat df = new DecimalFormat("#.######"); 
				t1.setText(df.format(resultado)); 
				b1.setText("CE");
			}
		}

		if (e.getSource() == b4) {
			ope = "^";
			cade = t1.getText() + "^";
			t1.setText(cade);
			c.setOpe(ope);
		}
		
		if (e.getSource() == b19) {
			ope = "+";
			cade = t1.getText() + "+";
			t1.setText(cade);
			c.setOpe(ope);
		}
		if (e.getSource() == b14) {
			ope = "-";
			cade = t1.getText() + "-";
			t1.setText(cade);
			c.setOpe(ope);
		}
		if (e.getSource() == b9) {
			ope = "*";
			cade = t1.getText() + "x";
			t1.setText(cade);
			c.setOpe(ope);
		}
		if (e.getSource() == b25) {
			ope = "/";
			cade = t1.getText() + "÷";
			t1.setText(cade);
			c.setOpe(ope);
		}
		

		String[] partes = cade.split("[-+x÷^]");

		if (partes.length == 2) {
			String parte1 = partes[0];
			String parte2 = partes[1];

			double valor1 = Double.parseDouble(parte1);
			double valor2 = Double.parseDouble(parte2);
			c.setNum1(valor1);
			c.setNum2(valor2);

		}

		if (e.getSource() == b24) {

			try {
				Integer res = (int) c.getRes();
				String resC = String.valueOf(res);
				t1.setText(resC);
				b1.setText("CE");
			} catch (Exception e2) {
				t1.setText("Error");
			}
		}

	}

	public static void main(String[] args) {
		GUI c = new GUI();
		c.setTitle("Calculadora");
		c.setSize(215, 360);
		c.setLocationRelativeTo(null);
		c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c.setVisible(true);
	}
}
