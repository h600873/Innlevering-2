package no.hvl.dat100;


public class O1_A {

	public static void main(String[] args) {
		
		int [] tabell1 = {2,2,3,5,9};
		int [] tabell2 = {5,7,3};
		skrivUt(tabell1);
		tilStreng(tabell1);
		summer(tabell1);
		finnes(tabell1, 15);
		System.out.print(posisjonTall(tabell1, 9));
		reverser(tabell1);
		System.out.print(erSortert(tabell1));
		int [] h = settSammen(tabell1, tabell2); skrivUt(h);
		
	}
	//a
	public static void skrivUt(int [] tabell) {
		
		for (int i = 0; i<tabell.length; i++) {
			System.out.print(tabell[i]);
		}
		System.out.println();
	}
	//b
	public static String tilStreng(int [] tabell) {
	// komma på slutten av tabellen må vekk
		String tabellStreng= "";
		System.out.print("[");
		for (int i = 0; i<tabell.length; i++) {
				tabellStreng=String.valueOf(tabell[i]);
				System.out.print(tabellStreng);
				System.out.print(", ");
		}
	
		System.out.print("]");
		return tabellStreng;
	}
	//c
	public static int summer(int [] tabell) {
		
		int sum = 0;
		for (int i : tabell) {
			sum += i;
		}
		System.out.print(sum);
		return sum;
	}
	//d
	public static boolean finnes(int [] tabell, int tall) {
		
		boolean funnet = false;
		for (int i = 0; i<tabell.length;i++) {
			if (tall == tabell[i]) {
				funnet = true;
				break;
				
			}
		}
		System.out.println(funnet);
		return funnet;
	}
	//e
	public static int posisjonTall(int [] tabell, int tall) {

		for (int i = 0; i<tabell.length; i++) {
			if (tall == tabell[i]) {
				return i;
			} 
			
		}
		return -1;
	}
	//f
	public static int [] reverser(int [] tabell) {
		
		int [] nyTabell = new int[tabell.length];
		
		for (int i = 0; i<tabell.length; i++) {
			nyTabell[i] = tabell[i];
		}
		System.out.print("{");
		for (int i=nyTabell.length-1; i>= 0; i--) {
			System.out.print(nyTabell[i] + ",");
		}
		System.out.print("}");
		return nyTabell;
	}
	//g
	public static boolean erSortert(int [] tabell) {
		
		
		for (int i = 0; i<tabell.length-1;i++) {
			if(tabell[i]>tabell[i+1]) {
				return false;
			}
		}
		
		return true;
	}
	
	public static int [] settSammen(int [] tabell1, int [] tabell2) {
		
		int lengde = tabell1.length + tabell2.length;
		
		int [] sammenTabell = new int [lengde];
		
		for (int i = 0; i<tabell1.length; i++) {
			sammenTabell[i] = tabell1[i];
		}
		
		for (int j = 0; j<tabell2.length; j++) {
			sammenTabell[tabell1.length + j] = tabell2[j];
		}
		
		//System.out.println(sammenTabell);
		return sammenTabell;
		
	}
}
		
	


