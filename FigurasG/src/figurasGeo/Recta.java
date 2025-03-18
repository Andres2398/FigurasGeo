package figurasGeo;

public class Recta {
	
	private Punto puntoA;
	private Punto PuntoB;
	
	
	
	
	public Punto getPuntoA() {
		return puntoA;
	}
	public void setPuntoA(Punto puntoA) {
		this.puntoA = puntoA;
	}
	public Punto getPuntoB() {
		return PuntoB;
	}
	public void setPuntoB(Punto puntoB) {
		PuntoB = puntoB;
	}
	
	public double getSegmento() {
		
		float cordenadaYPuntoA = puntoA.getY();
		float cordenadaXPuntoA = puntoA.getX();
		float cordenadaYPuntoB = PuntoB.getY();
		float cordenadaXPuntoB = PuntoB.getX();
		
		
		double catetoA= Math.pow(cordenadaXPuntoA-cordenadaXPuntoB,2);
		double catetoB= Math.pow(cordenadaYPuntoA-cordenadaYPuntoB,2);
		return Math.sqrt(catetoA+catetoB);
		
	}
	

}
