package it.edu.maxplanck.tcpbasic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	private ServerSocket socket;
	private int port;
	
	public Server(int port) throws IOException {
		this.port=port;
		socket = new ServerSocket(port);
	}
	
	public boolean isReady() {
		return socket.isBound();
	}

	public void start() {
		Socket socket;
		try {
			socket = this.socket.accept();
			
			System.out.println("[✓] Connessione accettata, crazione dei canali i/o socket...");
			BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			BufferedWriter output = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			comunicate(input, output);
			
			System.out.println("[✓] Comunicazione conclusa, chisura dei canali i/o del socket...");
			output.close();
			input.close();
			socket.close();
			
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
	}

	private void comunicate(BufferedReader input, BufferedWriter output) throws IOException {
		String req ="";
		String res="";
		
		while(req.equals("CLOSE")) {
			req = input.readLine();
			
			if(req==null) {
				System.out.println("[✓]Server: client ha chiuso/perso la connessione");
				break;
			}
			
			if(!req.equals("EXIT")) {
				System.out.println("[✓]Server: ricevuto la richiesta: {"+req+"}");
				res=req.toUpperCase();
			}else{
				System.out.println("[✓]Server: client ha richiesto la chiusura della connessione");
				res="CLOSE";
			}
			
			output.write(res+"\n");
			output.flush();
			System.out.println("[✓]Server: risposta inviata in rete");
		}
		
	}
}
