package RmiClient;

import java.rmi.Naming;

import RmiService.Iconversion;

public class ConversionClient {
	public static void main(String[] args) {

		try {

			Iconversion remoteObj = (Iconversion) Naming.lookup("rmi://localhost:1099/ObjetDistant");

			double result = remoteObj.convertirMontant(100);

			System.out.println("Result from server: " + result);

		} catch (Exception e) {

			e.printStackTrace();

		}

	}
}
