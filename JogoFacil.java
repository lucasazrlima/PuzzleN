package br.com.poli.PuzzleN;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JogoFacil extends JFrame {

	private JPanel contentPane;
	/*criei 2 arrays pra colocar a coordenada de cada botao, pq como eles se movem as suas coordenadas tem q trocar
	 pois na funcao de executar o movimento ele pede a coordenada atual do botao. 
	 */
	private int coordX[]=new int[9];
	private int coordY[]=new int[9];
	public JogoFacil() {
		
		PuzzleFacil jogo = new PuzzleFacil();
		jogo.iniciaPartida();
		jogo.getGridPuzzle().print();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		if(jogo.getGridPuzzle().getCasa(0, 0)!=0){
		JButton Botao0 = new JButton(String.valueOf(jogo.getGridPuzzle().getCasa(0, 0)));
		Botao0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			int direcao = jogo.getGridPuzzle().executaMovimento(coordX[0], coordY[0]);	
			jogo.getGridPuzzle().print();	
			if(direcao==1){
	    		Botao0.setLocation(Botao0.getLocation().x, Botao0.getLocation().y-175);
	    		coordX[0] = coordX[0]-1;		
	    	}
	    	else if(direcao==2) {
	    		Botao0.setLocation(Botao0.getLocation().x+175, Botao0.getLocation().y);
	    		coordY[0] = coordY[0]+1;
	    	}
	    	else if(direcao==3) {
	    		Botao0.setLocation(Botao0.getLocation().x, Botao0.getLocation().y+175);
	    		coordX[0] = coordX[0]+1;
	    	}
	    	else if(direcao==4) {
	    		Botao0.setLocation(Botao0.getLocation().x-175, Botao0.getLocation().y);
	    		coordY[0] = coordY[0]-1;
	    	}
			if(jogo.isFimDeJogo()==true) {
				System.out.print("aaaaaa");
				dispose();
			}
		}
		});
		Botao0.setBounds(75, 75, 100, 100);
		contentPane.add(Botao0);	
		}
		
		
		if(jogo.getGridPuzzle().getCasa(0, 1)!=0) {
		JButton Botao1 = new JButton(String.valueOf(jogo.getGridPuzzle().getCasa(0, 1)));
		Botao1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int direcao = jogo.getGridPuzzle().executaMovimento(coordX[1], coordY[1]);	
				jogo.getGridPuzzle().print();
				if(direcao==1){
		    		Botao1.setLocation(Botao1.getLocation().x, Botao1.getLocation().y-175);
		    		coordX[1] = coordX[1]-1;		
		    	}
		    	else if(direcao==2) {
		    		Botao1.setLocation(Botao1.getLocation().x+175, Botao1.getLocation().y);
		    		coordY[1] = coordY[1]+1;
		    	}
		    	else if(direcao==3) {
		    		Botao1.setLocation(Botao1.getLocation().x, Botao1.getLocation().y+175);
		    		coordX[1] = coordX[1]+1;
		    	}
		    	else if(direcao==4) {
		    		Botao1.setLocation(Botao1.getLocation().x-175, Botao1.getLocation().y);
		    		coordY[1] = coordY[1]-1;
		    	}
				if(jogo.isFimDeJogo()==true) {
					System.out.print("aaaaaa");
					dispose();
				}
			}
		});
		Botao1.setBounds(250, 75, 100, 100);
		contentPane.add(Botao1);	
		}
		
		
		if(jogo.getGridPuzzle().getCasa(0, 2)!=0) {
		JButton Botao2 = new JButton(String.valueOf(jogo.getGridPuzzle().getCasa(0, 2)));
		Botao2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int direcao = jogo.getGridPuzzle().executaMovimento(coordX[2], coordY[2]);	
				jogo.getGridPuzzle().print();
				if(direcao==1){
		    		Botao2.setLocation(Botao2.getLocation().x, Botao2.getLocation().y-175);
		    		coordX[2] = coordX[2]-1;		
		    	}
		    	else if(direcao==2) {
		    		Botao2.setLocation(Botao2.getLocation().x+175, Botao2.getLocation().y);
		    		coordY[2] = coordY[2]+1;
		    	}
		    	else if(direcao==3) {
		    		Botao2.setLocation(Botao2.getLocation().x, Botao2.getLocation().y+175);
		    		coordX[2] = coordX[2]+1;
		    	}
		    	else if(direcao==4) {
		    		Botao2.setLocation(Botao2.getLocation().x-175, Botao2.getLocation().y);
		    		coordY[2] = coordY[2]-1;
		    	}
				if(jogo.isFimDeJogo()==true) {
					System.out.print("aaaaaa");
					dispose();
				}
			}
		});
		Botao2.setBounds(425, 75, 100, 100);
		contentPane.add(Botao2);
		}
		
		
		if(jogo.getGridPuzzle().getCasa(1, 0)!=0) {
		JButton Botao3 = new JButton(String.valueOf(jogo.getGridPuzzle().getCasa(1, 0)));
		Botao3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int direcao = jogo.getGridPuzzle().executaMovimento(coordX[3], coordY[3]);	
				jogo.getGridPuzzle().print();
				if(direcao==1){
		    		Botao3.setLocation(Botao3.getLocation().x, Botao3.getLocation().y-175);
		    		coordX[3] = coordX[3]-1;		
		    	}
		    	else if(direcao==2) {
		    		Botao3.setLocation(Botao3.getLocation().x+175, Botao3.getLocation().y);
		    		coordY[3] = coordY[3]+1;
		    	}
		    	else if(direcao==3) {
		    		Botao3.setLocation(Botao3.getLocation().x, Botao3.getLocation().y+175);
		    		coordX[3] = coordX[3]+1;
		    	}
		    	else if(direcao==4) {
		    		Botao3.setLocation(Botao3.getLocation().x-175, Botao3.getLocation().y);
		    		coordY[3] = coordY[3]-1;
		    	}
				if(jogo.isFimDeJogo()==true) {
					System.out.print("aaaaaa");
					dispose();
				}
			}
		});
		Botao3.setBounds(75, 250, 100, 100);
		contentPane.add(Botao3);
		}
		
		
		if(jogo.getGridPuzzle().getCasa(1, 1)!=0) {
		JButton Botao4 = new JButton(String.valueOf(jogo.getGridPuzzle().getCasa(1, 1)));
		Botao4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int x = jogo.getGridPuzzle().executaMovimento(coordX[4], coordY[4]);	
				jogo.getGridPuzzle().print();
				if(x==1){
					Botao4.setLocation(Botao4.getLocation().x, Botao4.getLocation().y-175);
		    		coordX[4] = coordX[4]-1;		
		    	}
		    	else if(x==2) {
		    		Botao4.setLocation(Botao4.getLocation().x+175, Botao4.getLocation().y);
		    		coordY[4] = coordY[4]+1;
		    	}
		    	else if(x==3) {
		    		Botao4.setLocation(Botao4.getLocation().x, Botao4.getLocation().y+175);
		    		coordX[4] = coordX[4]+1;
		    	}
		    	else if(x==4) {
		    		Botao4.setLocation(Botao4.getLocation().x-175, Botao4.getLocation().y);
		    		coordY[4] = coordY[4]-1;
		    	}
				if(jogo.isFimDeJogo()==true) {
					System.out.print("aaaaaa");
					dispose();
				}
		
			}
		});
		Botao4.setBounds(250, 250, 100, 100);
		contentPane.add(Botao4);
		}
		
		
		if(jogo.getGridPuzzle().getCasa(1, 2)!=0) {
		JButton Botao5 = new JButton(String.valueOf(jogo.getGridPuzzle().getCasa(1, 2)));
		Botao5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int x = jogo.getGridPuzzle().executaMovimento(coordX[5], coordY[5]);	
				jogo.getGridPuzzle().print();
				if(x==1){
					Botao5.setLocation(Botao5.getLocation().x, Botao5.getLocation().y-175);
		    		coordX[5] = coordX[5]-1;		
		    	}
		    	else if(x==2) {
		    		Botao5.setLocation(Botao5.getLocation().x+175, Botao5.getLocation().y);
		    		coordY[5] = coordY[5]+1;
		    	}
		    	else if(x==3) {
		    		Botao5.setLocation(Botao5.getLocation().x, Botao5.getLocation().y+175);
		    		coordX[5] = coordX[5]+1;
		    	}
		    	else if(x==4) {
		    		Botao5.setLocation(Botao5.getLocation().x-175, Botao5.getLocation().y);
		    		coordY[5] = coordY[5]-1;
		    	}
				if(jogo.isFimDeJogo()==true) {
					System.out.print("aaaaaa");
					dispose();
				}
			}
		});
		Botao5.setBounds(425, 250, 100, 100);
		contentPane.add(Botao5);
		}
		
		
		if(jogo.getGridPuzzle().getCasa(2, 0)!=0){
		JButton Botao6 = new JButton(String.valueOf(jogo.getGridPuzzle().getCasa(2, 0)));
		Botao6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int direcao = jogo.getGridPuzzle().executaMovimento(coordX[6], coordY[6]);	
				jogo.getGridPuzzle().print();
				if(direcao==1){
		    		Botao6.setLocation(Botao6.getLocation().x, Botao6.getLocation().y-175);
		    		coordX[6] = coordX[6]-1;		
		    	}
		    	else if(direcao==2) {
		    		Botao6.setLocation(Botao6.getLocation().x+175, Botao6.getLocation().y);
		    		coordY[6] = coordY[6]+1;
		    	}
		    	else if(direcao==3) {
		    		Botao6.setLocation(Botao6.getLocation().x, Botao6.getLocation().y+175);
		    		coordX[6] = coordX[6]+1;
		    	}
		    	else if(direcao==4) {
		    		Botao6.setLocation(Botao6.getLocation().x-175, Botao6.getLocation().y);
		    		coordY[6] = coordY[6]-1;
		    	}
				if(jogo.isFimDeJogo()==true) {
					System.out.print("aaaaaa");
					dispose();
				}
			}
		});
		Botao6.setBounds(75, 425, 100, 100);
		contentPane.add(Botao6);
		}
		
		
		if(jogo.getGridPuzzle().getCasa(2, 1)!=0) {
		JButton Botao7 = new JButton(String.valueOf(jogo.getGridPuzzle().getCasa(2, 1)));
		Botao7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int direcao = jogo.getGridPuzzle().executaMovimento(coordX[7], coordY[7]);	
				jogo.getGridPuzzle().print();	
				if(direcao==1){
		    		Botao7.setLocation(Botao7.getLocation().x, Botao7.getLocation().y-175);
		    		coordX[7] = coordX[7]-1;		
		    	}
		    	else if(direcao==2) {
		    		Botao7.setLocation(Botao7.getLocation().x+175, Botao7.getLocation().y);
		    		coordY[7] = coordY[7]+1;
		    	}
		    	else if(direcao==3) {
		    		Botao7.setLocation(Botao7.getLocation().x, Botao7.getLocation().y+175);
		    		coordX[7] = coordX[7]+1;
		    	}
		    	else if(direcao==4) {
		    		Botao7.setLocation(Botao7.getLocation().x-175, Botao7.getLocation().y);
		    		coordY[7] = coordY[7]-1;
		    	}
				if(jogo.isFimDeJogo()==true) {
					System.out.print("aaaaaa");
					dispose();
				}
			}
		});
		Botao7.setBounds(250, 425, 100, 100);
		contentPane.add(Botao7);
		}
		
		
		if(jogo.getGridPuzzle().getCasa(2, 2)!=0) {
		JButton Botao8 = new JButton(String.valueOf(jogo.getGridPuzzle().getCasa(2, 2)));
		Botao8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int direcao = jogo.getGridPuzzle().executaMovimento(coordX[8], coordY[8]);	
				jogo.getGridPuzzle().print();
				if(direcao==1){
		    		Botao8.setLocation(Botao8.getLocation().x, Botao8.getLocation().y-175);
		    		coordX[8] = coordX[8]-1;		
		    	}
		    	else if(direcao==2) {
		    		Botao8.setLocation(Botao8.getLocation().x+175, Botao8.getLocation().y);
		    		coordY[8] = coordY[8]+1;
		    	}
		    	else if(direcao==3) {
		    		Botao8.setLocation(Botao8.getLocation().x, Botao8.getLocation().y+175);
		    		coordX[8] = coordX[8]+1;
		    	}
		    	else if(direcao==4) {
		    		Botao8.setLocation(Botao8.getLocation().x-175, Botao8.getLocation().y);
		    		coordY[8] = coordY[8]-1;
		    	}
				if(jogo.isFimDeJogo()==true) {
					System.out.print("aaaaaa");
					dispose();
				}
			}
		});
		Botao8.setBounds(425, 425, 100, 100);
		contentPane.add(Botao8);
		}
	}
    private void moveBotoes(int direcao, JButton Botao, int coordenadaX, int coordenadaY) {
    	if(direcao==1){
    		Botao.setLocation(Botao.getLocation().x, Botao.getLocation().y-175);
    		coordenadaX = coordenadaX-1;		
    	}
    	else if(direcao==2) {
    		Botao.setLocation(Botao.getLocation().x+175, Botao.getLocation().y);
    		coordenadaY = coordenadaY+1;
    	}
    	else if(direcao==3) {
    		Botao.setLocation(Botao.getLocation().x, Botao.getLocation().y+175);
    		coordenadaX = coordenadaX+1;
    	}
    	else if(direcao==4) {
    		Botao.setLocation(Botao.getLocation().x-175, Botao.getLocation().y);
    		coordenadaY = coordenadaY-1;
    	}
    }
    public void correcao() {
    		coordX[0] = 0;
    		coordY[0] = 0;
    		coordX[1] = 0;
    		coordY[1] = 1;
    		coordX[2] = 0;
    		coordY[2] = 2;
    		coordX[3] = 1;
    		coordY[3] = 0;
    		coordX[4] = 1;
    		coordY[4] = 1;
    		coordX[5] = 1;
    		coordY[5] = 2;
    		coordX[6] = 2;
    		coordY[6] = 0;
    		coordX[7] = 2;
    		coordY[7] = 1;
    		coordX[8] = 2;
    		coordY[8] = 2;
    	}
}

















