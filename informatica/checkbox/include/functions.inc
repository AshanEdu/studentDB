<?php

function init_session(){
	session_start();
	if(empty($_SESSION)){
	}else return false;
}

function check_inputs($_POST){
	$outputs=array()
	if(empy($_POST[name])){
		$outputs.push("Errore: nome non inserito");
	}
	return (empty($outputs) ? echo 0 : echo $outputs;
}


?>