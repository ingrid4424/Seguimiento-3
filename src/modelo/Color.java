package modelo;

public class Color{
	
	private int r;
	private int g;
	private int b;
	private boolean isColor;
	
	public Color() {
		this.isColor = false;
	}
	
	public void limpiarColor() {
		this.r = 0;
		this.g = 0;
		this.b = 0;
		this.isColor = false;
	}
	
	public String getFinalColor() {
		String rgb = r + ","+ g +","+ b ;
		return rgb;
	}

	public boolean isColor() {
		return isColor;
	}

	public void setColor(boolean isColor) {
		this.isColor = isColor;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public int getG() {
		return g;
	}

	public void setG(int g) {
		this.g = g;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	
	

}