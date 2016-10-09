package demo.academique;

/**
 *	Generated from IDL interface "Cours"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public final class CoursHolder	implements org.omg.CORBA.portable.Streamable{
	 public Cours value;
	public CoursHolder()
	{
	}
	public CoursHolder (final Cours initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return CoursHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = CoursHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		CoursHelper.write (_out,value);
	}
}
