package demo.academique;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "Cours"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class CoursPOATie
	extends CoursPOA
{
	private CoursOperations _delegate;

	private POA _poa;
	public CoursPOATie(CoursOperations delegate)
	{
		_delegate = delegate;
	}
	public CoursPOATie(CoursOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public demo.academique.Cours _this()
	{
		return demo.academique.CoursHelper.narrow(_this_object());
	}
	public demo.academique.Cours _this(org.omg.CORBA.ORB orb)
	{
		return demo.academique.CoursHelper.narrow(_this_object(orb));
	}
	public CoursOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(CoursOperations delegate)
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
	public java.lang.String titre()
	{
		return _delegate.titre();
	}

	public java.lang.String _toString()
	{
		return _delegate._toString();
	}

	public java.lang.String sigle()
	{
		return _delegate.sigle();
	}

}
