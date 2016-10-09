package demo.academique;

/**
 *	Generated from IDL interface "Registraire"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public abstract class RegistrairePOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, demo.academique.RegistraireOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "ajouterEtudiant", new java.lang.Integer(0));
		m_opsHash.put ( "getListeEtudiants", new java.lang.Integer(1));
	}
	private String[] ids = {"IDL:demo/academique/Registraire:1.0"};
	public demo.academique.Registraire _this()
	{
		return demo.academique.RegistraireHelper.narrow(_this_object());
	}
	public demo.academique.Registraire _this(org.omg.CORBA.ORB orb)
	{
		return demo.academique.RegistraireHelper.narrow(_this_object(orb));
	}
	public org.omg.CORBA.portable.OutputStream _invoke(String method, org.omg.CORBA.portable.InputStream _input, org.omg.CORBA.portable.ResponseHandler handler)
		throws org.omg.CORBA.SystemException
	{
		org.omg.CORBA.portable.OutputStream _out = null;
		// do something
		// quick lookup of operation
		java.lang.Integer opsIndex = (java.lang.Integer)m_opsHash.get ( method );
		if ( null == opsIndex )
			throw new org.omg.CORBA.BAD_OPERATION(method + " not found");
		switch ( opsIndex.intValue() )
		{
			case 0: // ajouterEtudiant
			{
				java.lang.String _arg0=_input.read_string();
				java.lang.String _arg1=_input.read_string();
				java.lang.String _arg2=_input.read_string();
				_out = handler.createReply();
				ajouterEtudiant(_arg0,_arg1,_arg2);
				break;
			}
			case 1: // getListeEtudiants
			{
				_out = handler.createReply();
				demo.academique.CollectionEtudiantHelper.write(_out,getListeEtudiants());
				break;
			}
		}
		return _out;
	}

	public String[] _all_interfaces(org.omg.PortableServer.POA poa, byte[] obj_id)
	{
		return ids;
	}
}
