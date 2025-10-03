package it.edu.maxplanck.tcpbasic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	private int port;
	private String address;

	public Client(String address, int port) {
		this.address=address;
		this.port=port;
	}
	
	public void start() {
		Socket socket = null;
		
		try {
			socket = new Socket("localhost", 8081);
			
			System.out.println("[✓]Client: connessione riuscita, creazione canali i/o...");
			BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			BufferedWriter output = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			communicate(input, output);
		} catch (UnknownHostException e) {
			System.out.println("[x]Client: indirizzo sconosciuto");
			e.printStackTrace();
			return;
		} catch (IOException e) {
			System.out.println("[x]Client: impossibile connettersi al server ("+address+"/"+port+")");
			e.printStackTrace();
			return;
		}
		
	}

	private void communicate(BufferedReader input, BufferedWriter output) {
				
	}
}
