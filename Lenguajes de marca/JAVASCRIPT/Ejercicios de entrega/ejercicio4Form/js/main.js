// getElementsByClassName() devuelve una colección de elementos, no puede acceder directamente a la propiedad value del objeto. En su lugar, deberá acceder a la propiedad value de un elemento en particular dentro de la colección. En este ejemplo, se supone que solo hay un elemento con la clase "datosRequeridos", por lo que se accede a su valor utilizando [0].value.

function comprobacion(){

	//Esta variable captura los datos desde la posición ''0'' de los objetos que tengan la clase "datosRequeridos"
	let datosPersonales = document.getElementsByClassName("datosRequeridos")[0].value;

	//Esta variable captura los datos del input password que tiene el id ''pass''
	let password = document.getElementById("pass").value;

	//Esta variable mide la longitud de la variable password
	let passLong = password.length;

	//Esta variable guarda la password correcta que debe introducir el usuario
	let passValid = "457820";

	//Esta variable va a mostrar el nombre del usuario en los mensajes de alerta
	let nomUser = document.getElementsByClassName("datosRequeridos")[0].value;

	//Esta variable es para capturar el valor del checbox si esta marcado o no
	let checkbox = document.getElementById("termsconditions");
	
	

	if(datosPersonales !== "" && password !== "" && parseInt(password) === parseInt(passValid) &&passLong >= 6){

			if(checkbox.checked){
				Swal.fire({
				  icon: 'success',
				  title: '¡Bienvenid@ ' + nomUser + '!\nHas 	iniciado sesión correctamente',
				  showConfirmButton: false,
				  timer: 3000
				})
				return true;
			}else{
				Swal.fire({
			      icon: 'error',
			      title: 'Oops...',
			      text: 'Es necesario aceptar los términos y condiciones',
			    })
			}
	}else if (datosPersonales == ""){
		Swal.fire({
		  icon: 'error',
		  title: 'Oops...',
		  text: 'Es necesario cumplimentar todos los campos',
		})
	}else{
		
		if(passLong < 6){
			Swal.fire({
			  icon: 'error',
			  title: 'Oops...',
			  text: 'La contraseña debe tener por lo menos 6 caracteres',
			})
		}
	}
}
function charTextArea(){
	let textArea = document.getElementById("comentUser").value;
	let longitud = textArea.length;

	if(longitud > 50){
		Swal.fire({
		  title: '¡Cuidado!',
		  text: "Has ultrapasado los caracteres 		disponibles en la caja de 			comentários",
		  icon: 'warning',
		  confirmButtonColor: '#3085d6',
		  cancelButtonColor: '#d33',
		  confirmButtonText: 'Volver'
		})
	}
}

function contenedorFunctions(){
	comprobacion();
	charTextArea();
}