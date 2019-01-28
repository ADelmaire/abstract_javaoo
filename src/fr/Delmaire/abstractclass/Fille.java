package fr.Delmaire.abstractclass;

public class Fille extends Mere {

	// @Override
	// pour le compilateur
	// pour dire que la méthode n'est pas propre à la classe fille
	// vient d'au dessus

	@Override
	public void direBonsoir() {
		System.out.println("bonsoir je suis la fille");
	}

	@Override
	public void bonjour() {
		System.out.println("bonjour je suis la fille");
	}
	// caractéristiques de la méthode sont les mêmes mais on la redéfinit

}
