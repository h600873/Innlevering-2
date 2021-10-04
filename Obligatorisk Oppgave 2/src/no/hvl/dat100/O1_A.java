package no.hvl.dat100;
import java.util.Arrays;

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
		settSammen(tabell1, tabell2);
		
	}
	//a
	public static void skrivUt(int [] tabell) {
		
		for (int i = 0; i<tabell.length; i++) {
			System.out.println(tabell[i]);
		}
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
		int pos = 0;
		
		for (int i : tabell1) {
			sammenTabell[pos] = i;
			pos ++;
		}
		
		for (int i : tabell2) {
			sammenTabell[pos] = i;
			pos ++;
		}
		
		System.out.println(Arrays.toString(sammenTabell));
		return sammenTabell;
		
	}
}
		
	


