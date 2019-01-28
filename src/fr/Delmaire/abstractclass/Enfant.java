package fr.Delmaire.abstractclass;

public class Enfant extends Mere {

	@Override
	public void direBonsoir() {
		System.out.println("bonsoir je suis l'enfant");
	}

	@Override
	public void bonjour() {
		System.out.println("bonjour je suis l'enfant");
	}

	public void bonjourBonsoir() {
		super.bonjour();
		// appelle la m�thode bonjour de la classe m�re
		// super renvoie � la classe m�re
		this.direBonsoir();
		// this renvoie � la classe dans laquelle je suis
		// on pourrait aussi �crire: direBonsoir();
	}

}
