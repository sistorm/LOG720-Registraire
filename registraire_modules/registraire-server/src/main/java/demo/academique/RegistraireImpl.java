package demo.academique;

import org.omg.PortableServer.POA;

public class RegistraireImpl extends RegistrairePOA
{
    private CollectionEtudiantImpl _collectionEtudiant;
    
    public RegistraireImpl() {
    	_collectionEtudiant = new CollectionEtudiantImpl();
    }
    
	public CollectionEtudiant getListeEtudiants() {
		try {
			// Recuperer le POA cree dans le serveur
			POA rootpoa = Server._poa;

			// Activer l'objet et retourne l'objet CORBA
			org.omg.CORBA.Object obj = rootpoa
					.servant_to_reference(_collectionEtudiant);

			// Retourner une Collection d'etudiant
			return CollectionEtudiantHelper.narrow(obj);
			
		} catch (Exception e) {
			System.out.println("Erreur retour de l'objet CollectionEtudiant : "	+ e);
			return null;
		}
	}

	public void ajouterEtudiant(String codePermanent, String nom, String prenom) {
		EtudiantImpl etudiant = new EtudiantImpl(codePermanent, nom, prenom);
		_collectionEtudiant.getListeEtudiants().add(etudiant);
	}
}


