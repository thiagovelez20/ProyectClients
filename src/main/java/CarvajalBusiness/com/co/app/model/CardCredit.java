package CarvajalBusiness.com.co.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.crypto.Data;

@Entity
@Table(name= "cardcredit")

public class CardCredit {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	// Creamos las propiedades que va tener la Base de Datos
	private String nameclient;
	private String  firtsname;
	private Data creadate;
	public CardCredit(Long id, String nameclient, String firtsname, Data creadate) {
		super();
		this.id = id;
		this.nameclient = nameclient;
		this.firtsname = firtsname;
		this.creadate = creadate;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public Data getCreadate() {
		return creadate;
	}
	public void setCreadate(Data creadate) {
		this.creadate = creadate;
	}
	
	
	

}
