package figurasGeo;

public class Triangulo {

	private Punto puntoS;
	private Punto puntoD;
	private Punto puntoI;

	public Punto getPuntoS() {
		return puntoS;
	}

	public void setPuntoS(Punto puntoS) {
		this.puntoS = puntoS;
	}

	public Punto getPuntoD() {
		return puntoD;
	}

	public void setPuntoD(Punto puntoD) {
		this.puntoD = puntoD;
	}

	public Punto getPuntoI() {
		return puntoI;
	}

	public void setPuntoI(Punto puntoI) {
		this.puntoI = puntoI;
	}

	public double getArea() {

		double rectaA = getSegmento(puntoI, puntoD);
		double rectaB = getSegmento(puntoS, puntoD);
		double rectaC = getSegmento(puntoI, puntoS);
		double semiperimetro = getSemiperimetro();
		double semiA = semiperimetro - rectaA;
		double semiB = semiperimetro - rectaB;
		double semiC = semiperimetro - rectaC;
		double partB = semiperimetro * semiA * semiB * semiC;
		double area = Math.sqrt(partB);
		return area;
		

	}
	
	public double getSemiperimetro() {
		double rectaA = getSegmento(puntoI, puntoD);
		double rectaB = getSegmento(puntoS, puntoD);
		double rectaC = getSegmento(puntoI, puntoS);
		
		
		return (rectaA + rectaB + rectaC) / 2;
	}

	public double getSegmento(Punto puntoA, Punto puntoB) {

		float cordenadaYPuntoA = puntoA.getY();
		float cordenadaXPuntoA = puntoA.getX();
		float cordenadaYPuntoB = puntoB.getY();
		float cordenadaXPuntoB = puntoB.getX();

		double catetoA = Math.pow(cordenadaXPuntoA - cordenadaXPuntoB, 2);
		double catetoB = Math.pow(cordenadaYPuntoA - cordenadaYPuntoB, 2);
		return Math.sqrt(catetoA + catetoB);
	}

}
