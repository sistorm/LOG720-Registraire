package demo.academique;

/**
 * Un exemple d'objet distant qui manipule un autre objet distant 
 */
import org.omg.CosNaming.NameComponent;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;

public class Client {
	public static void main(String[] args) {
		try {
			org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init(args, null);

			// get hold of the naming service
			NamingContextExt nc = NamingContextExtHelper.narrow(orb
					.resolve_initial_references("NameService"));

			NameComponent[] name = new NameComponent[] { new NameComponent(
					"Registraire", "service") };

			// resolve name to get a reference to our server
			Registraire registraire = RegistraireHelper
					.narrow(nc.resolve(name));

			// Ajout d'un etudiant
			registraire.ajouterEtudiant("BLEJ01020304", "Bleau", "Jo");
			Etudiant etudiant = registraire.getListeEtudiants().getEtudiant(0);

			// Affichage des valeurs initiales des attributs, changement,
			// reaffichage

			// Code permanent
			System.out
					.println("Contenu initial de codePermanent a partir du client: "
							+ etudiant.codePermanent());
			etudiant.codePermanent("ABCD12345678");
			System.out
					.println("Changement de codePermanent a partir du client: "
							+ etudiant.codePermanent());

			// Nom
			System.out.println("Contenu initial de nom a partir du client: "
					+ etudiant.nom());
			etudiant.nom("Diant");
			System.out.println("Changement de nom a partir du client: "
					+ etudiant.nom());

			// Prenom
			System.out.println("Contenu initial de prenom a partir du client: "
					+ etudiant.prenom());
			etudiant.prenom("Letu");
			System.out.println("Changement de prenom a partir du client: "
					+ etudiant.prenom());

			// Affichage liste des cours, ajout cours, reaffichage
			System.out.println("Liste de cours initiale :");
			afficheListeCours(etudiant.getListeCours());

			etudiant.ajouterCours("LOG720",
					"Achitecture distribuee orientee objet");

			System.out.println("Liste de cours modifiee :");
			afficheListeCours(etudiant.getListeCours());

			// Ajout d'un 2e etudiant, reaffichage de la liste
			registraire.ajouterEtudiant("BLEJ12129203", "Bleau", "Jo");

			System.out.println("Liste finale d'etudiants :");
			CollectionEtudiant collectionEtudiant = registraire
					.getListeEtudiants();
			for (int i = 0; i < collectionEtudiant.size(); i++) {
				System.out.println(collectionEtudiant.getEtudiant(i)
						._toString());
			}

			System.out.println("---Tout a bien ete, on ferme la boutique---");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void afficheListeCours(CollectionCours collection) {
		for (int i = 0; i < collection.size(); i++) {
			System.out.println(collection.getCours(i)._toString());
		}
	}
}
