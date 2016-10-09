package demo.academique;


/**
 *	Generated from IDL interface "Registraire"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class _RegistraireStub
	extends org.omg.CORBA.portable.ObjectImpl
	implements demo.academique.Registraire
{
	private String[] ids = {"IDL:demo/academique/Registraire:1.0"};
	public String[] _ids()
	{
		return ids;
	}

	public final static java.lang.Class _opsClass = demo.academique.RegistraireOperations.class;
	public void ajouterEtudiant(java.lang.String codePermanent, java.lang.String nom, java.lang.String prenom)
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "ajouterEtudiant", true);
				_os.write_string(codePermanent);
				_os.write_string(nom);
				_os.write_string(prenom);
				_is = _invoke(_os);
				return;
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "ajouterEtudiant", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			RegistraireOperations _localServant = (RegistraireOperations)_so.servant;
			try
			{
			_localServant.ajouterEtudiant(codePermanent,nom,prenom);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public demo.academique.CollectionEtudiant getListeEtudiants()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getListeEtudiants", true);
				_is = _invoke(_os);
				demo.academique.CollectionEtudiant _result = demo.academique.CollectionEtudiantHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getListeEtudiants", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			RegistraireOperations _localServant = (RegistraireOperations)_so.servant;
			demo.academique.CollectionEtudiant _result;			try
			{
			_result = _localServant.getListeEtudiants();
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
