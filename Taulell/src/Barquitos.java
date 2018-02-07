

import java.util.Scanner;
import java.util.Random;

public class Barquitos {

	final static int MAX = 10;
	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char resp;

		do {
			System.out.println("Benvingut al joc de Enfonsar la Flota!");
			jugar();
			System.out.println("Vols continuar jugant? ");
			resp = obtenirResp();
		} while (resp == 's' || resp == 'S');
	}

	public static void jugar() {
		// TODO Auto-generated method stub
		 Taulell t = new Taulell();
	        Finestra f = new Finestra(t);
		 t.setActcolors(true);
	        t.setActimatges(false);
	        t.setActlletres(false);
	        int[] colors={0x0000FF,0x00FF00,0xFFFF00,0xFF0000,0xFF00FF,0x00FFFF,0x000000,0xFFFFFF,0xFF8000,0x7F00FF};
	        t.setColors(colors);
	        f.setActetiquetes(true); //les etiquetes i titol com que no tenen a veure amb la matriu es tracten per la finestra!
	        String[] etiquetes={"Dispars:10","Portavions:1","Cuirassats:0","Creuers:0","Submarins:1"};
	        f.setEtiquetes(etiquetes);  
	        f.setTitle("Enfonsar la flota");
		char[][] secret = 
			  { { '?', '?', '?', '?', '*', '?', '?', '*', '*', '*' },
				{ '*', '*', '*', '?', '?', '?', '?', '?', '?', '?' },
				{ '?', '?', '?', '?', '?', '?', '?', '?', '*', '?' },
				{ '?', '?', '?', '?', '?', '?', '?', '?', '*', '?' },
				{ '?', '?', '?', '?', '?', '?', '?', '?', '*', '?' },
				{ '*', '*', '?', '?', '?', '?', '?', '?', '*', '?' },
				{ '?', '?', '?', '?', '?', '?', '?', '?', '?', '?' },
				{ '?', '?', '?', '?', '*', '?', '*', '?', '?', '*' },
				{ '?', '*', '?', '?', '*', '?', '*', '?', '?', '?' },
				{ '?', '?', '?', '?', '?', '?', '?', '?', '*', '?' } };
		int[][] solucio = new int[MAX][MAX];
		int torn = 0;
		boolean guanyat = false;
		

		inicialitzarSolucio(solucio, 9);
        t.dibuixa(solucio);
//		inicialitzarSecret(secret);
		do {

		} while (torn < 50 && !guanyat);
	}

	/*
	 * public static void inicialitzarSecret(char[][] secret) { // TODO
	 * Auto-generated method stub
	 * 
	 * }
	 */

public static void inicialitzarSolucio(int [][] solucio, int n) {
for (int i=0;i<MAX;i++)
		for (int j=0;j<MAX;j++)
				solucio[i][j]=n;

}





public static char obtenirResp () {
char resp;
resp = reader.next().charAt(0);
return resp;
}
}

//public static void mostrarMatriu (char [][] solucio) {
//for (int i=0;i for (int j=0;j System.out.print(solucio[i][j]+" ");
//}System.out.println();
//}
//
