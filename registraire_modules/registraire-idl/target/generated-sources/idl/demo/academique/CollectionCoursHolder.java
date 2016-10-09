package demo.academique;

/**
 *	Generated from IDL interface "CollectionCours"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public final class CollectionCoursHolder	implements org.omg.CORBA.portable.Streamable{
	 public CollectionCours value;
	public CollectionCoursHolder()
	{
	}
	public CollectionCoursHolder (final CollectionCours initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return CollectionCoursHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = CollectionCoursHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		CollectionCoursHelper.write (_out,value);
	}
}
