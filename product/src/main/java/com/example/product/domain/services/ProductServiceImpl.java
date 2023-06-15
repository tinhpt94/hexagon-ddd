package com.example.product.domain.services;

import com.example.product.domain.commands.CreateProductCommand;
import com.example.product.domain.commands.DeleteProductCommand;
import com.example.product.domain.commands.UpdateProductCommand;
import com.example.product.domain.entities.Product;
import com.example.product.application.outbound.repositories.ProductProvider;
import com.example.product.domain.queries.GetProductByIdQuery;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

	private final ProductProvider productProvider;

	@Override
	public Product createProduct(CreateProductCommand createProductCommand) {
		return productProvider.createProduct(createProductCommand);
	}

	@Override
	public Product updateProduct(UpdateProductCommand updateProductCommand) {
		return productProvider.updateProduct(updateProductCommand);
	}

	@Override
	public void deleteProduct(DeleteProductCommand deleteProductCommand) {
		productProvider.deleteProduct(deleteProductCommand);
	}

	@Override
	public List<Product> fetchAllProducts() {
		return productProvider.fetchAllProducts();
	}

	@Override
	public Product fetchProductById(GetProductByIdQuery getProductByIdQuery) {
		return productProvider.fetchProductById(getProductByIdQuery);
	}
}
