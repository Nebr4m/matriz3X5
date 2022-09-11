package view;

import controller.MatrizThreads;

public class Main {

	public static void main(String[] args) {
		int[][] matriz = new int[3][5];
		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 5; coluna++) {
				matriz[linha][coluna] = (int) (Math.random() * 10) + 1;
			}
		}
		for (int i = 0; i < 3; i++) {
			MatrizThreads MT = new MatrizThreads(i, matriz);
			MT.start();
		}
	}
}
