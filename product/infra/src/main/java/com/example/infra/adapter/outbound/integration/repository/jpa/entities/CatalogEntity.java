package com.example.infra.adapter.outbound.integration.repository.jpa.entities;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "catalog")
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CatalogEntity {
	@Id
//	@GeneratedValue(generator = "UUID")
//	@GenericGenerator(
//			name = "UUID",
//			strategy = "org.hibernate.id.UUIDGenerator"
//	)
	String id;
	String name;

}
