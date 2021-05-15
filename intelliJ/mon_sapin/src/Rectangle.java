
public class Rectangle {
	public static void main (String[] args) {
		for(int ligne = 1; ligne <= 9; ligne++) {
			for(int nbEsp = 1; nbEsp <= ligne - 1; nbEsp++)
				System.out.print(' ');
			
			for(int cpt = ligne; cpt <= 9; cpt += 1)
				System.out.print(cpt + " ");
			System.out.println();
		}
	}

}
	



