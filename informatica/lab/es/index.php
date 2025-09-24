<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<link rel="stylesheet" href="./css/style.css">
	<title>GET exerise</title>
</head>
<body>
	
<form action="logic.php" method="GET">
	<label>inserire numero</label>
	<input type="text" name="numero">
	<br><br>
	<label>inserire divisore</label>
	<input type="text" name="divisore">
	<input type="submit" name="invia" value="calcola">
</form>

<p id=p-result><?php
if(isset($_GET["err"])){
	foreach (str_split($_GET["err"]) as $c){
		switch ($c) {
				case "A":
					echo "Errore, numero non inserito<br>";
					break;
				case "B":
					echo "Errore, numero non un è un valore numerico<br>";
					break;
				case "C":
					echo "Errore, divisore non inserito<br>";
					break;
				case "D":
					echo "Errore, divisore non un è un valore numerico<br>";
					break;
		}
	}
} 
?></p>
<p id=p-result><?php

if(isset($_GET["res"])){
	foreach (str_split($_GET["res"]) as $c){
		if($c=="b"){
			echo "<br>";
		}else echo $c;
	}
}

fopen

?></p>
</body>
</html>