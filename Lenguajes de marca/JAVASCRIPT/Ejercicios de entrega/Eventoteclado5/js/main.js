function mostrarBoton() {
  const boton = document.getElementById("boton-copiar");
  boton.style.display = "block";
}

function copiarTexto() {
  const textoSeleccionado = window.getSelection().toString();
  const boton = document.getElementById("boton-copiar");
  navigator.clipboard.writeText(textoSeleccionado);
  alert("El texto ha sido copiado al portapapeles.");
}


