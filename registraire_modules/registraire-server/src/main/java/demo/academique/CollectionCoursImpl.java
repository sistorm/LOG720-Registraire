package demo.academique;

import java.util.ArrayList;
import org.omg.PortableServer.POA;

public class CollectionCoursImpl extends CollectionCoursPOA {

	private ArrayList<CoursImpl> _listeCours;

	public CollectionCoursImpl() {
		_listeCours = new ArrayList<CoursImpl>();
	}

	public Cours getCours(int index) {
		try {
			// Trouver le cours correspondant au parametre "index"
			CoursImpl cours = _listeCours.get(index);

			// REcuperer le POA cree dans le serveur
			POA rootpoa = Server._poa;

			// Activer l'objet et retourner l'objet CORBA
			org.omg.CORBA.Object obj = rootpoa.servant_to_reference(cours);

			// Retourner un Cours
			return CoursHelper.narrow(obj);
		} catch (Exception e) {
			System.out.println("Erreur retour de l'objet Cours : " + e);
			return null;
		}
	}

	public int size() {
		return _listeCours.size();
	}

	protected ArrayList<CoursImpl> getListeCours() {
		return _listeCours;
	}
}
