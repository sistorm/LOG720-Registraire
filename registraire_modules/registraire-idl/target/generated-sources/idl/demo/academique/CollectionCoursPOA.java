package demo.academique;

/**
 *	Generated from IDL interface "CollectionCours"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public abstract class CollectionCoursPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, demo.academique.CollectionCoursOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "getCours", new java.lang.Integer(0));
		m_opsHash.put ( "_get_size", new java.lang.Integer(1));
	}
	private String[] ids = {"IDL:demo/academique/CollectionCours:1.0"};
	public demo.academique.CollectionCours _this()
	{
		return demo.academique.CollectionCoursHelper.narrow(_this_object());
	}
	public demo.academique.CollectionCours _this(org.omg.CORBA.ORB orb)
	{
		return demo.academique.CollectionCoursHelper.narrow(_this_object(orb));
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
			case 0: // getCours
			{
				int _arg0=_input.read_long();
				_out = handler.createReply();
				demo.academique.CoursHelper.write(_out,getCours(_arg0));
				break;
			}
			case 1: // _get_size
			{
			_out = handler.createReply();
			_out.write_long(size());
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
