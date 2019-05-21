package br.com.poli.PuzzleN;
public class Tabuleiro {
	private int casas;
	private Bloco grid[][];	
	private int direcao;
	public Tabuleiro(int casas) {
		this.casas=casas;
		this.grid= new Bloco[casas][casas];
		for(int x=0; x<this.casas ;x++ ) {
			for(int y=0; y<this.casas ;y++) {
				this.grid[x][y]=new Bloco();
			}
		}
	}
	public int executaMovimento(int linha, int coluna){
		if(linha+1<this.casas && grid[linha+1][coluna].getValor()==0){
			int troca = grid[linha][coluna].getValor();
			grid[linha][coluna].setValor(grid[linha+1][coluna].getValor());
			grid[linha+1][coluna].setValor(troca);
			direcao=3;
			}
		else if(coluna+1<this.casas && grid[linha][coluna+1].getValor()==0){
			int troca = grid[linha][coluna].getValor();
			grid[linha][coluna].setValor(grid[linha][coluna+1].getValor());
			grid[linha][coluna+1].setValor(troca);
			direcao=2;
		    }
		else if(coluna-1>-1 && grid[linha][coluna-1].getValor()==0){
			int troca = grid[linha][coluna].getValor();
			grid[linha][coluna].setValor(grid[linha][coluna-1].getValor());
			grid[linha][coluna-1].setValor(troca);
			direcao=4;
		    }
		else if(linha-1>=0 && grid[linha-1][coluna].getValor()==0){
			int troca = grid[linha][coluna].getValor();
			grid[linha][coluna].setValor(grid[linha-1][coluna].getValor());
			grid[linha-1][coluna].setValor(troca);
			direcao=1;
		    }
		
		else {
			direcao=5;
		}
		return direcao;
	}
	public boolean isMovimentoValido(int linha, int coluna) {
		//metodo para verificar se o movimento pode ser feito
		if(direcao.equals("baixo")){
			if(linha+1==casas) {
				return false;
			}
			else{
				return true;
			}
		}
		else if(direcao.equals("cima")) {
			if(linha-1<0) {
				return false;
			}
			else {
				return true;
			}
		}
		else if(direcao.equals("direita")) {
			if(coluna+1==casas) {
				return false;
			}
			else {
				return true;
			}
		}
		else if(direcao.equals("esquerda")) {
		    if(coluna-1<0) {
		        return false;	
		    }
		    else {
		    	return true;
		    }
		}
		else {
			return false;
		}
	}
	public boolean isTabuleiroOrdenado(){
	//metodo para checar se os blocos foram ordenados e se o usuario venceu
	    int verificar =0;
        int casaCerta =0;
        int totalCasas = casas*casas-1;
	    for(int x=0 ; x<casas ; x++) {
		    for(int y=0 ; y<casas ; y++) {
		        verificar = verificar + 1;
		            if(grid[x][y].getValor() ==verificar){
		                casaCerta = casaCerta + 1;
		            }
		            else {}
		    }
	     }
	     if(casaCerta==totalCasas){
	         return true;
	     }
	     else {
		     return false;
	}
}
	public void geraTabuleiro() {
		int valorCasa=1;
		//metodo ultilizado para colocar valores nos blocos
	    for(int x=0 ; x<casas ; x++) {
			for(int y=0 ; y<casas ; y++) {
			    this.grid[x][y] = new Bloco();
				}}
		for(int x=0 ; x<casas ; x++) {
			for(int y=0 ; y<casas ; y++){
				grid[x][y].setValor(valorCasa);
				valorCasa++;
			}	
			    }
		grid[casas-1][casas-1].setValor(0);
		for(int z=0 ; z<casas*casas ; z++) {
		for (int x = 0; x < casas; x++) {
            for (int y = 0; y < casas; y++) {
                int x1 = (int) (Math.random()*casas-1);
                int y1 = (int) (Math.random()*casas-1);

                Bloco temp = grid[x][y];
                grid[x][y] = grid[x1][y1];
                grid[x1][y1] = temp;
            }
        }
		}
		
		/*
		grid[0][0].setValor(1);
		grid[0][1].setValor(2);
		grid[0][2].setValor(3);
		grid[1][0].setValor(4);
		grid[1][1].setValor(5);
		grid[1][2].setValor(0);
		grid[2][0].setValor(7);
		grid[2][1].setValor(8);
		grid[2][2].setValor(6);
		*/
		}
	public void print() {
		/*metodo criado para testes com a funcao de printar a matriz no console para verificar
		se os valores estao certos*/
		for(int x=0 ; x<casas ; x++) {
			for(int y=0 ; y<casas ; y++){
			    int z = grid[x][y].getValor();
			    if(z<10) {
			    	System.out.print(" 0" +z);	
			    }
			    else {
			        System.out.print(" " +z);	
			    }
			    }
			System.out.print("\n");
			}
		System.out.println("\n");
	}
	public int getCasa(int x, int y){
		return this.grid[x][y].getValor();
	}
	public int getCasas() {
		return this.casas;
	}
}

