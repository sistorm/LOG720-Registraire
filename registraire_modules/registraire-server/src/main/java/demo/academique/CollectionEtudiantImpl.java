package demo.academique;

import java.util.ArrayList;
import org.omg.PortableServer.POA;

public class CollectionEtudiantImpl extends CollectionEtudiantPOA {
	private ArrayList<EtudiantImpl> _listeEtudiants;

	public CollectionEtudiantImpl() {
		_listeEtudiants = new ArrayList<EtudiantImpl>();
	}

	public Etudiant getEtudiant(int index) {
		try {
			// Trouver le cours correspondant au parametre "index"
			EtudiantImpl etudiant = _listeEtudiants.get(index);

			// Recuperer le POA cree dans le serveur
			POA rootpoa = Server._poa;

			// Activer l'objet et retourne l'objet CORBA
			org.omg.CORBA.Object obj = rootpoa.servant_to_reference(etudiant);

			// Retourner un Etudiant
			return EtudiantHelper.narrow(obj);
		} catch (Exception e) {
			System.out.println("Erreur retour de l'objet Etudiant : " + e);
			return null;
		}
	}

	public int size() {
		return _listeEtudiants.size();
	}

	protected ArrayList<EtudiantImpl> getListeEtudiants() {
		return _listeEtudiants;
	}

}
