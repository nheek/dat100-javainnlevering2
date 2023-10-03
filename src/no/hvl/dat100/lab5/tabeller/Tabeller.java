package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		// TODO
			for (int x = 0; x < tabell.length; x++) {
				System.out.println(tabell[x]);
			}
		

	}

	// b)
	public static String tilStreng(int[] tabell) {

		// TODO
		String output = "[";
		
		for (int x = 0; x < tabell.length; x++) {
			output += tabell[x];
			
			if (tabell[x] != tabell[tabell.length - 1]) {
				output += ",";
			}
		}
		
		output += "]";

		return output;
		
	}

	// c)
	public static int summer(int[] tabell) {

		// TODO
		int output = 0;
		int start = 0;
		
		while (start != tabell.length) {
			output += tabell[start];
			start++;
		}
		
		return output;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		// TODO
		boolean checkTall = false;
		
		for (int x = 0; x < tabell.length; x++) {
			if (tabell[x] == tall) {
				checkTall = true;
			}
		}
		
		return checkTall;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		// TODO
		int position = -1;
		
		for (int x = 0; x < tabell.length; x++) {
			if (tabell[x] == tall) {
				position = x;
			}
		}
		
		return position;

	}

	// f)
	public static int[] reverser(int[] tabell) {

		// TODO
		int[] output = new int[tabell.length];
		int counter = 0;
		
		for (int x = tabell.length - 1; x >= 0; x--) {
			output[counter] = tabell[x];
			counter++;
		}

		return output;
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		// TODO
		boolean sorted = true;
		
		for (int x = 0; x < tabell.length -1; x++) {
			if (tabell[x] > tabell[x+1]) {
				System.out.println("false");
				sorted = false;
				break;
			}
		}
		
		return sorted;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// TODO
		int[] output = new int[tabell1.length + tabell2.length];
		int counter = 0;
		
		for (int x = 0; x < tabell1.length; x++) {
			output[counter] = tabell1[x];
			counter++;
		}
		
		for (int x = 0; x < tabell2.length; x++) {
			output[counter] = tabell2[x];
			counter++;
		}
		
		return output;
	}
}
