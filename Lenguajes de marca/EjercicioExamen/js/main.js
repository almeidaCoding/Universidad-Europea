function calcularMedia(){
	let notaLenguajes = parseInt(document.getElementById("lenguajesMarca").value);
	let notaEntornos = parseInt(document.getElementById("entornosDesarrollo").value);
	let notaSistemas = parseInt(document.getElementById("sistemasInformaticos").value);
	let notaBaseDatos = parseInt(document.getElementById("baseDatos").value);
	let notaProgramacion = parseInt(document.getElementById("programacion").value);

	let notaMedia = (notaLenguajes + notaEntornos + notaSistemas + notaBaseDatos + notaProgramacion) / 5;

	document.getElementById("notaMedia").value = notaMedia;

	let suspensos = 0;

	if(notaLenguajes < 5) suspensos++;
	if(notaEntornos < 5) suspensos++;
	if(notaSistemas < 5) suspensos++;
	if(notaBaseDatos < 5) suspensos++;
	if(notaProgramacion < 5) suspensos++;

	document.getElementById("materiasSuspendidas").value = suspensos;

	if(suspensos < 3){
		document.getElementById("promociona").value = "Si";
	}else{
		document.getElementById("promociona").value = "No";
	}
}
