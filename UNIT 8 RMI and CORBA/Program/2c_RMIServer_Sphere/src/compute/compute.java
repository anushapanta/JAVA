package compute;

import java.rmi.*;

public interface compute extends Remote {
    public double spherearea(double r)
        throws RemoteException;    
}
