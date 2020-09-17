package compute;

import java.rmi.*;

public interface compute extends Remote {
    public double circlearea(double r)
        throws RemoteException;    
}
