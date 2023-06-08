import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		//Se crean las variables con su respectivo tipo 
		double ladoA;
		double ladoB;
		
		// Utilizamos los metodos para ingresar los datos y que este valor ingresado se guarde en las variables
		ladoA = ingresarDatos("Ingrese la longitud del lado A: ");
		ladoB = ingresarDatos("Ingrese la longitud del lado B: ");
		
		// Pasamos las variables como parametro al metodo calcular area
		calcularArea(ladoA, ladoB);
	}

	private static double ingresarDatos(String mensaje) {
		/* Cuando se envían los valores de ladoA y ladoB al método ingresarDatos, se recibe un String que contiene los datos
		 * y se almacena en una variable llamada mensaje. Este valor, que contiene los datos, se convierte y se almacena
		 * en la variable valor, que se devuelve en la línea 29. */
		String cadena;
		double valor;
		
		cadena = JOptionPane.showInputDialog(null, mensaje);
		valor = Double.parseDouble(cadena);
		return valor;
	}

	private static void calcularArea(double a, double b) {
		// Se reciben los valores de ladoA y ladoB desde el método main, se almacenan en las variables a y b,
		// Se crea la variable resultado y después se inicializa multiplicando los valores a y b para que finalmente
		//podamos imprimir este resultado.
		double resultado;
		
		resultado = a * b;
		
		JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);

	}

}
