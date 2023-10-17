package CalculadoraGR;

public class CGObjetos {
	double grados,R;
	
	public void setGrados(double grados) {
		this.grados = grados;
	}
	public double getResultado(int menu) {
		switch(menu) {
		case 0:
			R= (grados - 273);
			break;
		case 1:
			R= 5*(grados - 32)/9;
			break;
		case 2:
			R= (grados + 273);
			break;
		case 3:
			R= 9*(grados - 273)+32;
			break;
		case 4:
			R= (9*grados)+32/5;
			break;
		}
		return R;
	}
}
