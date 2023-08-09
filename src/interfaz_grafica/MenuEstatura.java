package interfaz_grafica;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import metodos.ConversorEstatura;

public class MenuEstatura extends ConversorEstatura{
	//CONVERSOR DE ESTATURA
	public static void convertirEstatura() {
		
		String[] medidas = {"centímetros","pulgadas", "pies"};
		ArrayList<String> opcion = new ArrayList<>();
		
		for(int i1=0; i1 < medidas.length; i1++) {
			for(int i2 = medidas.length-1; i2 > 0; i2--) {
				if(i1 != i2) {
					opcion.add("De " + medidas[i1] + " a " + medidas[i2]);
				}
			}
		}
		
		Object selectOption = JOptionPane.showInputDialog(null, "Seleccione una opcion", "Conversor Alura", JOptionPane.QUESTION_MESSAGE, null, opcion.toArray(), opcion.toArray()[0]);
		
		if(selectOption!=null) {
			String[] comparador = selectOption.toString().split(" ");
			
			String estatura1 = comparador[1];
			String estatura2 = comparador[3];
			
			Object valor = JOptionPane.showInputDialog(null, "Ingrese una cantidad", "Conversor Alura", JOptionPane.QUESTION_MESSAGE, null, null, null);
			
			if(valor != null ) {
				try {
					Double valorConvertido = convertirEstatura(Double.parseDouble(valor.toString()), estatura1, estatura2);
					JOptionPane.showMessageDialog(null, "El valor en "+estatura2+" es: "+valorConvertido);
					int reply = JOptionPane.showConfirmDialog(null, "¿Desea Continuar?", null, JOptionPane.YES_NO_OPTION);
					if (reply == JOptionPane.YES_OPTION) {
						convertirEstatura();
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
