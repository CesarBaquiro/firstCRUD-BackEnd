package com.example.demo.models;

import jakarta.persistence.*;


@Entity
@Table(name = "cars")
public class CarModel {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		@Column(unique = true, nullable = false)
		private Long idcars;
		private String license;
	
	
		
//		@ManyToOne
//		@JoinColumn(name="idspecs")
		private CarSpecsModel brand;
		private CarSpecsModel reference;
		private CarSpecsModel weight;
		private CarSpecsModel height;
		private CarSpecsModel width;
		private CarSpecsModel longitude;
		
		public Long getIdcars() {
			return idcars;
		}
		public void setIdcars(Long idcars) {
			this.idcars = idcars;
		}
		public String getLicense() {
			return license;
		}
		public void setLicense(String license) {
			this.license = license;
		}
		public CarSpecsModel getBrand() {
			return brand;
		}
		public void setBrand(CarSpecsModel brand) {
			this.brand = brand;
		}
		public CarSpecsModel getReference() {
			return reference;
		}
		public void setReference(CarSpecsModel reference) {
			this.reference = reference;
		}
		public CarSpecsModel getWeight() {
			return weight;
		}
		public void setWeight(CarSpecsModel weight) {
			this.weight = weight;
		}
		public CarSpecsModel getHeight() {
			return height;
		}
		public void setHeight(CarSpecsModel height) {
			this.height = height;
		}
		public CarSpecsModel getWidth() {
			return width;
		}
		public void setWidth(CarSpecsModel width) {
			this.width = width;
		}
		public CarSpecsModel getLongitude() {
			return longitude;
		}
		public void setLongitude(CarSpecsModel longitude) {
			this.longitude = longitude;
		}
		
		public CarModel(String license, CarSpecsModel brand, CarSpecsModel reference, CarSpecsModel weight,
				CarSpecsModel height, CarSpecsModel width, CarSpecsModel longitude) {
			super();
			this.license = license;
			this.brand = brand;
			this.reference = reference;
			this.weight = weight;
			this.height = height;
			this.width = width;
			this.longitude = longitude;
		}
	
			
}
