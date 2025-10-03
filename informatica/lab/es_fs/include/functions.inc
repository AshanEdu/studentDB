<?php

function init_session(){
	session_start();
	$_SESSION["err"]="";
}

function check_inputs(){
	if(empty($_POST["surname"])){
		$_SESSION["err"].="[!] Errore, cognome non inserito\n";
	}
	if(empty($_POST["name"])){
		$_SESSION["err"].="[!] Errore, nome non inserito\n";
	}
	if(empty($_POST["address"])){
		$_SESSION["err"].="[!] Errore, indirizzo non inserito\n";
	}
	if(empty($_POST["city"])){
		$_SESSION["err"].="[!] Errore, città non inserita\n";
	}
	return empty($_SESSION["err"]);
}

function count_elements($fileName){
	$i=0;
	$pf=fopen($fileName, "r");
	while(!feof($pf)){
		fgets($pf);
		$i++;
	}
	return i;
}

function insert_element($nEl){
	$s=";";
	
	$elString=$nEl+1.$s
	.$_POST["surname"].$s
	.$_POST["name"]+$s
	.$_POST["address"]+$s
	.$_POST["city"])+"\r\n";
	
	$pf=fopen("db-data/rubrica.txt", "a");
	fputs($pf, $elString);
	
	fclose($pf);
}

?>