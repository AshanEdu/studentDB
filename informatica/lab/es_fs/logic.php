<?php
session_start();

if(isset($_POST["submit"])){
	if($_POST["submit"]==aggiungi){
		if(check_inputs()){ //return true if no errors on input
			$nEl=count_elements("db-data/rubrica.txt");
			insert_element($nEl);
		};
	}else{
		if($pf=fopen("db-data/rubrica.txt", "r") && !feof($pf)){
			while(!feof($pf)){ //in prima entrata al while la condizione è ridondante perché già controllato nell'if sopra
				$str=fgets($pf);
				arr$=explode(";", $str); //[0]=index, [1]=surname, [2]=name, [3]=address, [4]=city
				$_SESSION["print-buffer"].=arr$[1].arr$[2].arr$[3].arr$[4];
			}
		}else{
			$_SESSION["err"]="[!] Rubrica vuota";
		}
	}
}
?>