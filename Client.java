import java.net.*;
import java.io.*;


public class Client{
  
  //Avvio il socket 
  Socket so; 
   //Avvio dei buffer per scrittura e lettura 
  BufferedReader br;
  BufferedWriter bw;
  
  public Client(int port, InetAddress ip){
    try{
      //avvio il socket tramite ip e la porta
      so = new Socket(ip, port);
      
      br = new BufferedReader(new InputStreamReader(so.getInputStream())); 
      
    }catch(IOException ex){
      // catch in caso di errore ne l'avvio 
      System.out.println("impossibile avviare il socket");
    }
    
  }

  public String leggi(){
    // inizzializzo la varibile a cui passo il messaggio letto 
	  String Messaggio;
    try{
      // leggo il messaggio 
      Messaggio = br.readLine();   
    }catch(IOException ex){
      
      System.out.println("Errore nella lettura del messaggio");
    }
    return Messaggio;
  }
  
}