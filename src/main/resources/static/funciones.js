function eliminar(id){
    swal({
        title:"Seguro?",
        text:"Decisión irrevocable!",
        icon:"warning",
        buttons:true,
        dangerMode:true,
        })
        .then((ok)=>{
        if(ok){
            $.ajax({
                url:"/eliminar/"+id,
                success : function(res){
                    console.log(res);
                }
            })
            swal("Eliminado con éxito!", {
            icon:"success",
        }).then((ok)=>{
                if(ok)
                    location.href="/index"

        });
        }else{
        swal("No se ha eliminado!");
        }
        });


}
function clean(){
    window.location='/index'
}


function eliminarc(id){
    swal({
        title:"Seguro?",
        text:"Decisión irrevocable!",
        icon:"warning",
        buttons:true,
        dangerMode:true,
        })
        .then((ok)=>{
        if(ok){
            $.ajax({
                url:"/eliminarc/"+id,
                success : function(res){
                    console.log(res);
                }
            })
            swal("Eliminado con éxito!", {
            icon:"success",
        }).then((ok)=>{
                if(ok)
                    location.href="/adm_curso"

        });
        }else{
        swal("No se ha eliminado!");
        }
        });


}
function clean(){
    window.location='/adm_curso'
}