package lab09;

public class Registre {
	//Variable d'instance
	private double[] solde = null;
	private double[] trans = null;
	
	//Constructeur
	public Registre( int nbLignes, double depotInitial) {
		if( nbLignes < 1) nbLignes = 10;
		if( depotInitial<0) depotInitial = 0;
		solde = new double[nbLignes];
		trans = new double[nbLignes];
		solde[0] = trans[0] = depotInitial;
		
	}
	//Methodes
	public String toString() {
		String s = "Transaction   solde\n";
		for (int i = 0; i < solde.length; i++) {
			s += String.format("%1$10.2f$ %2$10.2f$\n", trans[i],solde[i]);
			
		}
		return s;
	
	}
	public void effectuerTransaction(double transaction) {
		for( int i = solde.length-1; i>0; i--) {
			solde[i] = solde[i-1];
			trans[i] = trans[i-1];
			
		}
		trans[0] = transaction;
		solde[0] += transaction;
	}
	public void reInitialiser() {
		for (int i = 0; i < solde.length; i++) {
			solde[i] = trans[i] = 0.0;
		}
	}
}
