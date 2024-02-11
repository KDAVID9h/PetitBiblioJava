package biblio;

public abstract class Personne {

	protected String nom;
	protected String date;

	public Personne(String nom, String date){
		this.nom = nom;
		this.date = date;
	}

	public abstract void  afficherDetails();
}
