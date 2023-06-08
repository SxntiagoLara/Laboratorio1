package DosClases;

import javax.swing.JOptionPane;

public class PrimeraClase {
	
	
	//Creamos la variables con su tipo
			private double ladoA;
			private double ladoB;
			
			
			public PrimeraClase() {
				iniciar();
			}
			
			public void iniciar(){
				ingDatos();
			}
			
			// Creamos el método ingresarDatos para ingresar y guardar en una variable
			public void ingDatos() {
				String cadena;
				
				cadena = JOptionPane.showInputDialog(null, "Ingrese la longitud del lado A:");
				ladoA = Double.parseDouble(cadena);
				
				cadena = JOptionPane.showInputDialog(null, "Ingrese la longitud del lado B:");
				ladoB = Double.parseDouble(cadena);
				calcularArea();
			}

			// Creamos un metodo para calcular el area y finalmente imprimirlo
			public void calcularArea() {
				double resultado; 
				
				resultado = ladoA * ladoB;
				
				JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
			}


}
