<?php
session_start();

if(isset($_POST["submit"])){
	check_inputs($_POST);
	if($_POST["input"]%5==0){
		$_SESSION["val-num-cache"].push($_POST["input"]); //maybe wrong cause "array_push(array, value...)"
	else $_SESSION["output"]="numero non divisibile";
}
?>