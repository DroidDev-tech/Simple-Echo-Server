 //---- Ibrahim Stephen Jatau  ---- //
import java.net.*;
import java.util.*;

 public  class clientUDP {




     public static void main(String[] args){


         try {

             DatagramSocket datagramSocket = new DatagramSocket();
             InetAddress ipAddress = InetAddress.getByName("127.0.0.1");

             System.out.println("Hello.. Welcome to UDP Java Echo Server");
             System.out.println("Enter LEAVE to exit");


             Scanner scan= new Scanner(System.in);
             System.out.print("Enter a message: ");



             System.out.flush();

             while (true)
             {


                 String str= scan.nextLine();
                 if (str == null)
                     break;


                 byte[] ion = str.getBytes();

                 DatagramPacket datagramPacket =
                         new DatagramPacket(
                                 ion,
                                 ion.length,
                                 ipAddress,
                                 3233);



                 datagramSocket.send(datagramPacket);




                 System.out.println("Echo:" + str);
                 System.out.flush();

                 if (str.trim().equals("LEAVE"))
                     break;
             }
             datagramSocket.close();


         }catch (Exception e) {

             e.printStackTrace();
         }
     }
 }
