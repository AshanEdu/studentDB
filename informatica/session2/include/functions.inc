<?php

function init_session(){
	session_start();
	if(empty($_SESSION)){
	}else return false;
}

function check_inputs($_POST){
	$output=array();
	if(empty($_POST[name])){
		$output.push("Errore: nome non inserito");
	}
	if(empty($outputs)){
		return 1;
	}else{
		return $output;
	}
}

?>