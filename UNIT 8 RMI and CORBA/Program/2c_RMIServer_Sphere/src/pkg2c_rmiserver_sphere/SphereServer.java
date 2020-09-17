package pkg2c_rmiserver_sphere;

import compute.*;
import static java.lang.Math.PI;
import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.*;

public class SphereServer implements compute {
    @Override
    public double spherearea(double r) throws RemoteException {
        return (double)(4*PI*r*r)/3;
    }
    public static void main(String[] args) {
        try {
            compute server = new SphereServer();
            final int PORT = 3333;
            Registry registry = LocateRegistry.createRegistry(PORT);
            UnicastRemoteObject.exportObject(server, PORT);
            registry.rebind("server", server);
            System.out.println("Server started...");
        } catch(Exception e) {
            System.err.println("ComputeEngine exception:");
            e.printStackTrace();
        }
    }
}

