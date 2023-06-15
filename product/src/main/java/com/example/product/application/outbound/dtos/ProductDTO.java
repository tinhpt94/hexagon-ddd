package com.example.product.application.outbound.dtos;

import com.example.product.domain.valueobjects.Price;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProductDTO {
	int id;
	String name;
	String image;
	String description;
	Price price;
	int categoryId;
}
