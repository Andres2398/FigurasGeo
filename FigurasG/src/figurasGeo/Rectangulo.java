package figurasGeo;

public class Rectangulo {

	private Punto puntoSD;
	private Punto puntoIE;

	public Punto getPuntoSD() {
		return puntoSD;
	}

	public void setPuntoSD(Punto puntoSD) {
		this.puntoSD = puntoSD;
	}

	public Punto getPuntoIE() {
		return puntoIE;
	}

	public void setPuntoIE(Punto puntoIE) {
		this.puntoIE = puntoIE;
	}

	public Punto getPuntoSI() {

		float y = puntoSD.getY();
		float x = puntoIE.getX();
		Punto puntoSI = null;
		puntoSI.setX(x);
		puntoSI.setY(y);
		return puntoSI;

	}

	public Punto getPuntoID() {

		float x = puntoSD.getX();
		float y = puntoIE.getY();
		Punto puntoID = null;
		puntoID.setX(x);
		puntoID.setY(y);
		return puntoID;

	}
	
	public double getSegemento() {
		
		Punto puntoID=getPuntoID();
		
		float cordenadaYPuntoIE = puntoIE.getY();
		float cordenadaXPuntoIE = puntoIE.getX();
		float cordenadaYPuntoID = puntoID.getY();
		float cordenadaXPuntoID = puntoID.getX();
		
		
		double catetoA= Math.pow(cordenadaXPuntoIE-cordenadaXPuntoID,2);
		double catetoB= Math.pow(cordenadaYPuntoIE-cordenadaYPuntoID,2);
		return Math.sqrt(catetoA+catetoB);
		
		
		
	}
	
	public double getArea() {
		double recta = getSegemento();
		return recta*recta;
	}
}
