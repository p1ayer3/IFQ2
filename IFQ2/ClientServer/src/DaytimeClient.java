import javax.swing.JOptionPane;

public class DaytimeClient extends Client{

		  public DaytimeClient(String pServerIP, int pServerPort) {
		      super(pServerIP, pServerPort);
		  }

		  public void processMessage(String pMessage) {
		    JOptionPane.showMessageDialog(null,"Server sendet:\n" 
		+ pMessage);
		  }
		    
		
}
