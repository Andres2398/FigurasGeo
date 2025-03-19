package figurasGeo;

public class Piramide {

	private Triangulo base;
	private Punto cuspide;

	public Triangulo getBase() {
		return base;
	}

	public void setBase(Triangulo base) {
		this.base = base;
	}

	public Punto getCuspide() {
		return cuspide;
	}

	public void setCuspide(Punto cuspide) {
		this.cuspide = cuspide;
	}

	public double getAltura() {

		double areaBase = base.getArea();
		double semiperimetro = base.getSemiperimetro();
		double radio = areaBase / semiperimetro;

		Recta recta = new Recta();
		recta.setPuntoA(cuspide);
		recta.setPuntoB(base.getPuntoS());

		double segmento = recta.getSegmento();

		double altura = Math.sqrt(segmento * segmento - radio * radio);

		return altura;
	}

	public double getVolumen() {

		double areaBase = base.getArea();
		double altura = getAltura();
		double volumen = (1 / 3) * areaBase * altura;
		return volumen;

	}

}
