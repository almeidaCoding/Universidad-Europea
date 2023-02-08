function ColorFondo(color) {
	document.body.style.backgroundColor = color;
}
function generarNuevoColor(){
	let simbolos, color;
	simbolos = "0123456789ABCDEF";
	color = "#";

	for(let i = 0; i < 6; i++){
		color = color + simbolos[Math.floor(Math.random() * 16)];
	}

	document.body.style.background = color;
}