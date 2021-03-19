package died.lab01.problema01;

public class Recta {
	//ATRIBUTOS
	
	private Punto p1, p2;
	
	
	
	//CONSTRUCTORES
		
	public Recta(Punto p1, Punto p2) throws EqualPointsException {
		if (p1.iguales(p2)) {
			throw new EqualPointsException("Los puntos de la recta son iguales");
		}
		
		this.p1 = p1;
		this.p2 = p2;
	}
	
	public Recta() {
		Punto p1 = new Punto(0,0);
		Punto p2 = new Punto(1,1);
		
		this.p1 = p1;
		this.p2 = p2;
	}
	
	
	
	//GETTERS - SETTERS	
	
	public Punto getP1() {
		return p1;
	}

	public void setP1(Punto p1) {
		this.p1 = p1;
	}

	public Punto getP2() {
		return p2;
	}

	public void setP2(Punto p2) {
		this.p2 = p2;
	}
	
	
	
	//OTROS METODOS

	public float pendiente() {
		return (this.p1.getY() - this.p2.getY()) / (this.p1.getX() - this.p2.getX());
	}
	
	
	public boolean paralelas(Recta otraRecta) {
		return this.pendiente() == otraRecta.pendiente();
	}
	
	
	public boolean iguales(Object otraRecta) {
		boolean retorno = false;
		
		if (otraRecta.getClass() == this.getClass()) {
			Punto aux1, aux2;
			Recta rectaAux;
			
			aux1 = this.p1;
			
			if (!(aux1.iguales(((Recta)otraRecta).getP1()))) {
				aux2 = ((Recta)otraRecta).getP1();
			}
			else {
				aux2 = ((Recta)otraRecta).getP2();
			}
			
			try {
				rectaAux = new Recta(aux1, aux2);
				
				if (rectaAux.paralelas(this) && rectaAux.paralelas((Recta)otraRecta)) {
					retorno = true;
				}
			} catch (EqualPointsException e) {
				System.out.println("Los puntos que definen la recta no pueden ser iguales");
			}
			
			
		}
		
		return retorno;
	}
	
}
