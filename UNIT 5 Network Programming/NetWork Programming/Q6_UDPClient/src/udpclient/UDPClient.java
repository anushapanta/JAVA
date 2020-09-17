/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udpclient;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 *
 * @author user
 */
public class UDPClient {

    DatagramSocket ds;
    DatagramPacket dp;
    public static void main(String[] args) {
        UDPClient client=new UDPClient();
        client.receiveDateTime();        
    }
    public void receiveDateTime(){
        byte b[]=new byte[64];
        String str;
        try{
            ds=new DatagramSocket(1234);
            dp=new DatagramPacket(b,b.length);
            while(true){
                ds.receive(dp);
                str=new String(dp.getData());
                System.out.println("Time Signal Received from"+dp.getAddress()+
                        "\nTime is:"+str);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
}
