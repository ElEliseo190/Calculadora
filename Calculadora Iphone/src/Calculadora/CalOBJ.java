package Calculadora;

import javax.swing.JFrame;
import java.lang.*;

public class CalOBJ extends JFrame {
	double num1, num2, resu, cos, sin;
	int menu;

	public void setNum1(double num1) {
		this.num1 = num1;
	}

	public double getCos() {
		return cos;
	}

	public void setCos(double cos) {
		this.cos = cos;
	}

	public double getSin() {
		return sin;
	}

	public void setSin(double sin) {
		this.sin = sin;
	}

	public void setNum2(double num2) {
		this.num2 = num2;
	}

	public double getresu() {
		switch (menu) {
		case 0:
			resu = num1 + num2;
			break;
		case 1:
			resu = num1 - num2;
			break;
		case 2:
			resu = num1 * num2;
			break;
		case 3:
			resu = num1 / num2;
			break;
		case 4:
			resu = Math.cos(num1);
			break;
		case 5:
			resu = Math.sin(num1);
			break;
		}

		return resu;

	}

	public void setMenu(int menu) {
		this.menu = menu;
	}
}
