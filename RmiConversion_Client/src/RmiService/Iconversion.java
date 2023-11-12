package RmiService;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Iconversion extends Remote 
{
 public double convertirMontant (double nxt) throws RemoteException ;	

}
