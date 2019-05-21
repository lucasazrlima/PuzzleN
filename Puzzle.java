package br.com.poli.PuzzleN;

import java.util.Scanner;

public class Puzzle {
	//parametros da classe Puzzle
    private Jogador jogador= new Jogador();
    private Tabuleiro gridPuzzle;
    private double quantidadeMovimentos;
    private boolean venceu;
    private java.util.Calendar tempo;
    private Dificuldade dificuldade;
    private int casas;
    private CalculaScore score;
    public Puzzle (Dificuldade dificuldade) {
    	this.casas=dificuldade.getDif();
    	this.gridPuzzle= new Tabuleiro(dificuldade.getDif());
    }
    public Puzzle (Dificuldade dificuldade, int k){
    	this.casas=k;
        this.gridPuzzle= new Tabuleiro(k);
    }
    Scanner inn = new Scanner(System.in);
    public boolean isFimDeJogo() {
        return gridPuzzle.isTabuleiroOrdenado();
}
    public void iniciaPartida() {
        quantidadeMovimentos=0;
        gridPuzzle.geraTabuleiro();
        venceu=false;
	}
    public void jogar() {
    	//o metodo jogar foi criado apenas para testar funcionalidades no jogo
        //esse metodo printa o tabuleiro, pede linha coluna e movimento ao jogador
        //quando o jogo acaba ela informa o numero de jogadas
        do{
            gridPuzzle.print();
            int linha = inn.nextInt();
            int coluna = inn.nextInt();
            if(linha < casas && linha >= 0 && coluna < casas && coluna >= 0) {
                gridPuzzle.executaMovimento(linha, coluna);	
                this.quantidadeMovimentos ++;
            }
            else {
            	System.out.println("esta tentando mover uma casa fora do tabuleiro");
            }
        }while(false);
        gridPuzzle.print();	
        System.out.println("vc venceu");
        System.out.println("vc fez " + this.quantidadeMovimentos + " movimento(s)");
}
    //fim das funcoes de jogo, inicio dos getters e setters
    public void setVenceu(boolean x) {
        venceu = x;
}
    public boolean getVenceu() {
        return gridPuzzle.isTabuleiroOrdenado();
}
    public Jogador getJogador() {
        return jogador;
}
    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
}
    public Tabuleiro getGridPuzzle() {
        return gridPuzzle;
}
    public void setGridPuzzle(Tabuleiro gridPuzzle) {
        this.gridPuzzle = gridPuzzle;
}
    public double getQuantidadeMovimentos() {
        return quantidadeMovimentos;
}
    public void setQuantidadeMovimentos(int quantidadeMovimentos) {
        this.quantidadeMovimentos = quantidadeMovimentos;
    }    
}
