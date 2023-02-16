// getElementsByClassName() devuelve una colección de elementos, no puede acceder directamente a la propiedad value del objeto. En su lugar, deberá acceder a la propiedad value de un elemento en particular dentro de la colección. En este ejemplo, se supone que solo hay un elemento con la clase "datosRequeridos", por lo que se accede a su valor utilizando [0].value.

function comprobacion(){
	let datosPersonales = document.getElementsByClassName("datosRequeridos")[0].value;
	

	if(datosPersonales === ''){
		Swal.fire({
		  icon: 'error',
		  title: 'Oops...',
		  text: 'Los campos Nombre, Apellido y Email son obligatórios',
		})
	}else{
		Swal.fire({
		  icon: 'success',
		  title: '¡Bienvenid@! \n Has iniciado sesión correctamente',
		  showConfirmButton: false,
		  timer: 1500
		})
	}
}