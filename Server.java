import java.io.*;
import java.net.*;

public class Server{
  ServerSocket serverSocket;
  Socket so;
  BufferedReader br;
  BufferedWriter bw;
  
  public Server(int port){
    try{
        //Avvio del server 
      serverSocket = new ServerSocket(port); 
    }catch(IOException ex){
      System.out.println("impossibile avviare il server");
    }  
  }

  public void Ascolto(){
    try{
      //Accetto i socket
      so = serverSocket.accept(); 
      System.out.println("accetta connessione");
      
    }catch(IOException ex){
      System.out.println("impossibile stabilire il socket");
    }
    
  }
   //Messaggio al client
  public void scrivi(String msg){
    try{
      bw = new BufferedWriter(new OutputStreamWriter(so.getOutputStream()));
     // /n per terminare l'invio 
      bw.write(msg+"\n"); 
      // flush per pulire 
      bw.flush();
    }catch(IOException ex){
      System.out.println("errore invio messaggio");
    }
    
  }
  
}