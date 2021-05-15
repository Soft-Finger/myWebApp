
public class Sapin_V2 {
	public static void main (String[] args) {
		// D�claration des constantes
		final char ESPACE = ' ';
		final char SYMBOLE = '+';
		final int HAUTEUR_MIN = 2;
		final int HAUTEUR_MAX = 20;

		// D�claration des variables
		int hauteur;
		
		/* Ajoutez les instructions de traitement ci-dessous */
		do {
			System.out.print("Entrez la hauteur du sapin (2 a 20) : ");
			hauteur = Keyboard.readInt();
		}
		while (hauteur < HAUTEUR_MIN || hauteur > HAUTEUR_MAX);
		
		for (int noEtage = 1; noEtage <= hauteur; noEtage = noEtage + 1) {
			// Boucle pour dessiner les espaces sur la ligne
			for (int noEspace = 1; noEspace <= hauteur-noEtage; noEspace = noEspace + 1) {
				System.out.print(ESPACE);
			}
			
			// Boucle pour dessiner les + sur la ligne
			for (int noPlus = 1; noPlus <= ((2*noEtage)-1); noPlus = noPlus + 1) {
				System.out.print(SYMBOLE);
			}
			System.out.println();
		}
	}
}
