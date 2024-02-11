package biblio;

class Auteur extends Personne  {

	private String biographie;

	public Auteur(String nom, String date, String biographie){

		super(nom, date);
		this.biographie = biographie;
	};

	@Override
	public void afficherDetails(){

		System.out.println("Auteur : " + "\n\tnom :" + nom + "\n\tDate de naissance : " + date +
		"\n\tBiographie : " + biographie);
	};

    public String toString() {
        return "\n\t\tnom :" + nom + "\n\t\tDate de naissance : " + date +
		"\n\t\tBiographie : " + biographie;
    }
}
