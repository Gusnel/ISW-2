function agregarcursn(){
    var a = document.getElementById("nombre").value;
    
    if(/[^A-Za-zñÑ]$/.test(a)){
        document.getElementById("nombre").value=a.slice(0, a.length -1)
        alert("caracter inválido")
        
    }
} 
function agregarcursp(){
    var b = document.getElementById("profesor").value;
    
    if(/[^A-Za-zñÑ]$/.test(b)){
        document.getElementById("profesor").value=b.slice(0, b.length -1)
        alert("caracter inválido")
        
        
        
    }
} 
function addcurs(){
    var a = document.getElementById("nombre").value;
    var b = document.getElementById("profesor").value;
    if(a!=""&&b!="")
    alert("Guardado con éxito")
}

function editarcurs(){
    var a = document.getElementById("nombre").value;
    var b = document.getElementById("profesor").value;
    if(a!=""&&b!="")
    alert("Editado con éxito")
}