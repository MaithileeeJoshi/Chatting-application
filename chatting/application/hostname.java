/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chatting.application;

import java.net.InetAddress;
import java.net.UnknownHostException;
public class hostname {
    public static void main(String agrs[]) throws UnknownHostException{
            InetAddress ip = InetAddress.getByName("localhost");
              System.out.print(ip);
    }
}
