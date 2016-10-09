package demo.academique;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "CollectionEtudiant"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class CollectionEtudiantPOATie
	extends CollectionEtudiantPOA
{
	private CollectionEtudiantOperations _delegate;

	private POA _poa;
	public CollectionEtudiantPOATie(CollectionEtudiantOperations delegate)
	{
		_delegate = delegate;
	}
	public CollectionEtudiantPOATie(CollectionEtudiantOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public demo.academique.CollectionEtudiant _this()
	{
		return demo.academique.CollectionEtudiantHelper.narrow(_this_object());
	}
	public demo.academique.CollectionEtudiant _this(org.omg.CORBA.ORB orb)
	{
		return demo.academique.CollectionEtudiantHelper.narrow(_this_object(orb));
	}
	public CollectionEtudiantOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(CollectionEtudiantOperations delegate)
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
	public demo.academique.Etudiant getEtudiant(int index)
	{
		return _delegate.getEtudiant(index);
	}

	public int size()
	{
		return _delegate.size();
	}

}
