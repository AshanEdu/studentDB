<?php session_start()?>
<form action="logic.php" method="POST" >
	<input type="submit" value="button">
</form>
<a><?php foreach($str in $_SESSION[])?></a> //to finish