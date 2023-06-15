package com.example.application.ports.outbound.repository;

import com.example.product.domain.commands.CreateProductCommand;
import com.example.product.domain.commands.DeleteProductCommand;
import com.example.product.domain.commands.UpdateProductCommand;
import com.example.product.domain.entities.Product;
import com.example.product.domain.queries.FetchProductByIdQuery;

import java.util.List;

public interface ProductUserCase {
	Product createProduct(CreateProductCommand createProductCommand);
	Product updateProduct(UpdateProductCommand updateProductCommand);
	void deleteProduct(DeleteProductCommand deleteProductCommand);
	List<Product> fetchAllProducts();
	Product fetchProductById(FetchProductByIdQuery fetchProductByIdQuery);
}
