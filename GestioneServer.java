public class GestioneServer{
  
  public static void main(String[] args){
    //Avvio server 
    Server server = new Server(30000); 
    // avvio il server per accetare i soket
    server.Ascolto(); 
    
    server.scrivi("Ciao, benvenuto nel server pro <3!"); 
  }
}