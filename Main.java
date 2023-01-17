public class Main{
	public static void main(String args[]){

		//Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.

		int numeroIf = 4;
		if (numeroIf > 0) {
			System.out.println("El número es positivo");
			} else if (numeroIf < 0) {
			System.out.println("El número es negativo");
			} else {
			System.out.println("El número es 0");
		}

		int numeroWhile = -1;

		while (numeroWhile < 3) {
			System.out.println(numeroWhile + ", ");
			numeroWhile++;
		}

		do {
			System.out.println(numeroWhile + ", ");
			break;
		} while (numeroWhile < 3);

		for (int i = 0; i <= 3; i++) {
			System.out.println(i);
		}

		String estacion = "otro";
		
		switch (estacion) {
			case "primavera":
				System.out.println("La estación es primavera");
			break;

			case "verano":
				System.out.println("La estación es verano");
			break;

			case "otoño":
				System.out.println("La estación es otoño");
			break;

			case "invierno":
				System.out.println("La estación es invierno");
			break;

			default:
				System.out.println("El valor no es una estación");
		}
	}
}

/*

Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro
estaciones del año. Dependiendo del valor de la variable estacion se deberá mandar un mensaje por
consola informando de la estación en la que está. También habrá que poner un default para cuando
el valor de la variable no sea una estación.*/