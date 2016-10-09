package demo.academique;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "Etudiant"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class EtudiantPOATie
	extends EtudiantPOA
{
	private EtudiantOperations _delegate;

	private POA _poa;
	public EtudiantPOATie(EtudiantOperations delegate)
	{
		_delegate = delegate;
	}
	public EtudiantPOATie(EtudiantOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public demo.academique.Etudiant _this()
	{
		return demo.academique.EtudiantHelper.narrow(_this_object());
	}
	public demo.academique.Etudiant _this(org.omg.CORBA.ORB orb)
	{
		return demo.academique.EtudiantHelper.narrow(_this_object(orb));
	}
	public EtudiantOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(EtudiantOperations delegate)
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
	public java.lang.String prenom()
	{
		return _delegate.prenom();
	}

	public void ajouterCours(java.lang.String sigle, java.lang.String titre)
	{
_delegate.ajouterCours(sigle,titre);
	}

	public java.lang.String nom()
	{
		return _delegate.nom();
	}

	public java.lang.String _toString()
	{
		return _delegate._toString();
	}

	public java.lang.String codePermanent()
	{
		return _delegate.codePermanent();
	}

	public demo.academique.CollectionCours getListeCours()
	{
		return _delegate.getListeCours();
	}

	public void codePermanent(java.lang.String a)
	{
		_delegate.codePermanent(a);
	}

	public void prenom(java.lang.String a)
	{
		_delegate.prenom(a);
	}

	public void nom(java.lang.String a)
	{
		_delegate.nom(a);
	}

}
