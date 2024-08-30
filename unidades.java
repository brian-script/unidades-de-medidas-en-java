import java.util.Scanner;


public class unidades{

	public double mm_a_cm(double a){
		double resultado = a / 10;
		return resultado;
	}

	public double cm_a_mm(double a){
		double resultado = a * 10;
		return resultado;
	}

	public double cm_a_m(double a){
		double resultado = a / 100;
		return resultado;
	}

	public double m_a_cm(double a){
		double resultado = a * 100;
		return resultado;
	}

	public double m_a_km(double a){
		double resultado = a / 1000;
		return resultado;
	}

	public double km_a_m(double a){
		double resultado = a * 1000;
		return resultado;
	}

	public static void main(String[] args){
		unidades conversion = new unidades();

		Scanner teclado = new Scanner(System.in);

		System.out.println("*** PROGRAMA DE CONVERSION DE UNIDADES ***\n");

		System.out.println("Elige una de las opciones: \n1.- mm a cm \n2.- cm a mm \n3.- cm a m \n4.- m a cm \n5.- m a km \n6.- km a m");
		System.out.print("Ingresa una de las opciones: ");
		int eleccion = teclado.nextInt();
		System.out.print("Ingresa un valor: ");
		double num = teclado.nextDouble();

		if (eleccion == 1){
			System.out.println("El resultado es: " + conversion.mm_a_cm(num) + "cm");
		}else if (eleccion == 2){
			System.out.println("El resultado es: " + conversion.cm_a_mm(num) + "mm");
		}else if (eleccion == 3){
			System.out.println("El resultado es: " + conversion.cm_a_m(num) + "m");
		}else if (eleccion == 4){
			System.out.println("El resultado es: " + conversion.m_a_cm(num) + "cm");
		}else if (eleccion == 5){
			System.out.println("El resultado es: " + conversion.m_a_km(num) + "km");
		}else if (eleccion == 6){
			System.out.println("El resultado es: " + conversion.km_a_m(num) + "m");
		}
		
	}
}
