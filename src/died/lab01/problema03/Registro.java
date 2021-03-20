package died.lab01.problema03;

import died.lab01.problema02.*;

public class Registro {
	//ATRIBUTOS
	
	private String ciudad;
	private Temperatura[] historico;
	private int maxTam = 20, tl = 0;	//atributos para el manejo del arreglo 
	
	
	
	//CONSTRUCTORES
	
	public Registro() {
		this.ciudad = "-";
		this.historico = new Temperatura[maxTam];
	} 
	
	public Registro(String ciudad) {
		this.ciudad = ciudad;
		this.historico = new Temperatura[maxTam];
	}
	
	
	
	//METODOS SOLICITADOS
	
	String getCiudad() {
		return this.ciudad;
	}
	
	public void imprimir() {
		System.out.println("Temperaturas registradas. Ciudad: " + this.ciudad);
		
		/*for (Temperatura i : historico) {
			System.out.println(i.getValor());
		}*/
		
		for (int i=0; i<tl; i++) {
			System.out.println(i+1 + " " + historico[i].toString());
		}
	}
	
	public void agregar(Temperatura t) {
		if (tl < maxTam) {
			this.historico[tl] = t;
			tl++;
		}
	}
	
	public double mediaAsCelcius() {
		double promedio, suma = 0;
		
		for (int i=0; i<tl; i++) {
			suma += this.historico[i].asCelcius();
		}
		
		promedio = suma / tl;
		
		return promedio;
	}
	
	public double mediaAsFahrenheit() {
		double promedio, suma = 0;
		
		for (int i=0; i<tl; i++) {
			suma += this.historico[i].asFahrenheit();
		}
		
		promedio = suma / tl;
		
		return promedio;
	}
	
	public Temperatura maximo() {
		Temperatura max = new Temperatura(-274, Escala.CELCIUS);
		
		for (int i=0; i<tl; i++) {
			if (this.historico[i].asCelcius() > max.asCelcius()) {
				max = this.historico[i];
			} 
		}
		
		return max;
	}
}
