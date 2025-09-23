<?php
	include 'include/functions.inc';
	if(isset($_GET['invia'])){
		$numero=$_GET['numero'];
		$divisore=$_GET['divisore'];
		$result=array();

		$errString=checkInput($numero, $divisore);
		if($errString==""){
			$result=compute($numero, $divisore);
		}
		$result=implode($result);
	}
	header("Location: index.php?err=$errString&res=$result");
?>