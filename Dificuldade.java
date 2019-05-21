package br.com.poli.PuzzleN;

    public enum Dificuldade{
        FACIL(3), MEDIO(4), DIFICIL(5), INSANO(0);
    private int valor;
    private Dificuldade(int valor) {
    	this.valor=valor;
    }
    public int getDif() {
    	return this.valor;
    }
    public void setDif(int valor) {
    	this.valor=valor;
    }
    }
