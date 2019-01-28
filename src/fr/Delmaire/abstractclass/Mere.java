package fr.Delmaire.abstractclass;

// classe abstraite plus rarement utilis�e que interfaces
public abstract class Mere {
	protected String nom;
	protected String prenom;
	protected int age;

	public void bonjour() {
		System.out.println("Bonjour je suis la m�re");
	}

	public abstract void direBonsoir();
	/*
	 * def: compromis entre l'interface et la classe une classe abstraite ne peut
	 * pas �tre instanci�e ne peut pas cr�er un objet
	 * 
	 * Si on la cr��e on l'utilise forc�ment avec une classe fille (h�ritage)
	 * 
	 * Elle contient une ou des m�thode abstraite = m�thode qui n'a pas de corps
	 * (comme dans les interfaces)
	 * 
	 * Elle a des constructeurs qu'elle ne peut que transmettre elle ne peut pas
	 * s'en servir Elle n'est l� que pour transmettre aux enfants
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
