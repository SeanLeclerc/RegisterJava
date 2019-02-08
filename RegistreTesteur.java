package lab09;

import javax.swing.JOptionPane;

public class RegistreTesteur {
	public static void main( String[] args ) {
		  int nbLignes = Integer.parseInt(
		    JOptionPane.showInputDialog("Nombre de lignes du registre ? " ));
		  double soldeInitial = Double.parseDouble(JOptionPane.showInputDialog("Solde initial ? " ));
		  Registre registre = new Registre( nbLignes , soldeInitial );
		  System.out.println( registre );
		  double transaction = 0.0;
		  do {
		    transaction = Double.parseDouble(JOptionPane.showInputDialog("Montant de la transaction : " ));
		    if( transaction != 0.0 ) {
		      registre.effectuerTransaction( transaction );
		      System.out.println();
		      System.out.println( registre );
		    }
		  } while( transaction != 0.0 );
		  registre.reInitialiser();
		  System.out.println();
		  System.out.println( registre );
		}
}
