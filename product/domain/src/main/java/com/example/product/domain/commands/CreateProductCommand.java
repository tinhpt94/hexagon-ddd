package com.example.product.domain.commands;

import com.example.product.domain.valueobjects.Price;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
public class CreateProductCommand {
	String name;
	String image;
	String description;
	Price price;
	String catalogId;
	int quantity;
}
