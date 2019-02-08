package lab09;

import javax.swing.*;

public class lab09A {

	public static void main(String[] args) {
		String s[] = { "Salut", "Bonjour", "Programmation", "Java", "Language", "MLG", "FaZe", "Tmartn", "Thuglife" };
		String[] c = new String[s.length];
		int longueurMax = 0;
		for (int i = 0; i < c.length; i++) {
			c[i] = fabriquer(s[i]);
			if (s[i].length() > longueurMax)
				longueurMax = s[i].length();
		}
		// Affichage des tableaux
		System.out.println("-------------------------------------");
		for (int i = 0; i < c.length; i++) {
			System.out.printf("%1$" + longueurMax + "s : %2$1s\n", s[i], c[i]);
		}
		System.out.println("-------------------------------------");
		// Interrogation
		String chaine;
		do {
			chaine = JOptionPane.showInputDialog("Entrez une chaine: ").trim();
			if (!chaine.isEmpty()) {
				boolean trouver = false;
				for (int i = 0; i < s.length; i++) {
					if (chaine.equals(s[i])) {
						System.out.println("Le mot corresondant est: " + c[i]);
						trouver = true;
					} else if (chaine.equals(s[i])) {
						System.out.println("Le mot corresondant est: " + s[i]);
						trouver = true;
					}
				}
				if (!trouver) {
					System.out.println("Ce mot n'est pas dans la liste.");
				}
			}
		} while (!chaine.isEmpty());
		System.out.println("Merci d'avoir utilse cette application");
	}

	private static String fabriquer(String s) {
		String ch = "";
		char c;
		for (int i = 0; i < s.length(); i++) {
			c = s.charAt(i);
			if (c >= 'A' && c <= 'Z') {
				ch += (char) ('A' + (int) (Math.random() * 26));
			} else {
				ch += (char) ('a' + (int) (Math.random() * 26));
			}
		}
		return ch;

	}

}
