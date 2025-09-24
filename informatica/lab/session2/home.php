<?php include "include/functions.inc"; init_session(); ?>

<form action="logic.php" mode="POST" >
<label for="name">Inserire il nome</label>
<input name="name" type="number">
<label for="surname">Inserire il cognome</label>
<input name="surname" type="number">
<label for="surname">Inserire il cognome</label>
<input name="sex" type="radio">
<input name="sex" type="radio">

<input type="submit" value="Invia">
<input type="button" value="Stampa">
</form>


//explode
<p><?php echo $_SESSION["output"]; ?></p>