package numeros;

import java.util.Arrays;

public class Enteros {
	int[] arrayA;
	int[] arrayB;

	public Enteros() {

	}

	public Enteros(int[] a, int[] b) {
		this.arrayA = a;
		this.arrayB = b;

	}

	public int[] getArrayA() {
		return arrayA;
	}

	public void setArrayA(int[] arrayA) {
		this.arrayA = arrayA;
	}

	public int[] getArrayB() {
		return arrayB;
	}

	public void setArrayB(int[] arrayB) {
		this.arrayB = arrayB;
	}

	public void getAdd() {
		
		
		
	}

	@Override
	public String toString() {
		return "Enteros [arrayA=" + Arrays.toString(arrayA) + ", arrayB=" + Arrays.toString(arrayB) + "]";
	}

	public static void main(String[] args) {
		Enteros e = new Enteros(new int[5], new int[6]);
		System.out.println(e);
	}
}
