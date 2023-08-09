/**
 * 
 */
package interfaz_grafica;

import java.net.http.WebSocket.Listener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

/**
 * 
 */
public class MenuPrincipal {

	/**
	 * @param args
	 */
	
	//MENU PRINCIPAL
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] opciones = {"Monedas","Estatura"};
		//Object seleccion =  JOptionPane.showOptionDialog(null, "Seleccione un conversor", "Conversor Alura", 0, 0, null, opciones, opciones); <- Al imprimir retorna posición en array
		Object seleccion =  JOptionPane.showInputDialog(null, "Seleccione un conversor", "Conversor Alura", JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);
		if(seleccion!=null) {
			switch (seleccion.toString()) {
				case "Monedas":
					MenuMonedas.convertirMoneda();
					break;
				case "Estatura":
					MenuEstatura.convertirEstatura();
					break;
			}
		}else {
			JOptionPane.showMessageDialog(null, "Programa Terminado");
			System.exit(0);
		}
	}
	
	

	

	
	
	

}
