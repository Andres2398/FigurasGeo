package numeros;

public class Racional {
	private float numerador;
	private float denominador;

	public Racional() {

	}

	public Racional(float numerador) {

		this.numerador = numerador;
	}

	public Racional(float numerador, float denominador) {

		this.numerador = numerador;
		this.denominador = denominador;
	}

	public float getNumerador() {
		return numerador;
	}

	public void setNumerador(float numerador) {
		this.numerador = numerador;
	}

	public float getDenominador() {
		return denominador;
	}

	public void setDenominador(float denominador) {
		this.denominador = denominador;
	}

	public Racional getSumar(Racional b) {

		float denominadorA = this.getDenominador();
		float numeradorA = this.getNumerador();
		float denominadorB = b.getDenominador();
		float numeradorB = b.getNumerador();
		Racional c = new Racional(numeradorA + numeradorB, denominadorA + denominadorB);

		;
		return c.getSimplificar();

	}

	public Racional getMultiplicar(Racional b) {

		float denominadorA = this.getDenominador();
		float numeradorA = this.getNumerador();
		float denominadorB = b.getDenominador();
		float numeradorB = b.getNumerador();

		Racional c = new Racional(numeradorA * denominadorB, denominadorA * numeradorB);

		return c.getSimplificar();
	}

	private Racional getSimplificar() {
		
		
		
		
		return null;
	}

	@Override
	public String toString() {
		return "Racional [ " + numerador + " / " + denominador + " ]";
	}

	public static void main(String[] args) {
		Racional a = new Racional(8, 4);
		a.toString();

		Racional b = new Racional(4, 6);

		Racional s = a.getSumar(b);
		
		Racional m = a.getMultiplicar(b);
		
	}

}
