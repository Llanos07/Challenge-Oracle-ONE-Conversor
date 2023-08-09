package metodos;

public class ConversorEstatura {
	
	protected static Double convertirEstatura (Double valor, String estatura1, String estatura2) {
		Double valorConvertido = 0.0;
		switch(estatura1) {
		case "centímetros":
			switch(estatura2) {
			case "pulgadas":
				valorConvertido = valor*0.393701;
				break;
			case "pies":
				valorConvertido = valor*0.0328084;
				break;
			}
			break;
		case "pulgadas":
			switch(estatura2) {
			case "centímetros":
				valorConvertido = valor*2.54;
				break;
			case "pies":
				valorConvertido = valor*0.0833333;
				break;
			}
			break;
		case "pies":
			switch(estatura2) {
			case "centímetros":
				valorConvertido = valor*30.48;
				break;
			case "pulgadas":
				valorConvertido = valor*12;
				break;
			}
			break;
		}
		return valorConvertido;
	}

}
