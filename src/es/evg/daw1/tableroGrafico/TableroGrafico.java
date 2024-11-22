package es.evg.daw1.tableroGrafico;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TableroGrafico {

	JFrame jfrFormulario = null;
	JPanel jpnPanel = null;
	
	public JButton [][] jbtTabla = null;
		
	public TableroGrafico() {
		jfrFormulario = new JFrame("Tres en Raya");
		jfrFormulario.setSize(800, 800);
		jfrFormulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jfrFormulario.setVisible(true);
		cargarPanel();
		cargarBotones();
	}

	public TableroGrafico(JFrame jfrFormulario) {
		this.jfrFormulario=jfrFormulario;
		cargarPanel();
		cargarBotones();
	}
		
	public void cargarPanel() {
		
		jpnPanel = new JPanel();
		jpnPanel.setBounds(0, 0,800, 800);
		jpnPanel.setLayout(new GridLayout(3, 3, 0, 0));
		jfrFormulario.add(jpnPanel);
	}
	
	public void cargarBotones() {
		
		jbtTabla = new JButton[3][3];
		for (int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				jbtTabla[i][j]=new JButton();
				jpnPanel.add(jbtTabla[i][j]);
			}
		}
	}
	
}
