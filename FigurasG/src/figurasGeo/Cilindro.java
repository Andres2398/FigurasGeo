package figurasGeo;

public class Cilindro {
	
	private Circulo base;
	private float altura;
	
	
	
	
	public Circulo getBase() {
		return base;
	}
	public void setBase(Circulo base) {
		this.base = base;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}

	public double getVolumen(){
		
		double radio = base.getRadio();
		double volumen= 3.14*Math.pow(radio, 2)*altura;
		return volumen;
		
	}
	public double getAreaBase() {
		
		double radio = base.getRadio();
		double area = base.getRadio();
		double volumen= 3.14*Math.pow(radio, 2);
		return area;
		
		
	}
	
	
	
}
