package it.edu.maxplanck.tcpbasic;

import java.io.IOException;

public class MainServer {
public static void main(String[] args) {
	Server server;
	
	try {
		server = new Server(8081);
	} catch (IOException e) {
		System.out.println("[🗙] Errore, problemi nella creazione del socket");
		return;
	}
	
	server.start();
	
	
	
}
}
