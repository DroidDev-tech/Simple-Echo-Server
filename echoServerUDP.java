//---- Ibrahim Stephen Jatau ---- //
import java.net.*;

public class echoServerUDP {


    public static void main(String[] args){


        try {
            DatagramSocket datagramServer =
                    new DatagramSocket(3233);


            byte[] ion = new byte[1024];

            DatagramPacket datagramPacket =
                    new DatagramPacket(
                            ion,
                            1024);

            datagramServer.receive(datagramPacket);
            InetAddress ipAddress = datagramPacket.getAddress();

            String str = new String(
                    datagramPacket.getData(),
                    0,
                    datagramPacket.getLength()
            );
            System.out.println(ipAddress +" says >" + str);

            datagramServer.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}

