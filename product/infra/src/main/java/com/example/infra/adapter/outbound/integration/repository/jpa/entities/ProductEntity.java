package com.example.infra.adapter.outbound.integration.repository.jpa.entities;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "product")
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProductEntity {
	@Id
	String id;
	String name;
	String image;
	String description;
	double price;
	String currency;
	String catalogId;
	int quantity;
}
