package figurasGeo;

public class Recta {

	private Punto puntoA;
	private Punto puntoB;

	public Recta() {

	}

	public Recta(Punto puntoA, Punto puntoB) {
		this.puntoA = puntoA;
		this.puntoB = puntoB;
	}

	public Punto getPuntoA() {
		return puntoA;
	}

	public void setPuntoA(Punto puntoA) {
		this.puntoA = puntoA;
	}

	public Punto getPuntoB() {
		return puntoB;
	}

	public void setPuntoB(Punto puntoB) {
		this.puntoB = puntoB;
	}

	public double getSegmento() {

		float cordenadaYPuntoA = puntoA.getY();
		float cordenadaXPuntoA = puntoA.getX();
		float cordenadaYPuntoB = puntoB.getY();
		float cordenadaXPuntoB = puntoB.getX();

		double catetoA = Math.pow(cordenadaXPuntoA - cordenadaXPuntoB, 2);
		double catetoB = Math.pow(cordenadaYPuntoA - cordenadaYPuntoB, 2);
		return Math.sqrt(catetoA + catetoB);

	}

	@Override
	public String toString() {
		return "Recta [puntoA=" + puntoA + ", puntoB=" + puntoB + ", segmento:" + getSegmento() + "]";
	}

	public static void main(String[] args) {
		Recta r = new Recta(77f,65f);
		double a = r.getSegmento();
		System.out.println(r.toString());

	}

}
