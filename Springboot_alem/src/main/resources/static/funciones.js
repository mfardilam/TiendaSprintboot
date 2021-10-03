function eliminar(id){
	swal({
  title: "¿Estás seguro de eliminar?",
  text: "¡Una vez eliminado, no será posible recuperar la información!",
  icon: "warning",
  buttons: true,
	  dangerMode: true,
	})
	.then((OK) => {
	  if (OK) {
		$.ajax({
			url:"/eliminar/"+id,
			success: function(res){
				console.log(res);
				
			}
		});
			swal("El usuario ha sido eliminado!", {
				icon: "success",
			}).then((ok) => {
				if (ok) {
					location.href="/listar";
				}
			})
		} else {
			swal("El usuario está a salvo :)!");
		}
	});

}