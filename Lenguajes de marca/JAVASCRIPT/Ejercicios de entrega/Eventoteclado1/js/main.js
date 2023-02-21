function respGris(event){
	if (event.key === "G") {
		Swal.fire({
		  icon: 'success',
		  title: '¡Correcto! la respuesta es Gris',
		  showConfirmButton: false,
		  timer: 1500
		})
	}else{
		Swal.fire({
		  icon: 'error',
		  title: 'Lo siento... Vuelve a intentarlo',
		})
	}
}
function respBlanco(event){
	if (event.key === "B") {
		Swal.fire({
		  icon: 'success',
		  title: '¡Correcto! la respuesta es Blanco',
		  showConfirmButton: false,
		  timer: 1500
		})
	}else{
		Swal.fire({
		  icon: 'error',
		  title: 'Lo siento... Vuelve a intentarlo',
		})
	}
}
function respVerde(event){
	if (event.key === "V") {
		Swal.fire({
		  icon: 'success',
		  title: '¡Correcto! la respuesta es Verde',
		  showConfirmButton: false,
		  timer: 1500
		})
	}else{
		Swal.fire({
		  icon: 'error',
		  title: 'Lo siento... Vuelve a intentarlo',
		})
	}
}
function respRojo(event){
	if (event.key === "R") {
		Swal.fire({
		  icon: 'success',
		  title: '¡Correcto! la respuesta es Rojo',
		  showConfirmButton: false,
		  timer: 1500
		})
	}else{
		Swal.fire({
		  icon: 'error',
		  title: 'Lo siento... Vuelve a intentarlo',
		})
	}
}