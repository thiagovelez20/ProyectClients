package CarvajalBusiness.com.co.app.Rest;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import CarvajalBusiness.com.co.app.Repository.Services.ClientServices;
import CarvajalBusiness.com.co.app.model.Client;

@RestController
@RequestMapping("/api/client/")

public class ClientRest {
	
	@Autowired
	private ClientServices clientservices;
	
	 // Creamos el PostMapping para guardar los Datos del cliente
	@PostMapping
	private ResponseEntity<Client> save (@RequestBody Client client){
		Client temporal = clientservices.create(client);
		
		try {
			
			return ResponseEntity.created(new URI("/api/client/"+temporal.getId())).body(temporal);
		}catch(Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build(); 
				
			}
		}
		
		// Creamos el GetMapping para Listar todos los clientes
		
		@GetMapping
		private ResponseEntity<List<Client>> listarclients() {
			
				return ResponseEntity.ok(clientservices.getAllClient());
		}
		
		// Creamos DeleteMapping para Eliminiar el cliente por medio de Mapeo 
		
		@DeleteMapping
		private ResponseEntity<Void> DeletClient(@RequestBody Client client){
			clientservices.delete(client);
			return ResponseEntity.ok().build();
			
		}
		
		// Creamos el GetMapping con Optional para Buscar los clientes
		
		@GetMapping (value= "{id}")
		private ResponseEntity<Optional<Client>> ListClientbyId(@PathVariable("id") Long id){
			return ResponseEntity.ok(clientservices.findById(id));
		}
		
	

}
