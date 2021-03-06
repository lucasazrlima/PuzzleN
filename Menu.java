package br.com.poli.PuzzleN;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Menu extends JFrame {

	private JPanel contentPane;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
 	public Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel textoMenu = new JLabel("Puzzle N");
		textoMenu.setBounds(94, 50, 379, 87);
		contentPane.add(textoMenu);
		
		JButton botaoFacil = new JButton("Facil");
		botaoFacil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JogoFacil jogo = new JogoFacil();
				jogo.correcao();
		        jogo.setVisible(true); 
		        dispose();
			}
		});
		botaoFacil.setBounds(231, 173, 89, 23);
		contentPane.add(botaoFacil);
		
		JButton botaoMedio = new JButton("Medio");
		botaoMedio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JogoMedio jogo = new JogoMedio();
				jogo.correcao();
				System.out.println("aaaa");
				jogo.setVisible(true);
				dispose();
				}
		});
		botaoMedio.setBounds(231, 207, 89, 23);
		contentPane.add(botaoMedio);
		
		JButton botaoDificil = new JButton("Dificil");
		botaoDificil.setBounds(231, 241, 89, 23);
		contentPane.add(botaoDificil);
	}
}
