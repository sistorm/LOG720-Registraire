package demo.academique;


/**
 *	Generated from IDL interface "CollectionCours"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class _CollectionCoursStub
	extends org.omg.CORBA.portable.ObjectImpl
	implements demo.academique.CollectionCours
{
	private String[] ids = {"IDL:demo/academique/CollectionCours:1.0"};
	public String[] _ids()
	{
		return ids;
	}

	public final static java.lang.Class _opsClass = demo.academique.CollectionCoursOperations.class;
	public demo.academique.Cours getCours(int index)
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getCours", true);
				_os.write_long(index);
				_is = _invoke(_os);
				demo.academique.Cours _result = demo.academique.CoursHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getCours", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			CollectionCoursOperations _localServant = (CollectionCoursOperations)_so.servant;
			demo.academique.Cours _result;			try
			{
			_result = _localServant.getCours(index);
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
			CollectionCoursOperations _localServant = (CollectionCoursOperations)_so.servant;
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
