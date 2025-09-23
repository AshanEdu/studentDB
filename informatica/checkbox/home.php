<?php include "include/functions.inc"; init_session(); ?>

<form action="logic.php" mode="POST" >
<input name="sport[]" type="checkbox" value="calcio">
<label>calcio</label>
<input name="sport[]" type="checkbox" value="basket">
<label>basket</label>
<input name="sport[]" type="checkbox" value="tennis">
<label>tennis</label>

<input type="submit" value="Salva">
<label for="">Inserire il nome</label>
<input type="button" value="Stampa">
</form>


//explode
<p><?php echo $_SESSION["output"]; ?></p>