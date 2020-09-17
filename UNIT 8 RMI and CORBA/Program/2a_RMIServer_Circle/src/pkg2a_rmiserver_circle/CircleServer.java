package pkg2a_rmiserver_circle;

import compute.*;
import static java.lang.Math.PI;
import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.*;

public class CircleServer implements compute {
    @Override
    public double circlearea(double r) throws RemoteException {
        return PI*r*r;
    }
    public static void main(String[] args) {
        try {
            compute server = new CircleServer();
            final int PORT = 1111;
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

