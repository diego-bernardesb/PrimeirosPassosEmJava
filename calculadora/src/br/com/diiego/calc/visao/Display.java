package br.com.diiego.calc.visao;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

import br.com.diiego.calc.MemoriaObservador;
import br.com.diiego.calc.modelo.Memoria;

@SuppressWarnings("serial")
public class Display extends JPanel implements MemoriaObservador{


	private final JLabel label; 
	
	public Display() {
		Memoria.getInstancia().adicionarObservador(this);
		
		setBackground(new Color(46, 49, 50));
		label = new JLabel(Memoria.getInstancia().getTextoAtual());
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Monospaced", Font.PLAIN, 40));
		
		setLayout(new FlowLayout(FlowLayout.RIGHT, 7, 38));
		
		add(label);
		
	}
	
	@Override
	public void valorAlterado(String novoValor) {
		label.setText(novoValor);
	}
}
