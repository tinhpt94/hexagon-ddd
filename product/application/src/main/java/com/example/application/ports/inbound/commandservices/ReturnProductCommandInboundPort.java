package com.example.application.ports.inbound.commandservices;

import com.example.application.ports.outbound.repository.persistence.ReturnProductRepositoryOutboundPort;
import com.example.product.domain.aggregateroots.ReturnProductDomainEntity;
import com.example.product.domain.commands.CreateProductCommand;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.util.List;

@AllArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class ReturnProductCommandInboundPort {

	ReturnProductRepositoryOutboundPort returnProductRepositoryOutboundPort;

	public ReturnProductDomainEntity createAndReturnProduct(CreateProductCommand createProductCommand) {
		List<ReturnProductDomainEntity> products = returnProductRepositoryOutboundPort
				.getProductByCatalogId(createProductCommand.getCatalogId());
		ReturnProductDomainEntity returnProductDomainEntity = new ReturnProductDomainEntity(products, createProductCommand);
		returnProductRepositoryOutboundPort.createProduct(returnProductDomainEntity);
		return returnProductDomainEntity;
	}

	public List<ReturnProductDomainEntity> getProducts(String catalogId) {
		return returnProductRepositoryOutboundPort.getProductByCatalogId(catalogId);
	}
}
