package CarvajalBusiness.com.co.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Client")

public class Client {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	// Creamos las propiedades que va tener la Base de Datos
	private int documentclient;
	private String nameclient;
	private String  firtsname;
	private String ciudad;
	private String direction;
	private int Age;
	private double valortarjeta;
	private int carnumber;
	private String state;
	
	
	
	// Creamos el Constructor vacio con la Clase Client
	public Client(Long id, int documentclient, String nameclient, String firtsname, String ciudad, String direction,
			int age, double valortarjeta) {
	
		this.id = id;
		this.documentclient = documentclient;
		this.nameclient = nameclient;
		this.firtsname = firtsname;
		this.ciudad = ciudad;
		this.direction = direction;
		this.Age = age;
		this.valortarjeta = valortarjeta;
		this.carnumber = carnumber;
		this.state = state;
	}
	
	// Creamos los Mètodos Get y Set con las Propiedades Creadas Anterior 
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getDocumentclient() {
		return documentclient;
	}

	public void setDocumentclient(int documentclient) {
		this.documentclient = documentclient;
	}

	public String getNameclient() {
		return nameclient;
	}

	public void setNameclient(String nameclient) {
		this.nameclient = nameclient;
	}

	public String getFirtsname() {
		return firtsname;
	}

	public void setFirtsname(String firtsname) {
		this.firtsname = firtsname;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public double getValortarjeta() {
		return valortarjeta;
	}

	public void setValortarjeta(double valortarjeta) {
		this.valortarjeta = valortarjeta;
	}

	public int getCarnumber() {
		return carnumber;
	}

	public void setCarnumber(int carnumber) {
		this.carnumber = carnumber;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
