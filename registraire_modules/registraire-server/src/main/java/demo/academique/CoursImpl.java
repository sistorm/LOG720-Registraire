package demo.academique;

public class CoursImpl extends CoursPOA {
	private String _sigle;
	private String _titre;
	
	public CoursImpl(String sigle, String titre) {
		_sigle = sigle;
		_titre = titre;
	}

	public String sigle() {
		return _sigle;
	}

	public String titre() {
		return _titre;
	}

	public String _toString() {
		return (_sigle + " - " + _titre);
	}

}
