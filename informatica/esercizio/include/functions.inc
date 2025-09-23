<?php
function checkInput($numero, $divisore){
	$output="";
		if(empty($numero)){
			$output.="A";  //"Errore, numero non inserito<br>";
		}else if(!is_numeric($numero)){
			$output.="B"; //"Errore, numero non un è un valore numerico<br>";
		}if(empty($divisore)){
			$output.="C"; //Errore, divisore non inserito<br>";
		}else if(!is_numeric($numero)){
			$output.="D"; //"Errore, divisore non un è un valore numerico<br>";
		}
	return $output;
}

function compute($numero, $divisore){
    $output=array();
	for($i=$divisore; $i<=$numero; $i+=$divisore){
		array_push($output, $i, "b");
        //$output.=$i."b"; old String conversion GET
	}
	return $output;
}
?>