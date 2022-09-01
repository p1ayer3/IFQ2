import java.util.Random;
import java.net.*;
import java.io.IOException;
import java.sql.Timestamp;

public class Portscan {
	public static void main(String[] args) {
		for (int i = 1; i <= 5000; i++) {
			Timestamp ts = new Timestamp(1000);
			Timestamp start = new Timestamp(1);
			try {
				Socket socket = new Socket("127.0.0.1", i);
				System.out.println(socket);
				socket.close();
			} catch (Exception e) {

			}
		}
	}

}
