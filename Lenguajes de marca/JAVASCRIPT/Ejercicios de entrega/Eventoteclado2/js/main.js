function keyUp(event){
	const nombre = document.getElementById("nameUser");

	if(event.key === "Enter"){
		const nombre2 = nombre.value;
		alert("¡Hola " + nombre2 + "! Bienvenido(a) a nuestro sitio web.");
	}
}