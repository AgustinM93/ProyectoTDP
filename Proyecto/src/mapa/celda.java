package mapa;

import GUI.GUI;
import Obstaculos.Grass;
import main.gameObject;

public class celda {
	
	private gameObject[] listaObjetosLogicos;
	private map Map;
	private int posX;
	private int posY;
	
	public celda(char tipo, map Mapa, int posX, int posY) {
		
		this.posX=posX;
		this.posY=posY;
		Map=Mapa;
		
		listaObjetosLogicos= new gameObject[5];
			switch(tipo) {
				case 'a':
					listaObjetosLogicos[0]=null;
					break;
					
				case 'p':
					listaObjetosLogicos[2]= new Grass(this,tipo,2);
					break;
			}
			
			
		
	}
	public gameObject[] getObjects(){
		   return listaObjetosLogicos;
	   }
	   public int getPosX(){
		   return posX;
	   }
	   public int getPosY(){
		   return posY;
	   }
	   public celda getCelda(int x, int y){
		   return Map.getCelda(x, y);
	   }
	   
	   
	   public GUI getGui(){
		   return Map.getGui();
	   }
	  
	   /*
	   public void destruirEnemigo(Enemigo e){
		   Map.destruirEnemigo(e);
	   }
	   public void detenerTiempo(){
		   Map.detenerTiempo();
	   }
	   public void eliminarEnemigos(){
		   Map.eliminarEnemigos();
	   }
	   public void aumentarPuntaje(int i){
		   Map.aumentarPuntaje(i);
	   }
	   public void mejorar(){
		   Map.mejorar();
	   }
		
		public void gameOver(){
		Map.gameOver();
		}
	
	*/

}
