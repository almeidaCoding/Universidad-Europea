function validacionMail() {

  const email = document.getElementById("validarMail");

  //Esto es una experesión regular para validar mails
  const regex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/; 

  //.test() es un método de las expresiones regulares en javascript
  if (!regex.test(email.value)) {
    alert("Ingrese un correo electrónico válido");
    email.value = "";
  }else{
    alert("Bienvenida(o) has ingresado tu mail correctamente");
  }
}