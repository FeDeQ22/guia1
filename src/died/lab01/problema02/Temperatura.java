package died.lab01.problema02;

public class Temperatura {
	//ATRIBUTOS
	
	private double valor;
	private Escala escala;
	
	
	
	//CONSTRUCTORES
	
	public Temperatura() {
		this.valor = 0;
		this.escala = Escala.CELCIUS;
	}
	
	public Temperatura(double valor, Escala escala) {
		this.valor = valor;
		this.escala = escala;
	}
	
	
	
	//GETTERS - SETTERS

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Escala getEscala() {
		return escala;
	}

	public void setEscala(Escala escala) {
		this.escala = escala;
	}
	
	
	
	//METODOS SOLICITADOS
	
	public String toString() {
		String cadena;
		
		cadena = String.valueOf(this.valor) + " ";
		
		if (this.escala == Escala.CELCIUS) {
			cadena += "C°";
		} else {
			cadena += "F°";
		}
		
		return cadena;
	}
	
	
	public double asCelcius() {
		if (this.escala == Escala.CELCIUS) {
			return this.valor;
		} else {
			return convertToCelcius(this.valor);
		}
	}
	
	
	public double asFahrenheit() {
		if (this.escala == Escala.FAHRENHEIT) {
			return this.valor;
		} else {
			return convertToFahrenheit(this.valor);
		}
	}
	
	
	public void aumentar(Temperatura temperatura) {
		if (temperatura.valor > 0) {
			switch (this.escala) {
			case CELCIUS:
				this.valor += temperatura.asCelcius();
				break;
			case FAHRENHEIT:
				this.valor += temperatura.asFahrenheit();
				break;
			}
		} else {
			System.out.println("El valor ingresado por parametro debe ser positivo");
		}
	}
	
	public void disminuir(Temperatura temperatura) {
		if (temperatura.valor > 0) {
			switch (this.escala) {
			case CELCIUS:
				this.valor -= temperatura.asCelcius();
				break;
			case FAHRENHEIT:
				this.valor -= temperatura.asFahrenheit();
				break;
			}
		} else {
			System.out.println("El valor ingresado por parametro debe ser positivo");
		}
	}
		
	
	
	//OTROS METODOS
	
	public static double convertToCelcius(double temperatura) {
		return (temperatura - 32) * (5.0 / 9.0);
	}
	
	public static double convertToFahrenheit(double temperatura) {
		return temperatura * (9.0 / 5.0) + 32;
	}
}
