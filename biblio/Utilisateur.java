package biblio;
import java.util.List;
import java.util.ArrayList;



public class Utilisateur extends Personne {

	private int numAdh;
	private List<Livre> listeLivresEmp;

	public Utilisateur(String nom, String date, int numAdh){

		super(nom, date);
		this.numAdh = numAdh;
		this.listeLivresEmp = new ArrayList<>();
	}

	public void emprunterLivre(Livre Livre){

		Livre.emprunter();
		listeLivresEmp.add(Livre);
		//int c = Livre.getnmbExemp();

		/*if (c > 0) {
			c--;
			
			System.out.println("\nEmprunt effectuer par");
		}*/
	}

	public void retournerLivre(Livre Livre){
		Livre.retourner();
		listeLivresEmp.remove(Livre);
	}

	@Override
	public void  afficherDetails(){

		System.out.println("Utilisateur : " + nom + "\nDate de naissance : " + date +
                "\nNuméro d'adhérent : " + numAdh + "\nLivres empruntés : " + listeLivresEmp);
	}
}
