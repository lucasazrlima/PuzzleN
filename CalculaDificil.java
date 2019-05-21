package br.com.poli.PuzzleN;

public class CalculaDificil implements CalculaScore{
	public double pontos(int movimentos) {
		return 1000/movimentos;
	}
}
