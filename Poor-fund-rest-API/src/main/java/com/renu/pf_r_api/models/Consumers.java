package com.renu.pf_r_api.models;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.web.multipart.MultipartFile;
@Entity
public class Consumers extends BaseConsumers<Long> {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String piCode;
	private String apiCode;
	@NotBlank(message = "Enter your  name")
	private String name;
	@NotBlank(message = "Your country")
	private String country;
	@NotBlank(message = "Enter your zila")
	private String zila;
	@NotBlank(message = "Enter your upozila")
	private String upozila;
	@NotBlank(message = "Enter your union")
	private String union;
	@NotBlank(message = "Enter your work")
	private String work;
	@NotBlank
	@Size(min=11,max=11,message="Enter a phone number")
	private String contact;
	@NotBlank(message = "Enter bkash/rocket number")
	private String bkash;
	@Override
	public Long getId() {
		return id;
	}
	
	
	public Consumers() {
		this.piCode = "PI" + UUID.randomUUID().toString().substring(26).toUpperCase();
		this.apiCode = "API" + UUID.randomUUID().toString().substring(26).toUpperCase();
		
	}


	public Consumers(Long id, String piCode, String apiCode, @NotBlank(message = "Enter your  name") String name,
			@NotBlank(message = "Your country") String country, @NotBlank(message = "Enter your zila") String zila,
			@NotBlank(message = "Enter your upozila") String upozila,
			@NotBlank(message = "Enter your union") String union, @NotBlank(message = "Enter your work") String work,
			@NotBlank @Size(min = 11, max = 11, message = "Enter a phone number") String contact,
			@NotBlank(message = "Enter bkash/rocket number") String bkash) {
		super();
		this.id = id;
		this.piCode = piCode;
		this.apiCode = apiCode;
		this.name = name;
		this.country = country;
		this.zila = zila;
		this.upozila = upozila;
		this.union = union;
		this.work = work;
		this.contact = contact;
		this.bkash = bkash;
	}


	public String getPiCode() {
		return piCode;
	}


	public void setPiCode(String piCode) {
		this.piCode = piCode;
	}


	public String getApiCode() {
		return apiCode;
	}


	public void setApiCode(String apiCode) {
		this.apiCode = apiCode;
	}




	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public String getZila() {
		return zila;
	}


	public void setZila(String zila) {
		this.zila = zila;
	}


	public String getUpozila() {
		return upozila;
	}


	public void setUpozila(String upozila) {
		this.upozila = upozila;
	}


	public String getUnion() {
		return union;
	}


	public void setUnion(String union) {
		this.union = union;
	}


	public String getWork() {
		return work;
	}


	public void setWork(String work) {
		this.work = work;
	}


	public String getContact() {
		return contact;
	}


	public void setContact(String contact) {
		this.contact = contact;
	}


	public String getBkash() {
		return bkash;
	}


	public void setBkash(String bkash) {
		this.bkash = bkash;
	}



	public void setId(Long id) {
		this.id = id;
	}



	@Override
	public String toString() {
		return "Consumers [id=" + id + ", piCode=" + piCode + ", apiCode=" + apiCode + ", name=" + name + ", country="
				+ country + ", zila=" + zila + ", upozila=" + upozila + ", union=" + union + ", work=" + work
				+ ", contact=" + contact + ", bkash=" + bkash + "]";
	}
	
	
	
	
	
	
	
	
	
}
