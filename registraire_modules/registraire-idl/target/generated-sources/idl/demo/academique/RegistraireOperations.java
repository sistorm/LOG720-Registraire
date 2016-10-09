package demo.academique;

/**
 *	Generated from IDL interface "Registraire"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface RegistraireOperations
{
	/* constants */
	/* operations  */
	demo.academique.CollectionEtudiant getListeEtudiants();
	void ajouterEtudiant(java.lang.String codePermanent, java.lang.String nom, java.lang.String prenom);
}
