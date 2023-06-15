package com.example.application.ports.outbound.repository.persistence;

import com.example.product.domain.aggregateroots.ReturnProductDomainEntity;

import java.util.List;

public interface ReturnProductRepositoryOutboundPort {
	List<ReturnProductDomainEntity> getProductByCatalogId(String catalogId);
	void createProduct(ReturnProductDomainEntity product);
}
