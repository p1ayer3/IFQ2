
import javax.swing.JOptionPane;

public class QOTDClient extends Client {

	public QOTDClient(String pServerIP) {
		super(pServerIP, 49154);
		send("Test");
	}

	public void processMessage(String pMessage) {
		JOptionPane.showMessageDialog(null, "Server sendet:\n" + pMessage);
	}

}

