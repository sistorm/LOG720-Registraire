package demo.academique;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "CollectionCours"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class CollectionCoursPOATie
	extends CollectionCoursPOA
{
	private CollectionCoursOperations _delegate;

	private POA _poa;
	public CollectionCoursPOATie(CollectionCoursOperations delegate)
	{
		_delegate = delegate;
	}
	public CollectionCoursPOATie(CollectionCoursOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public demo.academique.CollectionCours _this()
	{
		return demo.academique.CollectionCoursHelper.narrow(_this_object());
	}
	public demo.academique.CollectionCours _this(org.omg.CORBA.ORB orb)
	{
		return demo.academique.CollectionCoursHelper.narrow(_this_object(orb));
	}
	public CollectionCoursOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(CollectionCoursOperations delegate)
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
	public demo.academique.Cours getCours(int index)
	{
		return _delegate.getCours(index);
	}

	public int size()
	{
		return _delegate.size();
	}

}
