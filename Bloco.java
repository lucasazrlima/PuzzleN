package br.com.poli.PuzzleN;
public class Bloco {   
	//classe q informa o valor e a validade q cada bloco do tabuleiro possui
	private int valor;
	private boolean valido;
	public Bloco(){
	}
	public int getValor() {
		return this.valor;
	}
	public void setValor(int valor){
		this.valor = valor;
	}
	public boolean getValido() {
		return valido;
	}
	public void setValido(boolean valido) {
		this.valido = valido;
	}
	
}
