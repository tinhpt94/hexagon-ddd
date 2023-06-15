package com.example.product.domain.commands;

import com.example.product.domain.valueobjects.Price;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class CreateProductCommand {
	String name;
	String image;
	String description;
	Price price;
	int categoryId;
}
