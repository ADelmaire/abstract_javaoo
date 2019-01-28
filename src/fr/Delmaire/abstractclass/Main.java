package fr.Delmaire.abstractclass;

public class Main {

	public static void main(String[] args) {

		Fille fille = new Fille();
		fille.direBonsoir();
		fille.bonjour();

		Enfant enfant = new Enfant();
		enfant.direBonsoir();
		enfant.bonjour();
		enfant.bonjourBonsoir();
	}

}
