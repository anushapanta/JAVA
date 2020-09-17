package pkg2b_rmiserver_rectangle;

import compute.*;
import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.*;

public class ServerRectangle implements compute {
    @Override
    public double rectanglearea(double l,double b) throws RemoteException {
        return l*b;
    }
    public static void main(String[] args) {
        try {
            compute server = new ServerRectangle();
            final int PORT = 2222;
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

