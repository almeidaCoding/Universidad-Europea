function calculo(){
	let valor = parseInt(document.getElementById("valor").value);
	let result;
	result = (valor*(9/5))+32;
	document.getElementById("resultado").innerHTML = valor + " ºC en Celsius es equivalente a " + result;
}
function limpiar(){
	document.getElementById("resultado").innerHTML = "" ;
	document.getElementById("valor").innerHTML = "" ;
}