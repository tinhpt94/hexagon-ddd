package com.example.product.domain.aggregateroots;

import com.example.product.domain.commands.CreateProductCommand;
import com.example.product.domain.exceptions.business.DuplicatedEntityException;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.util.List;
import java.util.UUID;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
public class ReturnProductDomainEntity {

	String id;
	String name;
	String image;
	String description;
	double price;
	String currency;
	int quantity;
	String catalogId;

	public ReturnProductDomainEntity(List<ReturnProductDomainEntity> existingProducts, CreateProductCommand createProductCommand) {
		boolean isDuplicatedName = existingProducts.stream().anyMatch(product -> product.getName().equalsIgnoreCase(createProductCommand.getName()));
		if (isDuplicatedName) {
			throw new DuplicatedEntityException("Product with name " + createProductCommand.getName() + " already existed");
		}
		this.id = UUID.randomUUID().toString();
		this.name = createProductCommand.getName();
		this.image = createProductCommand.getImage();
		this.description = createProductCommand.getDescription();
		this.price = createProductCommand.getPrice().getValue();
		this.currency = createProductCommand.getPrice().getCurrency();
		this.quantity = createProductCommand.getQuantity();
		this.catalogId = createProductCommand.getCatalogId();
	}
}
