package demo.academique;

/**
 *	Generated from IDL interface "Etudiant"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface EtudiantOperations
{
	/* constants */
	/* operations  */
	java.lang.String codePermanent();
	void codePermanent(java.lang.String arg);
	java.lang.String nom();
	void nom(java.lang.String arg);
	java.lang.String prenom();
	void prenom(java.lang.String arg);
	void ajouterCours(java.lang.String sigle, java.lang.String titre);
	demo.academique.CollectionCours getListeCours();
	java.lang.String _toString();
}
