<?php include "include/functions.inc"; init_session();?>

<form action="logic.php" method="POST">
<label for="surname">Cognome:</label>
<input type="string" name="surname">
<label for="name">Nome:</label>
<input type="string" name="name">
<label for="address">Indirizzo:</label>
<input type="string" name="address">
<label for="city">Città:</label>
<input type="string" name="city">

<input type="submit" value="stampa">
<input type="submit" value="aggiungi">
</form>



<?php
	echo $_SESSION["err"];
?>