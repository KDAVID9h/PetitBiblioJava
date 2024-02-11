package biblio;

public class Livre implements Empruntable{

	private String titre;
	private Auteur auteur;
	private int annPub;
	private int nmbExemp;
	private Enumeration genre;

	public Livre(String titre, Auteur auteur, int annPub, int nmbExemp, Enumeration genre){

		this.titre = titre;
		this.nmbExemp = nmbExemp;
		this.annPub = annPub;
		this.auteur = auteur;
		this.genre = genre;
	}

	/*public int getnmbExemp(){
		return this.nmbExemp;
	}*/

	@Override
	public  void emprunter(){
		if (nmbExemp > 0) {
			nmbExemp--;
			System.out.println("\nEmprunt effectuer par");
		}
		else{
			System.out.println("\nPas de livre disponible");
		}
	}

	//String var = auteur.toString();
	@Override
	public void retourner(){
		nmbExemp++;
		System.out.println("\nLivre retourner");
	}

	@Override
    public String toString() {
        return "\n\n\tTitre Livre : " + titre + "\n\tAuteur : " + auteur.toString() + "\n\tAnnée de publication : " + annPub +
                "\n\tExemplaires disponibles : " + nmbExemp + "\n\tGenre : " + genre;
    }
}
