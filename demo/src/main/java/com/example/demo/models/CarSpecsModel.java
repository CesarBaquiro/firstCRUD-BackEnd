package com.example.demo.models;



import jakarta.persistence.*;


@Entity
@Table(name = "car_specs")
public class CarSpecsModel {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		@Column(unique = true, nullable = false)
		private Long idspecs;
		private String brand;
		private String reference;
		private Integer weight;
		private float height;
		private float width;
		private float longitude;
		
		public Long getIdspecs() {
			return idspecs;
		}
		public void setIdspecs(Long idspecs) {
			this.idspecs = idspecs;
		}
		public String getBrand() {
			return brand;
		}
		public void setBrand(String brand) {
			this.brand = brand;
		}
		public String getReference() {
			return reference;
		}
		public void setReference(String reference) {
			this.reference = reference;
		}
		public Integer getWeight() {
			return weight;
		}
		public void setWeight(Integer weight) {
			this.weight = weight;
		}
		public float getHeight() {
			return height;
		}
		public void setHeight(float height) {
			this.height = height;
		}
		public float getWidth() {
			return width;
		}
		public void setWidth(float width) {
			this.width = width;
		}
		public float getLongitude() {
			return longitude;
		}
		public void setLongitude(float longitude) {
			this.longitude = longitude;
		}
		
		public CarSpecsModel(String brand, String reference, Integer weight, float height, float width,
				float longitude) {
			super();
			this.brand = brand;
			this.reference = reference;
			this.weight = weight;
			this.height = height;
			this.width = width;
			this.longitude = longitude;
		}
		
	
		
}
