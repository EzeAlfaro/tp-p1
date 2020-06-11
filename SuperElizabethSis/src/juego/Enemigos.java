package juego;

import java.awt.Color;
import java.awt.Image;

import entorno.Entorno;
import entorno.Herramientas;

public final class Enemigos {
	private double x;
	private double y;
	private double alto;
	private double ancho;
	private Image imagen;
	
	
	public Enemigos(double x, double y, double alto, double ancho) {
		this.x=x;
		this.y=y;
		this.alto=alto;
		this.ancho=ancho;
		this.imagen = Herramientas.cargarImagen("enemigo.png");
	}
	
	public void dibujar(Entorno e){
		
		e.dibujarImagen(imagen, this.x, this.y, 0);
	
		//e.dibujarRectangulo(this.x,this.y,this.ancho,this.alto,0,Color.yellow);
	}

	public void mover() {
		this.x-=1;
		
	}

	public void moverderecha() {
		this.x+=1;
	}
	public void moverarriba() {
		this.y-=1;
	}
	public void moverabajo() {
		this.y+=1;
	}
}
