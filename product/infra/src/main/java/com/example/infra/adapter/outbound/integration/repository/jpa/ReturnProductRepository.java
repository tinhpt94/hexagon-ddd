package com.example.infra.adapter.outbound.integration.repository.jpa;

import com.example.application.ports.outbound.repository.persistence.ReturnProductRepositoryOutboundPort;
import com.example.infra.adapter.mapper.ProductEntityMapper;
import com.example.product.domain.aggregateroots.ReturnProductDomainEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ReturnProductRepository implements ReturnProductRepositoryOutboundPort {

	@Autowired
	private ProductRepository productRepository;

	@Autowired
	private ProductEntityMapper productEntityMapper;

	@Override
	public List<ReturnProductDomainEntity> getProductByCatalogId(String catalogId) {

		return productRepository.findByCatalogId(catalogId)
				.stream().map(productEntityMapper::toAggregateRoot).collect(Collectors.toList());
	}

	@Override
	public void createProduct(ReturnProductDomainEntity product) {
		productRepository.save(productEntityMapper.toEntity(product));
	}
}
