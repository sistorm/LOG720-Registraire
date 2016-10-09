package demo.academique;

/**
 *	Generated from IDL interface "Registraire"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public final class RegistraireHolder	implements org.omg.CORBA.portable.Streamable{
	 public Registraire value;
	public RegistraireHolder()
	{
	}
	public RegistraireHolder (final Registraire initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return RegistraireHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = RegistraireHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		RegistraireHelper.write (_out,value);
	}
}
