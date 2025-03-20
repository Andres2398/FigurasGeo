package numeros;

public class Racional {
	private int numerador;
	private int denominador;

	public Racional() {

	}

	public Racional(int numerador) {

		this.numerador = numerador;
		this.denominador=1;
		getSimplificar();
	}

	public Racional(int numerador, int denominador) {

		this.numerador = numerador;
		this.denominador = denominador;
		getSimplificar();
	}

	public int getNumerador() {
		return numerador;
	}

	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}

	public int getDenominador() {
		return denominador;
	}

	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}

	public Racional getSumar(Racional b) {

		int denominadorA = this.getDenominador();
		int numeradorA = this.getNumerador();
		int denominadorB = b.getDenominador();
		int numeradorB = b.getNumerador();
		Racional c = new Racional(numeradorA + numeradorB, denominadorA + denominadorB);

		;
		return c;

	}

	public Racional getMultiplicar(Racional b) {

		int denominadorA = this.getDenominador();
		int numeradorA = this.getNumerador();
		int denominadorB = b.getDenominador();
		int numeradorB = b.getNumerador();

		Racional c = new Racional(numeradorA * denominadorB, denominadorA * numeradorB);

		return c;

	}

	private void getSimplificar() {

		int n1 = this.denominador;
		int n2 = this.numerador;

		while (n1 != n2) {
			if (n1 > n2)
				n1 -= n2;

			else
				n2 -= n1;

		}

		this.numerador /= n1;
		this.denominador /= n1;

	}

	@Override
	public String toString() {
		return "Racional [ " + this.numerador + " / " + this.denominador + " ]";
	}

	public static void main(String[] args) {
		Racional a = new Racional(8, 4);
		a.toString();

		Racional b = new Racional(4, 6);

		Racional s = a.getSumar(b);

		Racional m = a.getMultiplicar(b);
		
		

	}

}
