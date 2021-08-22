package CarvajalBusiness.com.co.app.Repository.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import CarvajalBusiness.com.co.app.Repository.ClientResopository;
import CarvajalBusiness.com.co.app.model.Client;

@Service
public class ClientServices {
	
	@Autowired
	private ClientResopository clientresopository;
	
	// Creamos los Cuatro Mètodos basicos que va Tener nuestro Crud
	
	// Metodo de Crear
	public Client create(Client client) {
		return clientresopository.save(client);
		
	}
	
	// Método Listar 
	
	public List<Client> getAllClient() {
		return clientresopository.findAll();
		
	}
	
	// Método para Eliminar
	
	public void delete(Client client) {
		 clientresopository.delete(client);
		
	}
	
	// Metodo para Editar
	public Optional<Client> findById(Long id) {
		return clientresopository.findById(id);
		
	}
		
}
