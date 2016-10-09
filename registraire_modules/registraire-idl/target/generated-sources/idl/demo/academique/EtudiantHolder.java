package demo.academique;

/**
 *	Generated from IDL interface "Etudiant"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public final class EtudiantHolder	implements org.omg.CORBA.portable.Streamable{
	 public Etudiant value;
	public EtudiantHolder()
	{
	}
	public EtudiantHolder (final Etudiant initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return EtudiantHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = EtudiantHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		EtudiantHelper.write (_out,value);
	}
}
