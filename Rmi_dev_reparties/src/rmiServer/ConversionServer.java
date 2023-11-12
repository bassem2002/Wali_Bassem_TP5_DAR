package rmiServer;

import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.RemoteException;

import java.rmi.registry.LocateRegistry;

import RmiService.ConversionImpl;

public class ConversionServer implements Remote {
	public static void main(String[] args)

	{

		try {

			LocateRegistry.createRegistry(1099);

			ConversionServer od = new ConversionServer();

			Naming.rebind("rmi://localhost:1099/ObjetDistant", od);

		} catch (Exception e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		}

	}
}
