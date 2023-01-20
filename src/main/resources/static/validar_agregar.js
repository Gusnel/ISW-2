
function agregarestn(){
    var a = document.getElementById("nombre").value;

    
    if(/[^A-Za-zñÑ]$/.test(a)){
        document.getElementById("nombre").value=a.slice(0, a.length -1)
        alert("caracter inválido")
        
    }
}  

function editarestn(){
    var a = document.getElementById("nombre").value;
    
    if(/[^A-Za-zñÑ]$/.test(a)){
        document.getElementById("nombre").value=a.slice(0, a.length -1)
        alert("caracter inválido")
        
    }
} 

function agregarestc(){
    var c = document.getElementById("correo").value;
    

    if(!c.includes("@")){
        document.getElementById("correo").value=""
        alert("escriba un correo válido")
    }



}
function add(){
    var a = document.getElementById("nombre").value;
    var b = document.getElementById("password").value;
    var c = document.getElementById("correo").value;
    if(a!=""&&c!=""&&b!="")
    alert("Usuario registrado")
}

function editarest(){
    var a = document.getElementById("nombre").value;
    var c = document.getElementById("correo").value;
    if(a!=""&&c!="")
    alert("Editado con éxito")
}