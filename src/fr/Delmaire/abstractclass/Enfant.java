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
		// appelle la méthode bonjour de la classe mère
		// super renvoie à la classe mère
		this.direBonsoir();
		// this renvoie à la classe dans laquelle je suis
		// on pourrait aussi écrire: direBonsoir();
	}

}
