package RmiService ; 

import java.rmi.RemoteException;

import java.rmi.server.UnicastRemoteObject;

public class ConversionImpl extends UnicastRemoteObject implements Iconversion {

	public ConversionImpl() throws RemoteException

	{

		super();

	}

	public double convertirMontant(double mt) throws RemoteException

	{

		return mt * 3.3;

	}

	
}