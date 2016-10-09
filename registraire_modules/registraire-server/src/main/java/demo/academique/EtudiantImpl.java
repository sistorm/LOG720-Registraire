package demo.academique;

import org.omg.PortableServer.POA;

public class EtudiantImpl extends EtudiantPOA {
	private String _codePermanent;
	private String _nom;
	private String _prenom;
	private CollectionCoursImpl _collectionCours;

	public EtudiantImpl(String codePermanent, String nom, String prenom) {
		_codePermanent = codePermanent;
		_nom = nom;
		_prenom = prenom;
		_collectionCours = new CollectionCoursImpl();
	}

	public String codePermanent() {
		return _codePermanent;
	}

	public void codePermanent(String arg) {
		_codePermanent = arg;
		System.out.println("Changement de Etudiant.codePermanent a: "
				+ _codePermanent);
	}

	public String nom() {
		return _nom;
	}

	public void nom(String arg) {
		_nom = arg;
		System.out.println("Changement de Etudiant.nom a: " + _nom);
	}

	public String prenom() {
		return _prenom;
	}

	public void prenom(String arg) {
		_prenom = arg;
		System.out.println("Changement de Etudiant.prenom a: " + _prenom);
	}

	public void ajouterCours(String sigle, String titre) {
		CoursImpl cours = new CoursImpl(sigle, titre);
		_collectionCours.getListeCours().add(cours);

	}

	public CollectionCours getListeCours() {
		try {
			// Recuperer le POA cree dans le serveur
			POA rootpoa = Server._poa;

			// Activer l'objet et retourne l'objet CORBA
			org.omg.CORBA.Object obj = rootpoa
					.servant_to_reference(_collectionCours);

			// Retourner une Collection de cours
			return CollectionCoursHelper.narrow(obj);
		} catch (Exception e) {
			System.out.println("Erreur retour de l'objet CollectionCours : "
					+ e);
			return null;
		}
	}

	public String _toString() {
		return (_codePermanent + ": " + _nom + ", " + _prenom);
	}

}
