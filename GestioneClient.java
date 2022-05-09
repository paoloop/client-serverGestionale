
import java.net.UnknownHostException;

public class GestioneClient{
  
  public static void main(String[] args){
    try{
      // avvio il client con la porta del server e l' ip 
      Client client = new Client(3000, "127.0.0.1"); 

      // leggo il messaggio ricevuto 
      String messaggio = client.leggi();
      // stampo il messaggio 
      System.out.println(messaggio);
    }catch(UnknownHostException ex){
      System.out.println("Impossibile connettersi");
      
    }
    
  }
}
