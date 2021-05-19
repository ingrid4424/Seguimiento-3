import processing.core.PApplet;

public class Btn {

	private int posX;
	private int posY;
	private int tamX;
	private int tamY;
	private String textoInterno;
	private PApplet app;
	
	
	public Btn(int posX, int posY, int tamX, int tamY, String textoInterno, PApplet app) {
		super();
		this.posX = posX;
		this.posY = posY;
		this.tamX = tamX;
		this.tamY = tamY;
		this.textoInterno = textoInterno;
		this.app = app;
	}
	
	public void pintar() {
		this.app.fill(255,140,103);
		this.app.rect(posX, posY, tamX, tamY);
		this.app.fill(0);
		this.app.textSize(24);
		this.app.text(textoInterno, posX, posY);
	}


	public boolean isHover() {
        boolean isSobre = false;
      
        if (
            this.app.mouseX > (this.posX - (this.tamX / 2)) &&
            this.app.mouseX < (this.posX + (this.tamX / 2)) &&
            this.app.mouseY > (this.posY - (this.tamY / 2)) &&
            this.app.mouseY < (this.posY + (this.tamY / 2))
        ) {
            isSobre = true;
        }
        return isSobre;
    }
}
