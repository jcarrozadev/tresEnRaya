package es.evg.daw1.tablero;

import es.evg.daw1.interfaz.InterfazTablero;

public class Tablero implements InterfazTablero{
	
	public char [][] tablero;
	
	public Tablero () {
		tablero=new char [3][3];
		vaciarTablero();
	}
	
	public Tablero (char [][] tablero) {
		this.tablero = tablero;
		vaciarTablero();
	}
	
	public void vaciarTablero() {
		for (int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				tablero[i][j]=CASILLA_VACIA;
			}
				
		}
	}
	
	public void setTablero(char[][] tablero) {
		this.tablero = tablero;
	}
	
	public char[][] getTablero() {
		return tablero;
	}
	
	public void visualizarTablero() {
		System.out.println("\n");
		for (int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print("\t"+tablero[i][j]);
			}
			System.out.println();
				
		}
	}

}
