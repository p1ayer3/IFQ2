import java.util.Random;
public class QOTDServer extends Server{
     String[] q = new String[10]; 
	public QOTDServer()
    { 
      super(49154); 
      System.out.println("Server gestartet");
      q[0] = "mada mada dane";
      q[1] = "The grindset isn’t too hard, you’re too weak.";
      q[2] = "I’m the quiet type of guy that will surprise you when they decide to talk.";
      q[3] = "Pain heals. Chicks dig scars. GLORY";
      q[4] = "Respect is something that individuals have no choice but to accept.";
      q[5] = "A man is but the product of his thoughts. What he thinks, he becomes";
      q[6] = "A person who thinks all the time has nothing to think about except thoughts";
      q[7] = "I don’t care what people think unless it’s about me";
      q[8] = "<<OMG Stop beating my child with a lead Pipe!>> - <<No>>";
      q[9] = "I became the most googled man on the planet and to a degree I'm the victim of my own success";
    }

    public  void processNewConnection(String pClientIP, int pClientPort) {
    	 Random r = new Random();
    	int a = r.nextInt(10);
    	send(pClientIP, pClientPort, q[a]+"----pmp");
    }

    public void processMessage(String pClientIP, int pClientPort, String pMessage) {
    }

    public void processClosingConnection(String pClientIP, int pClientPort) {
    }

}
