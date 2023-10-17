package formcalculadora;

import java.text.DecimalFormat;

public class Code {
    public double num1;
    public double num2;
    public double res;
    public String ope;
    

    public String getOpe() {
		return ope;
	}

	public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public void setOpe(String ope) {
        this.ope = ope;
    }

    public double getRes() {
        if (ope != null) {
            switch (ope) {
                case "+":
                    res= num1 + num2;
                    break;
                case "-":
                	res= num1 - num2;
                	break;
                case "*":
                	res= num1 * num2;
                	break;
                case "/":
                	res= num1 / num2;
                	break;
                
                case "√":
                	
                	res= Math.sqrt(num1);
                	break;
                case "^":
                	res = Math.pow(num1, num2);
                    DecimalFormat df = new DecimalFormat("#.######"); 
                    res = Double.parseDouble(df.format(res)); 
                    break;
                case "!": 
                	
                    res = calcularFactorial((int) num1);
                    break;
                    default:
                    	
                    break;
            }
        } 
		return res;
    }
    public long calcularFactorial(int numero) {
	    if (numero == 0) {
	        return 1;
	    } else {
	        return numero * calcularFactorial(numero - 1);
	    }
	}
}
