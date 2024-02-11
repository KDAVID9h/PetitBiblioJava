package biblio;

public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Création d'un auteur
		Auteur auteur1 = new Auteur("David", "19/09/2000", "Auteur à succès");
        Auteur auteur = new Auteur("J.K. Rowling", "19/09/1960", "Auteur à succès");

        // Création d'un livre
		Livre Reigdef = new Livre("Reigde", auteur1, 2022, 2, Enumeration.ScienceFiction);
        Livre harryPotter = new Livre("Harry Potter", auteur, 1997, 10, Enumeration.Fiction);

        // Création d'un utilisateur
		Utilisateur utilisateur1 = new Utilisateur("HKDE", "29/12/2000", 1909);
        Utilisateur utilisateur = new Utilisateur("John", "29/12/2000", 12345);

        // L'utilisateur emprunte le livre
		utilisateur1.emprunterLivre(Reigdef);
		// Affichage des détails de l'utilisateur
		utilisateur1.afficherDetails();

		// L'utilisateur emprunte le livre
		utilisateur.emprunterLivre(Reigdef);
        utilisateur.emprunterLivre(harryPotter);

        // Affichage des détails de l'utilisateur
        utilisateur.afficherDetails();

        // L'utilisateur retourne le livre
        utilisateur.retournerLivre(harryPotter);

        // Affichage des détails de l'utilisateur après le retour du livre
        utilisateur.afficherDetails();

	}
}
