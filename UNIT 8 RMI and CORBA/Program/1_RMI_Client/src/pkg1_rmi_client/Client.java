package pkg1_rmi_client;

import compute.*;
import java.rmi.*;

public class Client {
    public static void main(String[] args) {
        try {
            String url = "rmi://127.0.0.1:8888/server";
            compute server = (compute)Naming.lookup(url);
            double result = server.add(50, 15);
            System.out.println("result = " + result);
        }
        catch(Exception e) {
            System.err.println("Remote exception: ");
            e.printStackTrace();
        }
    }
}

