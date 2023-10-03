package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		
		// TODO
		System.out.println("{");
		
		for (int x = 0; x < matrise.length; x++) {
			System.out.print("{ ");
			
			for (int y = 0; y < matrise[x].length; y++) {
				System.out.print(y + " ");
			}
			
			System.out.print("}");
			System.out.println(" ");
		}
		
		System.out.println("}");
		
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		String result = "";

		for (int x = 0; x < matrise.length; x++) {
			for (int y = 0; y < matrise[x].length; y++) {
				result += matrise[x][y] + " ";
			}
			result += "\n";
		}
		
		result += "";
		return result;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		int[][] result = null;
		
		for (int x = 0; x < matrise.length; x++) {
			result = new int[matrise.length][matrise[x].length];
		}
		
		for (int x = 0; x < matrise.length; x++) {
			for (int y = 0; y < matrise[x].length; y++) {
				result[x][y] = matrise[x][y] * tall;
			}
		}
		
		return result;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		
		// TODO
		for (int x = 0; x < a.length; x++) {
			for (int y = 0; y < a[x].length; y++) {
				if (a[x][y] != b[x][y]) {
					return false;
				}
			}
		}
		
		return true;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		int numRows = matrise.length;
        int numCols = matrise[0].length;
        int[][] mirrored = new int[numRows][numCols];
       
        
        for (int y = 0; y < numRows; y++) {
        	for(int x = 0, x1 = 0; x < numRows && x1 < numCols; x++, x1++) {
        		mirrored[y][x1] = matrise[x][y];
            }
        }

		return mirrored;
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {
		return a;
	}
}
