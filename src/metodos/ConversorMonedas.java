package metodos;

public class ConversorMonedas {
	
	protected static Double convertirMoneda (Double valor, String moneda1, String moneda2) {
		Double valorConvertido = 0.0;
		
		switch(moneda1) {
		case "Peso":
			switch(moneda2) {
			case "Dólar":
				valorConvertido = valor*0.0012;
				break;
			case "Euro":
				valorConvertido = valor*0.0011;
				break;
			case "Libra":
				valorConvertido = valor*0.00091;
				break;
			case "Yen":
				valorConvertido = valor*0.17;
				break;
			case "Won":
				valorConvertido = valor*1.53;
				break;
			}
			
			break;
		case "Dólar":
			switch(moneda2) {
			case "Peso":
				valorConvertido = valor*860.46;
				break;
			case "Euro":
				valorConvertido = valor*0.91;
				break;
			case "Libra":
				valorConvertido = valor*0.78;
				break;
			case "Yen":
				valorConvertido = valor*143.21;
				break;
			case "Won":
				valorConvertido = valor*1318.52;
				break;
			}
			
			break;
		case "Euro":
			switch(moneda2) {
			case "Dólar":
				valorConvertido = valor*1.10;
				break;
			case "Peso":
				valorConvertido = valor*943.45;
				break;
			case "Libra":
				valorConvertido = valor*0.86;
				break;
			case "Yen":
				valorConvertido = valor*156.99;
				break;
			case "Won":
				valorConvertido = valor*1445.58;
				break;
			}
			
			break;
		case "Libra":
			switch(moneda2) {
			case "Dólar":
				valorConvertido = valor*1.27;
				break;
			case "Euro":
				valorConvertido = valor*1.16;
				break;
			case "Peso":
				valorConvertido = valor*1096.93;
				break;
			case "Yen":
				valorConvertido = valor*182.68;
				break;
			case "Won":
				valorConvertido = valor*1680.81;
				break;
			}
			
			break;
		case "Yen":
			switch(moneda2) {
			case "Dólar":
				valorConvertido = valor*0.0070;
				break;
			case "Euro":
				valorConvertido = valor*0.0064;
				break;
			case "Libra":
				valorConvertido = valor*0.0055;
				break;
			case "Peso":
				valorConvertido = valor*6.01;
				break;
			case "Won":
				valorConvertido = valor*9.20;
				break;
			}
			
			break;
		case "Won":
			switch(moneda2) {
			case "Dólar":
				valorConvertido = valor*0.00076;
				break;
			case "Euro":
				valorConvertido = valor*0.00069;
				break;
			case "Libra":
				valorConvertido = valor*0.00059;
				break;
			case "Yen":
				valorConvertido = valor*0.11;
				break;
			case "Peso":
				valorConvertido = valor*0.65;
				break;
			}
			
			break;
		}
		
		return valorConvertido;
		
	}
	
	
}
