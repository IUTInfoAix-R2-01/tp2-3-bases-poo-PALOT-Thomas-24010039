package packageProf;

public class Personne {
	String Nom;
	String Prenom;
	
	public Personne () {
		Nom = "null";
		Prenom = "null";
	}
	
	public Personne (String Prenom) {
		this.Prenom = Prenom;
	}
	
	public Personne (String Nom, String Prenom) {
		this.Nom = Nom;
		this.Prenom = Prenom;
	}
	
	public String getNom () {
		return Nom;
	}
	
	public String getPrenom () {
		return Prenom;
	}
	
	public String toString () {
		if (Nom == null) {
			return "Personne[prenom = " + Prenom + "]";
		}
		return "Personne[nom = " + Nom + ", prenom = " + Prenom + "]";
	}
}
