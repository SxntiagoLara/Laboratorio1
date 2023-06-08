package ClaseSinMetodos;

import javax.swing.JOptionPane;

public class ClaseSinMetodos {

	public static void main(String[] args) {

		//Se crean la variables con su tipo
		String cadena;
		double ladoA;
		double ladoB;
		double resultado;
		
		//Se inicializan las variables, parseando cada una de ellas
		cadena= JOptionPane.showInputDialog(null,"Ingrese la longitud del lado A:");
		ladoA = Double.parseDouble(cadena);
		
		cadena= JOptionPane.showInputDialog(null,"Ingrese la longitud del lado B:");
		ladoB = Double.parseDouble(cadena);
		
		//Realizamos la operación que necesitamos y finalmente imprimimos el resultado
		resultado= ladoA * ladoB;
		JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);

	}

}
