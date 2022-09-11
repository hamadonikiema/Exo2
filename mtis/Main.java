package mtis;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<CompteBancaire> listeCB = new ArrayList<CompteBancaire>();
CompteBancaire c1 = new CompteBancaire();
CompteBancaire c2 = new CompteBancaire();
CompteBancaire c3 = new CompteBancaire();
CompteBancaire c4 = new CompteBancaire();
listeCB.add(c1);
listeCB.add(c2);
listeCB.add(c3);
listeCB.add(c4);

for (CompteBancaire c: listeCB) {
     c.saisie();
     }
for (CompteBancaire c: listeCB) {
	c.afficher();
}
	}

}
