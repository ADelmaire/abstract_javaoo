package fr.Delmaire.abstractclass;

// classe abstraite plus rarement utilisée que interfaces
public abstract class Mere {
	protected String nom;
	protected String prenom;
	protected int age;

	public void bonjour() {
		System.out.println("Bonjour je suis la mère");
	}

	public abstract void direBonsoir();
	/*
	 * def: compromis entre l'interface et la classe une classe abstraite ne peut
	 * pas être instanciée ne peut pas créer un objet
	 * 
	 * Si on la créée on l'utilise forcément avec une classe fille (héritage)
	 * 
	 * Elle contient une ou des méthode abstraite = méthode qui n'a pas de corps
	 * (comme dans les interfaces)
	 * 
	 * Elle a des constructeurs qu'elle ne peut que transmettre elle ne peut pas
	 * s'en servir Elle n'est là que pour transmettre aux enfants
	 */

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
