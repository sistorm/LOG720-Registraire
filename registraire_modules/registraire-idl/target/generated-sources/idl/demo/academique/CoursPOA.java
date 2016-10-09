package demo.academique;

/**
 *	Generated from IDL interface "Cours"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public abstract class CoursPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, demo.academique.CoursOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "_get_titre", new java.lang.Integer(0));
		m_opsHash.put ( "toString", new java.lang.Integer(1));
		m_opsHash.put ( "_get_sigle", new java.lang.Integer(2));
	}
	private String[] ids = {"IDL:demo/academique/Cours:1.0"};
	public demo.academique.Cours _this()
	{
		return demo.academique.CoursHelper.narrow(_this_object());
	}
	public demo.academique.Cours _this(org.omg.CORBA.ORB orb)
	{
		return demo.academique.CoursHelper.narrow(_this_object(orb));
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
			case 0: // _get_titre
			{
			_out = handler.createReply();
			_out.write_string(titre());
				break;
			}
			case 1: // toString
			{
				_out = handler.createReply();
				_out.write_string(_toString());
				break;
			}
			case 2: // _get_sigle
			{
			_out = handler.createReply();
			_out.write_string(sigle());
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
