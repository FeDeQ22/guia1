package died.lab01.problema01;

public class App {

	public static void main(String[] args) {
		Punto p1 = new Punto(1,1);
		Punto p2 = new Punto(2,2);
		
		try {
			Recta r1 = new Recta(p1,p2);
			
			System.out.println("La pendiente de la recta 1 es " + r1.pendiente());
			
			Punto p3 = new Punto(3,3);
			
			try {
				Recta r2 = new Recta(p2,p3);
				
				System.out.println("r1 y r2 representan la misma recta? " + r1.iguales(r2));
			} catch (EqualPointsException e) {
				System.out.println("Los puntos que definen la recta no pueden ser iguales");
			}
		} catch (EqualPointsException e) {
			System.out.println("Los puntos que definen la recta no pueden ser iguales");
		}
		
		
		
		
		
		
	}

}
