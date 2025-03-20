package figurasGeo;

public class Punto {
	
	// atributos
	private float x;
	private float y;
	
	//comportamiento
	
	
	
	public float getX() {
		return x;
	}
	public Punto(float x, float y) {
		this.x = x;
		this.y = y;
	}
	public void setX(float x) {
		this.x = x;
	}
	public float getY() {
		return y;
	}
	public void setY(float y) {
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "Punto [x=" + x + ", y=" + y + "]";
	}
	
	
	
	
	       

}
