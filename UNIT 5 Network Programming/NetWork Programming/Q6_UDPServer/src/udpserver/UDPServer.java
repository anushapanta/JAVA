/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udpserver;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Date;

/**
 *
 * @author user
 */
public class UDPServer {

    DatagramSocket ds;
    DatagramPacket dp;
    InetAddress addr;
    public static void main(String[] args) throws Exception {
        UDPServer db = new UDPServer();
        db.sendDateTime();
    }
    public UDPServer() throws Exception{
        addr=InetAddress.getByName("localhost");
        ds=new DatagramSocket();
    }
    public void sendDateTime() throws Exception{
        byte[] buff;
        for(int i=1;i<=5;i++){
            Thread.sleep(2000);
            System.out.println("Sending Date and Time to Client");
            String s=(new Date()).toString();
            buff=s.getBytes();
            dp=new DatagramPacket(buff,buff.length,addr,1234);
            ds.send(dp);
        }
    }
    
}
