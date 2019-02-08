package lab09;

import javax.swing.JOptionPane;

public class lab09C {

	public static void main(String[] args) {
		String chaine = JOptionPane.showInputDialog("Veuillez etrez une chaine:");
		System.out.println("Chaines originale: " + chaine);
		System.out.println("Anagramme        :" + anagramme(chaine));

	}
	private static String anagramme( String s) {
	String ch = "";
	char[] c = new char[s.length()];
	for( int i=0 ; i<c.length; i++) c[i] = s.charAt(i);
	//On melange le tableau
	char temp;
	int j;
	for( int i = 0; i<c.length; i++) {
		j = (int)(Math.random()*c.length);
		temp = c[j];
		c[j] = c[i];
		c[i] = temp;
	}
	//On fabrique lanagramme
	for( int i = 0; i<c.length; i++) ch += c[i];
		return ch;
	}
	

	}

