package demo.academique;


/**
 *	Generated from IDL interface "Registraire"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public final class RegistraireHelper
{
	public static void insert (final org.omg.CORBA.Any any, final demo.academique.Registraire s)
	{
			any.insert_Object(s);
	}
	public static demo.academique.Registraire extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:demo/academique/Registraire:1.0", "Registraire");
	}
	public static String id()
	{
		return "IDL:demo/academique/Registraire:1.0";
	}
	public static Registraire read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object());
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final demo.academique.Registraire s)
	{
		_out.write_Object(s);
	}
	public static demo.academique.Registraire narrow(final java.lang.Object obj)
	{
		if (obj instanceof demo.academique.Registraire)
		{
			return (demo.academique.Registraire)obj;
		}
		else if (obj instanceof org.omg.CORBA.Object)
		{
			return narrow((org.omg.CORBA.Object)obj);
		}
		throw new org.omg.CORBA.BAD_PARAM("Failed to narrow in helper");
	}
	public static demo.academique.Registraire narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
			return null;
		try
		{
			return (demo.academique.Registraire)obj;
		}
		catch (ClassCastException c)
		{
			if (obj._is_a("IDL:demo/academique/Registraire:1.0"))
			{
				demo.academique._RegistraireStub stub;
				stub = new demo.academique._RegistraireStub();
				stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
				return stub;
			}
		}
		throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
	}
	public static demo.academique.Registraire unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
			return null;
		try
		{
			return (demo.academique.Registraire)obj;
		}
		catch (ClassCastException c)
		{
				demo.academique._RegistraireStub stub;
				stub = new demo.academique._RegistraireStub();
				stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
				return stub;
		}
	}
}
