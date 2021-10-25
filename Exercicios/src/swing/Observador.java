package swing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Observador {

	public static void main(String[] args) {
		
		JFrame janela = new JFrame("Observador");
		janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//aplica a funcionalidade de fechar a janela
		janela.setSize(600, 400);//dimensiona o tamanho da janela
		janela.setLayout(new FlowLayout()); //define o layout
		janela.setLocationRelativeTo(null);//centraliza a janela com a tela
		
		JButton botao = new JButton("Clicar");
		janela.add(botao);
		
		botao.addActionListener(e -> {
			System.out.println("Clicou no botão!!!");
		});
		
		janela.setVisible(true);
		
		
	}
}
