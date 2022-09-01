import java.time.LocalDateTime;

public class DaytimeServer extends Server{
	public DaytimeServer()
    { 
      super(7); 
      System.out.println("Server gestartet");
    }

    public  void processNewConnection(String pClientIP, int pClientPort) {
    	send(pClientIP, pClientPort, LocalDateTime.now().toString());
    }

    public void processMessage(String pClientIP, int pClientPort, String pMessage) {
     
    }

    public void processClosingConnection(String pClientIP, int pClientPort) {
    	
    }
       

}
