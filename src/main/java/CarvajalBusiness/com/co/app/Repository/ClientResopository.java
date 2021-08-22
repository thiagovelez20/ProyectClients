package CarvajalBusiness.com.co.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import CarvajalBusiness.com.co.app.model.Client;

public interface ClientResopository extends JpaRepository<Client, Long> {

	
}
