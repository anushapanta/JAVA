package pkg1_rmi_server;

import compute.*;
import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.*;

public class Server implements compute {
    @Override
    public double add(double a, double b) throws RemoteException {
        return a + b;
    }
    public static void main(String[] args) {
        try {
            compute server = new Server();
            final int PORT = 8888;
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

