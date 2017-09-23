package Personajes;

import mapa.celda;

public class Jugador extends Personajes{
	
	protected int frecuencia_disparos;
	private int alto;
	private int ancho;
	protected Jugador j;
	
	
	public Jugador(celda c, int profundidad){
    	alto=26;
    	ancho=26;
    	cell=c;
    	this.profundidad=profundidad;			
    }
	
	 public int getAlto(){
    	 return alto;
     }
     public int getAncho(){
    	 return ancho;
     }
     
     public int getFrecuenciaDisparos(){
    	 return frecuencia_disparos;
     }
     
     
    

}
