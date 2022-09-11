package controller;

import view.Main;

public class MatrizThreads extends Thread {
	int i;
	int[][] matriz;

	public MatrizThreads(int i, int[][] matriz) {
		this.i = i;
		this.matriz = matriz;
	}

	@Override
	public void run() {

		int[] soma = new int[3];
		for (int coluna = 0; coluna < 5; coluna++) {
			soma[i] += matriz[i][coluna];
		}
		System.out.println("Soma da matriz na linha  " +(i+1)  + ":  " + soma[i]);
	}
}