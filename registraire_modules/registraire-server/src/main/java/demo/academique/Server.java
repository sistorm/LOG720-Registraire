package demo.academique;

import org.omg.CosNaming.NameComponent;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;

public class Server {
	protected static org.omg.PortableServer.POA _poa;
	
	public static void main(String[] args) {
		// Initialize ORB
		org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init(args, null);
		
		try {
			org.omg.PortableServer.Servant servant;
			org.omg.CORBA.Object o;

			// Initialize POA
			_poa = org.omg.PortableServer.POAHelper
					.narrow(orb.resolve_initial_references("RootPOA"));
			_poa.the_POAManager().activate();

			// Initialize servant (Remote Object), convert to CORBA reference
			servant = new RegistraireImpl();
			o = _poa.servant_to_reference(servant);

			// Register Rermote Object with naming context
			NamingContextExt nc = NamingContextExtHelper.narrow(orb
					.resolve_initial_references("NameService"));
			NameComponent[] name = new NameComponent[] { new NameComponent(
					"Registraire", "service") };
			nc.rebind(name, o);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// Start the ORB main thread
		orb.run();
	}
}
