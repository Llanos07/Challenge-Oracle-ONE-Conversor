package interfaz_grafica;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import metodos.ConversorMonedas;

public class MenuMonedas extends ConversorMonedas {
	//CONVERSOR DE MONEDAS
	public static void convertirMoneda() {
		// TODO Auto-generated method stub
		String[] monedas = {"Peso","Dólar", "Euro", "Yen", "Libra", "Won"};
		ArrayList<String> opcion = new ArrayList<>();
		
		for(int i1=0; i1 < monedas.length; i1++) {
			for(int i2 = monedas.length-1; i2 > 0; i2--) {
				if(i1 != i2) {
					opcion.add("De " + monedas[i1] + " a " + monedas[i2]);
				}
			}
		}
		Object selectOption = JOptionPane.showInputDialog(null, "Seleccione una opcion", "Conversor Alura", JOptionPane.QUESTION_MESSAGE, null, opcion.toArray(), opcion.toArray()[0]);
		if(selectOption!=null) {
				
				String[] comparador = selectOption.toString().split(" ");
				
				String moneda1 = comparador[1];
				String moneda2 = comparador[3];
				
				Object valor = JOptionPane.showInputDialog(null, "Ingrese una cantidad", "Conversor Alura", JOptionPane.QUESTION_MESSAGE, null, null, null);
				
				if(valor != null ) {
					try {
						Double valorConvertido = convertirMoneda(Double.parseDouble(valor.toString()), moneda1, moneda2);
						JOptionPane.showMessageDialog(null, "El valor en "+moneda2+" es: "+valorConvertido);
						int reply = JOptionPane.showConfirmDialog(null, "¿Desea Continuar?", null, JOptionPane.YES_NO_OPTION);
						if (reply == JOptionPane.YES_OPTION) {
							convertirMoneda();
						} else {
							JOptionPane.showMessageDialog(null, "Programa Terminado");
						    System.exit(0);
						}
						
					}catch (Exception e) {
						JOptionPane.showMessageDialog(null, "Error al leer número, terminando programa...");
						System.exit(0);
					}
				}else {
					JOptionPane.showMessageDialog(null, "Programa Terminado");
					System.exit(0);
				}

		}else {
			JOptionPane.showMessageDialog(null, "Programa Terminado");
			System.exit(0);
		}
	}
	
}
