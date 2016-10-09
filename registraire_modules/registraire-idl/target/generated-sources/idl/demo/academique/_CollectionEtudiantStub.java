package demo.academique;


/**
 *	Generated from IDL interface "CollectionEtudiant"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class _CollectionEtudiantStub
	extends org.omg.CORBA.portable.ObjectImpl
	implements demo.academique.CollectionEtudiant
{
	private String[] ids = {"IDL:demo/academique/CollectionEtudiant:1.0"};
	public String[] _ids()
	{
		return ids;
	}

	public final static java.lang.Class _opsClass = demo.academique.CollectionEtudiantOperations.class;
	public demo.academique.Etudiant getEtudiant(int index)
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getEtudiant", true);
				_os.write_long(index);
				_is = _invoke(_os);
				demo.academique.Etudiant _result = demo.academique.EtudiantHelper.read(_is);
				return _result;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getEtudiant", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			CollectionEtudiantOperations _localServant = (CollectionEtudiantOperations)_so.servant;
			demo.academique.Etudiant _result;			try
			{
			_result = _localServant.getEtudiant(index);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public int size()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request("_get_size",true);
				_is = _invoke(_os);
				return _is.read_long();
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}

		else
		{
		org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "_get_size", _opsClass);
		if( _so == null )
			throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			CollectionEtudiantOperations _localServant = (CollectionEtudiantOperations)_so.servant;
			int _result;
		try
		{
			_result = _localServant.size();
		}
		finally
		{
			_servant_postinvoke(_so);
		}
		return _result;
		}
		}

	}

}
