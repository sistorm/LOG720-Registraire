package demo.academique;

/**
 *	Generated from IDL interface "CollectionEtudiant"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public final class CollectionEtudiantHolder	implements org.omg.CORBA.portable.Streamable{
	 public CollectionEtudiant value;
	public CollectionEtudiantHolder()
	{
	}
	public CollectionEtudiantHolder (final CollectionEtudiant initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return CollectionEtudiantHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = CollectionEtudiantHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		CollectionEtudiantHelper.write (_out,value);
	}
}
