package fr.Delmaire.abstractclass;

public class Fille extends Mere {

	// @Override
	// pour le compilateur
	// pour dire que la m�thode n'est pas propre � la classe fille
	// vient d'au dessus

	@Override
	public void direBonsoir() {
		System.out.println("bonsoir je suis la fille");
	}

	@Override
	public void bonjour() {
		System.out.println("bonjour je suis la fille");
	}
	// caract�ristiques de la m�thode sont les m�mes mais on la red�finit

}
