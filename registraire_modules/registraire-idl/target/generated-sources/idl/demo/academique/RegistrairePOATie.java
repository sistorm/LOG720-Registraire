package demo.academique;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "Registraire"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class RegistrairePOATie
	extends RegistrairePOA
{
	private RegistraireOperations _delegate;

	private POA _poa;
	public RegistrairePOATie(RegistraireOperations delegate)
	{
		_delegate = delegate;
	}
	public RegistrairePOATie(RegistraireOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public demo.academique.Registraire _this()
	{
		return demo.academique.RegistraireHelper.narrow(_this_object());
	}
	public demo.academique.Registraire _this(org.omg.CORBA.ORB orb)
	{
		return demo.academique.RegistraireHelper.narrow(_this_object(orb));
	}
	public RegistraireOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(RegistraireOperations delegate)
	{
		_delegate = delegate;
	}
	public POA _default_POA()
	{
		if (_poa != null)
		{
			return _poa;
		}
		else
		{
			return super._default_POA();
		}
	}
	public void ajouterEtudiant(java.lang.String codePermanent, java.lang.String nom, java.lang.String prenom)
	{
_delegate.ajouterEtudiant(codePermanent,nom,prenom);
	}

	public demo.academique.CollectionEtudiant getListeEtudiants()
	{
		return _delegate.getListeEtudiants();
	}

}
