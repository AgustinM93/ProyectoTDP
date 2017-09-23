package main;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.border.EmptyBorder;

import GUI.GUI;
import Personajes.Jugador;
import Personajes.jugadorBasico;
import mapa.map;

public class Juego {
	
	private static GUI frame;
	private Jugador jugador;

	public static void main(String[] args) {
		

		new Juego();
	}

	
	public Juego() {
		
		jugador= new jugadorBasico(null, 1);
		pantallaPrincipal();
	}
	
	
	public void pantallaPrincipal(){
		
		/*final JFrame mainTitle=new JFrame("GOT");
		   mainTitle.setVisible(true);
		   mainTitle.setResizable(false);
		   mainTitle.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		   mainTitle.setBounds(100, 100, 1280, 720);
		   mainTitle.setLocationRelativeTo(null);
		   JLayeredPane contentPane=new JLayeredPane();
		   contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		   mainTitle.setContentPane(contentPane);
		   contentPane.setLayout(null);
		  
		   
		  */ 
		   
		   crearGUI();
		   /*
		   JLabel fondo=new JLabel(new ImageIcon(this.getClass().getResource("/Archivos/fondo.jpg")));
	  	   fondo.setBounds(0, 0, 1280, 720);
	  	   mainTitle.add(fondo,new Integer(0));
		*/
		
	}
	
	public void crearGUI(){
		 
		  
		   
		   frame=new GUI(this);
		   new map(frame,jugador,this);
		   frame.setVisible(true);
	   }
}
