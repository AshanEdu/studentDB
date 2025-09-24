<?php
session_start();
if(isset($_POST["submit"])){
	if(file_exists("db/file.txt")){
		$pf=fopen("db/file.txt", "w");
		if($pf===false){
			$_SESSION[err].push("Errore, file esiste ma non è possibile aprirla");
		}else{
			$pf
		}
	}else{
		$pf=fopen("db/file.txt", "rw");
		array_push($_SESSION[err], "Errore, file inesistente, creando uno nuovo...", "file creato con successo");
		
	}
}
header("Location: home.php");
?>