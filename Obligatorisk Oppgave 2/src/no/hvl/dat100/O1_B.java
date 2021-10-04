package no.hvl.dat100;

public class O1_B {

	public static void main(String[] args) {
	
		int [][] tabell1 = {{1,2,3},{4,5,6},{7,8,9}};
		int [][] tabell2 = {{2,4,6},{6,7,8},{10,14,15}};
		
		skrivUtv1(tabell1);
		tilStreng(tabell1);
		skaler(3,tabell1);
		System.out.print(erLik(tabell1,tabell2));
		
	}
	//a
	public static void skrivUtv1(int [][] matrise) {
		
		for (int [] rad : matrise) {
			
			for (int plass : rad) {
				System.out.print(plass + " ");
			}
			System.out.println();
		}
	}
	//b
	public static String tilStreng(int [][] matrise) {
		
		String matStreng = "";
		for (int i = 0; i<matrise.length; i++) {
			for (int j = 0; j<matrise[i].length; j++) {
				matStreng += matrise[i][j];
				
			}
			matStreng += "\n";
		}
		System.out.print(matStreng);
		return matStreng;
	}
	//c
	public static int[][] skaler (int tall, int [][] matrise) {
		
		int [][] nyTabell = new int [matrise.length][];
		// Lager kopi
		for (int i = 0; i<matrise.length; i++) {
			nyTabell[i] = matrise[i].clone();
		}
		
		for (int [] rad : nyTabell) {
			
			for (int plass : rad) {
				plass *= tall;
				System.out.print(plass + " ");
			}
			System.out.println();
		}
		
		return nyTabell;
	}
	//d
	public static boolean erLik(int [][] mat1, int [][] mat2) {
		
		for (int i = 0; i<mat1.length; i++) {
			for (int j = 0; j<mat1[i].length; j++) {
				if (mat1[i][j] != mat2[i][j]) {
					return false;
				}
			}
		}
		
		return true;
	
	}
}
