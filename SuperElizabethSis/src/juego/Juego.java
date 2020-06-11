package juego;


import java.awt.Color;


import entorno.Entorno;
import entorno.InterfaceJuego;

public class Juego extends InterfaceJuego
{
	// El objeto Entorno que controla el tiempo y otros
	private Entorno entorno;
	
	// Variables y métodos propios de cada grupo
	// ...
	//double tick;
	//double diametro;
	
	Fondo fondo;
	Princesa princesa;
	Nube[] nube;
	Enemigos[] enemigos;
	Piso piso;
	Obstaculos[] obstaculos;
	
	Juego()
	{
		// Inicializa el objeto entorno
		this.entorno = new Entorno(this, "Super Elizabeth Sis - Grupo ... - v1", 800, 600);
		
		// Inicializar lo que haga falta para el juego
		// ...
		//this.tick=0;
		//this.diametro=1;
		this.princesa   = new Princesa(150,384,90,70);
		this.piso       = new Piso(400,725,350,800);//(400,600,350,800
		this.fondo      = new Fondo(400,300,600,800);
		
		this.obstaculos = new Obstaculos[10];
		for(int i=0;i<this.obstaculos.length; i++) {
			this.obstaculos[i]= new Obstaculos (600+(400*i),380,90,70);
		}
		this.enemigos   = new Enemigos[10];//(700,400,90,70);
		for(int i=0;i<this.enemigos.length; i++) {
			this.enemigos[i]= new Enemigos (700+(400*i),400 ,90,70);
		}
		
		this.nube       = new Nube[10];
		for(int i=0;i<this.nube.length; i++) {
			this.nube[i]= new Nube (300+(400*i),100 ,50,70);
		}
			//	(300,100,50,70);
		
		
		
		
		
		//this.bola= new Bola(300,100,50,70);
		
		// Inicia el juego!
		this.entorno.iniciar();
	}

	/**
	 * Durante el juego, el método tick() será ejecutado en cada instante y 
	 * por lo tanto es el método más importante de esta clase. Aquí se debe 
	 * actualizar el estado interno del juego para simular el paso del tiempo 
	 * (ver el enunciado del TP para mayor detalle).
	 */
	public void tick()
	{
		
		
		this.fondo.dibujar(this.entorno);
		
		//piso
		
		this.piso.dibujar(this.entorno);
		
		
		// Procesamiento de un instante de tiempo
		// ...
		
		
		if(this.entorno.estaPresionada(this.entorno.TECLA_IZQUIERDA)) {
		this.princesa.moverizquierda();}
		
		if(this.entorno.estaPresionada(this.entorno.TECLA_DERECHA)) {
			this.princesa.moverderecha();}
		
		if(this.entorno.estaPresionada(this.entorno.TECLA_ARRIBA)) {
			this.princesa.moverarriba();}
		
		if(this.entorno.estaPresionada(this.entorno.TECLA_ABAJO)) {
			this.princesa.moverabajo();}
		
	
		this.princesa.dibujar(this.entorno);
		
		//nubes
		for(int i = 0; i < this.nube.length; i++) {
		this.nube[i].mover();
		this.nube[i].dibujar(this.entorno);
		}
		
				//enemigos
				for(int i =0; i<this.nube.length;i++) {
				this.enemigos[i].mover();
				this.enemigos[i].dibujar(this.entorno);
				}
				//obstaculos
				for(int i =0; i<this.obstaculos.length;i++) {
				this.obstaculos[i].mover();
				this.obstaculos[i].dibujar(this.entorno);
				}
				//bola
				
				//this.bola.dibujar(this.entorno);
				
		//if (tick % 500 ==0) {
			//diametro=diametro+10;
		//this.entorno.dibujarCirculo(400, 300, diametro++, Color.blue);
		//this.entorno.dibujarCirculo(600, 300, diametro++, Color.white);
		//this.entorno.escribirTexto("hola", 100, 300);
		}

	
	

	@SuppressWarnings("unused")
	public static void main(String[] args)
	{
		Juego juego = new Juego();
	}
}
