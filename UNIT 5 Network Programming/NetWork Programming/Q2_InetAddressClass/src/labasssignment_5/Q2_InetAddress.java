/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labasssignment_5;

import java.net.InetAddress;

/**
 *
 * @author user
 */
public class Q2_InetAddress {

    public static void main(String[] args) {
        try {
            InetAddress ip = InetAddress.getByName("www.trinitycollege.edu.np");

            System.out.println("Host Name: " + ip.getHostName());
            System.out.println("IP Address: " + ip.getHostAddress());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
