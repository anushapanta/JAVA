package compute;

import java.rmi.*;

public interface compute extends Remote {
    public double rectanglearea(double l,double b)
        throws RemoteException;    
}
