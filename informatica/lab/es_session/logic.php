<?php
session_start();

if(isset($_POST["submit"])){
	$output=check_inputs($_POST); //can't send var like this
	
	if($output!=0){ //check didn't find errors
		$_SESSION[$output]=$output;
	}else{
		$_SESSION[$output]=$output;
	}
}
?>