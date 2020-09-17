package compute;

import java.rmi.*;

public interface compute extends Remote {
    public double add(double a, double b)
        throws RemoteException;    
}
