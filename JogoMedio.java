package br.com.poli.PuzzleN;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JogoMedio extends JFrame {

	private JPanel contentPane;
	private int coordX[]=new int[16];
	private int coordY[]=new int[16];
	
	
	public JogoMedio() {
	
		PuzzleMedio jogo = new PuzzleMedio();
		jogo.iniciaPartida();
		jogo.getGridPuzzle().print();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		if(jogo.getGridPuzzle().getCasa(0, 0)!=0){
		JButton Botao0 = new JButton(String.valueOf(jogo.getGridPuzzle().getCasa(0, 0)));
		Botao0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		Botao0.setBounds(50, 50, 100, 100);
		contentPane.add(Botao0);
		}
		
		if(jogo.getGridPuzzle().getCasa(0, 1)!=0){
		JButton Botao1 = new JButton(String.valueOf(jogo.getGridPuzzle().getCasa(0, 1)));
		Botao1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Botao1.setBounds(200, 50, 100, 100);
		contentPane.add(Botao1);
		}
		
		if(jogo.getGridPuzzle().getCasa(0, 2)!=0){
		JButton Botao2 = new JButton(String.valueOf(jogo.getGridPuzzle().getCasa(0, 2)));
		Botao2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Botao2.setBounds(350, 50, 100, 100);
		contentPane.add(Botao2);
		}
		
		if(jogo.getGridPuzzle().getCasa(0, 3)!=0){
		JButton Botao3 = new JButton(String.valueOf(jogo.getGridPuzzle().getCasa(0, 3)));
		Botao3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Botao3.setBounds(500, 50, 100, 100);
		contentPane.add(Botao3);
		}
		
		if(jogo.getGridPuzzle().getCasa(1, 0)!=0){
		JButton Botao4 = new JButton(String.valueOf(jogo.getGridPuzzle().getCasa(1, 0)));
		Botao4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Botao4.setBounds(50, 200, 100, 100);
		contentPane.add(Botao4);
		}
		
		if(jogo.getGridPuzzle().getCasa(1, 1)!=0){
		JButton Botao5 = new JButton(String.valueOf(jogo.getGridPuzzle().getCasa(1, 1)));
		Botao5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Botao5.setBounds(200, 200, 100, 100);
		contentPane.add(Botao5);
		}
		
		if(jogo.getGridPuzzle().getCasa(1, 2)!=0){
		JButton Botao6 = new JButton(String.valueOf(jogo.getGridPuzzle().getCasa(1, 2)));
		Botao6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Botao6.setBounds(350, 200, 100, 100);
		contentPane.add(Botao6);
		}
		
		if(jogo.getGridPuzzle().getCasa(1, 3)!=0){
		JButton Botao7 = new JButton(String.valueOf(jogo.getGridPuzzle().getCasa(1, 3)));
		Botao7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Botao7.setBounds(500, 200, 100, 100);
		contentPane.add(Botao7);
		}
		
		if(jogo.getGridPuzzle().getCasa(2, 0)!=0){
		JButton Botao8 = new JButton(String.valueOf(jogo.getGridPuzzle().getCasa(2, 0)));
		Botao8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Botao8.setBounds(50, 350, 100, 100);
		contentPane.add(Botao8);
		}
		
		if(jogo.getGridPuzzle().getCasa(2, 1)!=0){
		JButton Botao9 = new JButton(String.valueOf(jogo.getGridPuzzle().getCasa(2, 1)));
		Botao9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Botao9.setBounds(200, 350, 100, 100);
		contentPane.add(Botao9);
		}
		
		if(jogo.getGridPuzzle().getCasa(2, 2)!=0){
		JButton Botao10 = new JButton(String.valueOf(jogo.getGridPuzzle().getCasa(2, 2)));
		Botao10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Botao10.setBounds(350, 350, 100, 100);
		contentPane.add(Botao10);
		}
		
		if(jogo.getGridPuzzle().getCasa(2, 3)!=0){
		JButton Botao11 = new JButton(String.valueOf(jogo.getGridPuzzle().getCasa(2, 3)));
		Botao11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Botao11.setBounds(500, 350, 100, 100);
		contentPane.add(Botao11);
		}
		
		if(jogo.getGridPuzzle().getCasa(3, 0)!=0){
		JButton Botao12 = new JButton(String.valueOf(jogo.getGridPuzzle().getCasa(3, 0)));
		Botao12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Botao12.setBounds(50, 500, 100, 100);
		contentPane.add(Botao12);
		}
		
		if(jogo.getGridPuzzle().getCasa(3, 1)!=0){
		JButton Botao13 = new JButton(String.valueOf(jogo.getGridPuzzle().getCasa(3, 1)));
		Botao13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Botao13.setBounds(200, 500, 100, 100);
		contentPane.add(Botao13);
		}
		
		if(jogo.getGridPuzzle().getCasa(3, 2)!=0){
		JButton Botao14 = new JButton(String.valueOf(jogo.getGridPuzzle().getCasa(3, 2)));
		Botao14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Botao14.setBounds(350, 500, 100, 100);
		contentPane.add(Botao14);
		}
		
		if(jogo.getGridPuzzle().getCasa(3, 3)!=0){
		JButton Botao15 = new JButton(String.valueOf(jogo.getGridPuzzle().getCasa(3, 3)));
		Botao15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Botao15.setBounds(500, 500, 100, 100);
		contentPane.add(Botao15);
		}
	}
	public void correcao() {
		coordX[0] = 0;
		coordY[0] = 0;
		
		coordX[1] = 0;
		coordY[1] = 1;
		
		coordX[2] = 0;
		coordY[2] = 2;
		
		coordX[3] = 0;
		coordY[3] = 3;
		
		coordX[4] = 1;
		coordY[4] = 0;
		
		coordX[5] = 1;
		coordY[5] = 1;
		
		coordX[6] = 1;
		coordY[6] = 2;
		
		coordX[7] = 1;
		coordY[7] = 3;
		
		coordX[8] = 2;
		coordY[8] = 0;
		
		coordX[9] = 2;
		coordY[9] = 1;
		
		coordX[10] = 2;
		coordY[10] = 2;
		
		coordX[11] = 2;
		coordY[11] = 3;

		coordX[12] = 3;
		coordY[12] = 0;
		
		coordX[13] = 3;
		coordY[13] = 1;
		
		coordX[14] = 3;
		coordY[14] = 2;
		
		coordX[15] = 3;
		coordY[15] = 3;
	}
}
