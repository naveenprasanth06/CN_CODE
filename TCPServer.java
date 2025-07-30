import java.io.*;
 import java.net.*;
public class TCPServer
{ 
  public static void main(String s[])throws IOException
  {
    //try {//  Initialising the ServerSocket
      ServerSocket sok = new ServerSocket(3128); 
         // Gives the Server Details Machine name, Port number
            System.out.println("Server Started  :"+sok);
         // makes a socket connection to particular client after 
              // which two way communication take place 
           Socket so = sok.accept();
           System.out.println("Client Connected  :"+ so);   
           InputStream in = so.getInputStream(); 
           OutputStream os = so.getOutputStream();
           PrintWriter pr = new PrintWriter(os);
BufferedReader br = new BufferedReader(new  InputStreamReader(in));
BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));      
while(true)
           {
               System.out.println("Msg  frm client: "+ br.readLine());
 System.out.print("Msg to client: "); 
               pr.println(br1.readLine());
               pr.flush();
           }
      }   }



