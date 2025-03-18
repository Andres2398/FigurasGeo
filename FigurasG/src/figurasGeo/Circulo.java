package figurasGeo;

public class Circulo {
	
	private Punto centro;
	private float radio;
	
	
	
	
	public Punto getCentro() {
		return centro;
	}
	public void setCentro(Punto centro) {
		this.centro = centro;
	}
	public float getRadio() {
		return radio;
	}
	public void setRadio(float radio) {
		this.radio = radio;
	}
	
	public double getArea(){
		
		radio = getRadio();
		
		double area = 3.14*Math.pow(radio, 2);
		return area;
		
	}
	
	public double getCircunferencia() {
		
		radio =getRadio();
		double circunferencia = radio*2*3.14;
		return circunferencia;
	}
	
	
}
