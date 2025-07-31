import java.io.*;
import java.net.*;
public class TCPClient
{ 
 public static void main(String s[])throws IOException
 { 
  Socket sok = new Socket("localhost",3128); {
    InputStream in = sok.getInputStream(); 
      OutputStream ou = sok.getOutputStream();
      PrintWriter pr = new PrintWriter(ou); 
      BufferedReader br1 = new BufferedReader(new InputStreamReader(in));
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
      while(true)
      { 
       System.out.print("Msg to Server:");
       pr.println(br.readLine()); 
       pr.flush();
       System.out.println("Msg  frm server: "+br1.readLine()); 
      }
}
 } 
}    

