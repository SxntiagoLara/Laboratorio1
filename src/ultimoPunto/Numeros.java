package ultimoPunto;

import javax.swing.JOptionPane;

public class Numeros {
	// Asignamos los valores de numer y i que son por defecto. neg y par son contadores que se inicializan en 0.
			
			int numer,i, neg = 0, par = 0;
			
			/* En el método entrada tenemos un ciclo for que se ejecutará 5 veces */
			public void entrada() {
				for (i = 0; i < 5; i++) {
					numer = enterData("Digite un número");
					if (numer % 2 == 0) {
						par++;
					}
					if (numer < 0) {
						neg++;
					}
				}
				JOptionPane.showMessageDialog(null, "El número de números pares es: " + par + "\n"
						+ "Y el número de números negativos es: " + neg);
			}

			public static int enterData(String mensaje) {
				String cadena;
				int valor;
				cadena = JOptionPane.showInputDialog(null, mensaje);
				valor = Integer.parseInt(cadena);
				return valor;
			}

		
}

	
