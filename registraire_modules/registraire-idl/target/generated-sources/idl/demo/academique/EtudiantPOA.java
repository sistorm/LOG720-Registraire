package demo.academique;

/**
 *	Generated from IDL interface "Etudiant"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public abstract class EtudiantPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, demo.academique.EtudiantOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "_get_prenom", new java.lang.Integer(0));
		m_opsHash.put ( "ajouterCours", new java.lang.Integer(1));
		m_opsHash.put ( "_get_nom", new java.lang.Integer(2));
		m_opsHash.put ( "toString", new java.lang.Integer(3));
		m_opsHash.put ( "_get_codePermanent", new java.lang.Integer(4));
		m_opsHash.put ( "getListeCours", new java.lang.Integer(5));
		m_opsHash.put ( "_set_codePermanent", new java.lang.Integer(6));
		m_opsHash.put ( "_set_prenom", new java.lang.Integer(7));
		m_opsHash.put ( "_set_nom", new java.lang.Integer(8));
	}
	private String[] ids = {"IDL:demo/academique/Etudiant:1.0"};
	public demo.academique.Etudiant _this()
	{
		return demo.academique.EtudiantHelper.narrow(_this_object());
	}
	public demo.academique.Etudiant _this(org.omg.CORBA.ORB orb)
	{
		return demo.academique.EtudiantHelper.narrow(_this_object(orb));
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
			case 0: // _get_prenom
			{
			_out = handler.createReply();
			_out.write_string(prenom());
				break;
			}
			case 1: // ajouterCours
			{
				java.lang.String _arg0=_input.read_string();
				java.lang.String _arg1=_input.read_string();
				_out = handler.createReply();
				ajouterCours(_arg0,_arg1);
				break;
			}
			case 2: // _get_nom
			{
			_out = handler.createReply();
			_out.write_string(nom());
				break;
			}
			case 3: // toString
			{
				_out = handler.createReply();
				_out.write_string(_toString());
				break;
			}
			case 4: // _get_codePermanent
			{
			_out = handler.createReply();
			_out.write_string(codePermanent());
				break;
			}
			case 5: // getListeCours
			{
				_out = handler.createReply();
				demo.academique.CollectionCoursHelper.write(_out,getListeCours());
				break;
			}
			case 6: // _set_codePermanent
			{
			_out = handler.createReply();
			codePermanent(_input.read_string());
				break;
			}
			case 7: // _set_prenom
			{
			_out = handler.createReply();
			prenom(_input.read_string());
				break;
			}
			case 8: // _set_nom
			{
			_out = handler.createReply();
			nom(_input.read_string());
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
