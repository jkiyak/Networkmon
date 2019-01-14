import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import edu.uab.cs203.Team;
import edu.uab.cs203.network.GymClient;
import edu.uab.cs203.network.GymServer;
import edu.uab.cs203.network.NetworkGym;

public class ObjectmonServer extends UnicastRemoteObject implements  GymServer, NetworkGym {

	protected ObjectmonServer() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String networkToString() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void printMessage(String message) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registerClientA(String host, int port, String registryName) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registerClientB(String host, int port, String registryName) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setTeamA(Team arg0) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setTeamAReady(boolean arg0) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setTeamB(Team arg0) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setTeamBReady(boolean arg0) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void executeTurn() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fight(int arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public GymClient getClientA() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GymClient getClientB() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Team getTeamA() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Team getTeamB() {
		// TODO Auto-generated method stub
		return null;
	}

}
