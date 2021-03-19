package died.lab01.problema01;

public class Punto {
	//ATRIBUTOS
	private float x, y;
	
	
	
	//CONSTRUCTOR
	
	public Punto(float _x, float _y) {
		this.x = _x;
		this.y = _y;
	}
	
	
	
	//GETTERS - SETTERS
	
	public float getX() {
		return x;
	}



	public void setX(float x) {
		this.x = x;
	}



	public float getY() {
		return y;
	}



	public void setY(float y) {
		this.y = y;
	}
	
	
	
	//OTROS METODOS
	
	public boolean iguales(Object otroPunto) {
		return otroPunto.getClass() == this.getClass()
				&& ((Punto)otroPunto).getX() == this.getX()
				&& ((Punto)otroPunto).getY() == this.getY();
	}
	
}
